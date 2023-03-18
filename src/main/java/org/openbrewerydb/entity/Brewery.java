package org.openbrewerydb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brewery {

	@JsonProperty("country")
	private String country;

	@JsonProperty("brewery_type")
	private String breweryType;

	@JsonProperty("city")
	private String city;

	@JsonProperty("address_2")
	private Object address2;

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("address_3")
	private Object address3;

	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("website_url")
	private String websiteUrl;

	@JsonProperty("updated_at")
	private String updatedAt;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("street")
	private String street;

	@JsonProperty("name")
	private String name;

	@JsonProperty("county_province")
	private Object countyProvince;

	@JsonProperty("id")
	private String id;

	@JsonProperty("state")
	private String state;

	@JsonProperty("postal_code")
	private String postalCode;

	@JsonProperty("longitude")
	private String longitude;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setBreweryType(String breweryType){
		this.breweryType = breweryType;
	}

	public String getBreweryType(){
		return breweryType;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setAddress2(Object address2){
		this.address2 = address2;
	}

	public Object getAddress2(){
		return address2;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setAddress3(Object address3){
		this.address3 = address3;
	}

	public Object getAddress3(){
		return address3;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setWebsiteUrl(String websiteUrl){
		this.websiteUrl = websiteUrl;
	}

	public String getWebsiteUrl(){
		return websiteUrl;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setStreet(String street){
		this.street = street;
	}

	public String getStreet(){
		return street;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCountyProvince(Object countyProvince){
		this.countyProvince = countyProvince;
	}

	public Object getCountyProvince(){
		return countyProvince;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"Planet{" + 
			"country = '" + country + '\'' + 
			",brewery_type = '" + breweryType + '\'' + 
			",city = '" + city + '\'' + 
			",address_2 = '" + address2 + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",address_3 = '" + address3 + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",website_url = '" + websiteUrl + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",phone = '" + phone + '\'' + 
			",street = '" + street + '\'' + 
			",name = '" + name + '\'' + 
			",county_province = '" + countyProvince + '\'' + 
			",id = '" + id + '\'' + 
			",state = '" + state + '\'' + 
			",postal_code = '" + postalCode + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}
