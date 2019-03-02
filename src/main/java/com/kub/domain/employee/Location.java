package com.kub.domain.employee;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity


public class Location {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="location_id",nullable=false,unique=true)
	private Long locationId;
	@Column(length= 25)
	private String streetAdress;
	
	@Column(name="postalCode")
	private int postalCode;
	
	private String city;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="location")
	private List<Department> departments;
	
	public Location() {
}
	public Location(Long locationId, String street, int postalCode, String city, List<Department> department) {
		super();
		locationId = locationId;
		streetAdress = street;
		this.postalCode = postalCode;
		this.city = city;
		this.departments = departments;
	}
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		locationId = locationId;
	}
	public String getStreet() {
		return streetAdress;
	}
	public void setStreet(String street) {
		streetAdress = street;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Department> getDepartment() {
		return departments;
	}
	public void setDepartment(List<Department> department) {
		this.departments = department;
	}
	
	
	
	
}
