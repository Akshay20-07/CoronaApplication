package com.personal.health.coronaservice.config;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigTemplate {
	
	@Bean
	public ResponseEntity<String> restTemplate(){
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "https://coronavirus-monitor.p.rapidapi.com/coronavirus/cases_by_country.php";
	    URI uri = null;
		try {
			uri = new URI(baseUrl);
		} catch (URISyntaxException e) {
			System.out.println(e);
		}
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("x-rapidapi-host", "coronavirus-monitor.p.rapidapi.com");  
	    headers.set("x-rapidapi-key", "24c18b7f8fmsh7e481b3334c851cp1d42d0jsnb062f39da52e");
	 
	    HttpEntity<String> requestEntity = new HttpEntity<>("body", headers);
	     
		return restTemplate.exchange(uri, HttpMethod.GET, requestEntity, String.class);
	  
	}

}
