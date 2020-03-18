package com.personal.health.coronaservice.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.personal.health.coronaservice.Entity.CountryStats;
import com.personal.health.coronaservice.Entity.World;
import com.personal.health.coronaservice.config.ConfigTemplate;

@RestController
@RequestMapping("/rest/health")
public class CoronaResource {
	
	@Autowired
	ConfigTemplate restTemp;
	
	@GetMapping("/{country}")
	public List<List<String>> getData(@PathVariable("country") final String country){
		
		String jsonResponse=restTemp.restTemplate().getBody();

		Gson gson = new Gson();
		World exp = gson.fromJson(jsonResponse,World.class);
		List<CountryStats> countyStatsList=exp.getCountriesStat();
		
		return countyStatsList
				.stream()
				.filter(x -> x.getCountryName().equalsIgnoreCase(country))
				.map(this::countryStatus)
				.collect(Collectors.toList());
		
	}
	private List<String> countryStatus(CountryStats country){
		List<String> ls= new ArrayList<>();
		ls.add(country.getDeaths());
		return ls;
		
	}

}
