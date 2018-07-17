package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	
	private String country;
	
	private String favoriteLanguage;
	
	//private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		//populate country options: used ISO country code
		/*countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR","Brazil");
		countryOptions.put("FR","France");
		countryOptions.put("DE","Germany");
		countryOptions.put("IN","India");
		countryOptions.put("US","United States of America");*/
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the favoriteLanguage
	 */
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	/**
	 * @param favoriteLanguage the favoriteLanguage to set
	 */
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	
}
