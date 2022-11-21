package org.openmrs.module.birthnotification2.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "y_mother")
public class Mother {
	
	@Id
	@GeneratedValue
	@Column
	private Integer id;
	
	@Basic
	@Column
	private int parity;
	
	@Basic
	@Column
	private int age;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String nationalId;
	
	@Basic
	@Column(columnDefinition = "BOOLEAN DEFAULT false")
	private Boolean voided;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String givenName;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String surname;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String village;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String subcounty;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String district;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getParity() {
		return parity;
	}
	
	public void setParity(int parity) {
		this.parity = parity;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getNationalId() {
		return nationalId;
	}
	
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
	public String getGivenName() {
		return givenName;
	}
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getVillage() {
		return village;
	}
	
	public void setVillage(String village) {
		this.village = village;
	}
	
	public String getSubcounty() {
		return subcounty;
	}
	
	public void setSubcounty(String subcounty) {
		this.subcounty = subcounty;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public Boolean getVoided() {
		return voided;
	}
	
	public void setVoided(Boolean voided) {
		this.voided = voided;
	}
	
}
