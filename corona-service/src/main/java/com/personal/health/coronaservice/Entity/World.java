package com.personal.health.coronaservice.Entity;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class World {


	@SerializedName("countries_stat")
    @Expose
	List<CountryStats> countriesStat;

	public List<CountryStats> getCountriesStat() {
		return countriesStat;
	}

	public void setCountriesStat(List<CountryStats> countriesStat) {
		this.countriesStat = countriesStat;
	}

	@Override
	public String toString() {
		return "World [countriesStat=" + countriesStat + "]";
	}
	
	



}
