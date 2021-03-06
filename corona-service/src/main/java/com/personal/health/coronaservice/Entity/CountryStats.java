package com.personal.health.coronaservice.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountryStats {
	
	@SerializedName("country_name")
    @Expose
    String countryName;
	@SerializedName("cases")
    @Expose
    String cases;
	@SerializedName("deaths")
    @Expose
    String deaths;
	@SerializedName("region")
    @Expose
    String region;
	@SerializedName("total_recovered")
    @Expose
    String totalRecovered;
	@SerializedName("new_deaths")
    @Expose
    String newDeaths;
	@SerializedName("new_cases")
    @Expose
    String newCases;
	@SerializedName("serious_critical")
    @Expose
    String seriousCritical;
	@SerializedName("active_cases")
    @Expose
    String activeCases;
	@SerializedName("total_cases_per_1m_population")
    @Expose
    String totalCasesPer1mPopulation;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCases() {
		return cases;
	}
	public void setCases(String cases) {
		this.cases = cases;
	}
	public String getDeaths() {
		return deaths;
	}
	public void setDeaths(String deaths) {
		this.deaths = deaths;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getTotalRecovered() {
		return totalRecovered;
	}
	public void setTotalRecovered(String totalRecovered) {
		this.totalRecovered = totalRecovered;
	}
	public String getNewDeaths() {
		return newDeaths;
	}
	public void setNewDeaths(String newDeaths) {
		this.newDeaths = newDeaths;
	}
	public String getNewCases() {
		return newCases;
	}
	public void setNewCases(String newCases) {
		this.newCases = newCases;
	}
	public String getSeriousCritical() {
		return seriousCritical;
	}
	public void setSeriousCritical(String seriousCritical) {
		this.seriousCritical = seriousCritical;
	}
	public String getActiveCases() {
		return activeCases;
	}
	public void setActiveCases(String activeCases) {
		this.activeCases = activeCases;
	}
	public String getTotalCasesPer1mPopulation() {
		return totalCasesPer1mPopulation;
	}
	public void setTotalCasesPer1mPopulation(String totalCasesPer1mPopulation) {
		this.totalCasesPer1mPopulation = totalCasesPer1mPopulation;
	}
	@Override
	public String toString() {
		return "CountryStats [countryName=" + countryName + ", cases=" + cases + ", deaths=" + deaths + ", region="
				+ region + ", totalRecovered=" + totalRecovered + ", newDeaths=" + newDeaths + ", newCases=" + newCases
				+ ", seriousCritical=" + seriousCritical + ", activeCases=" + activeCases
				+ ", totalCasesPer1mPopulation=" + totalCasesPer1mPopulation + "]";
	}
    
	

}
