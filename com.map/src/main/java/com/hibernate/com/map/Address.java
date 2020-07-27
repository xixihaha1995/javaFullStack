package com.hibernate.com.map;

public class Address {
	private String aid;
	private String state;
	private String country;
	public Address() {
		System.out.println("Address object created");
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", state=" + state + ", country=" + country + "]";
	}
	
	
	
}
