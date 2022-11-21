package org.openmrs.module.birthnotification2.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "y_baby")
public class Baby {
	
	@Id
	@GeneratedValue
	@Column
	private Integer Id;
	
	@Basic
	@Column
	private int weightAtBirth;
	
	@Basic
	@Column(length = 225, nullable = false)
	private String givenName;
	
	@Basic
	@Column
	private Date dateOfBirth;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String facility;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String village;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String district;
	
	@Basic
	@Column(length = 255, nullable = false)
	private String gender;
	
	@Basic
	@Column(columnDefinition = "BOOLEAN DEFAULT false")
	private Boolean voided;
	
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}
	
	public int getWeightAtBirth() {
		return weightAtBirth;
	}
	
	public void setWeightAtBirth(int weightAtBirth) {
		this.weightAtBirth = weightAtBirth;
	}
	
	public String getGivenName() {
		return givenName;
	}
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFacility() {
		return facility;
	}
	
	public void setFacility(String facility) {
		this.facility = facility;
	}
	
	public String getVillage() {
		return village;
	}
	
	public void setVillage(String village) {
		this.village = village;
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
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
