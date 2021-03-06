package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	
	private String country;
	
	private String favoriteLanguage;
    private LinkedHashMap<String, String> favoriteLanguageOptions;
    
    private String[] operatingSystems;
	
	//private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		 // populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        //
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");        
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

	/**
	 * @return the favoriteLanguageOptions
	 */
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	/**
	 * @param favoriteLanguageOptions the favoriteLanguageOptions to set
	 */
	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	/**
	 * @return the operatingSystems
	 */
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	/**
	 * @param operatingSystems the operatingSystems to set
	 */
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	
}
