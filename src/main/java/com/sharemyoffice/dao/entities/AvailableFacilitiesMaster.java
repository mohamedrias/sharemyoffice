package com.sharemyoffice.dao.entities;

// Generated Jun 27, 2015 4:31:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * AvailableFacilitiesMaster generated by hbm2java
 */
@Entity
@Table(name = "available_facilities_master", catalog = "sharemyoffice")
public class AvailableFacilitiesMaster implements java.io.Serializable {

	private Integer id;
	private String facilitiesName;
	private Set<OfficeFacilities> officeFacilitieses = new HashSet<OfficeFacilities>();

	public AvailableFacilitiesMaster() {
	}

	public AvailableFacilitiesMaster(String facilitiesName) {
		this.facilitiesName = facilitiesName;
	}

	public AvailableFacilitiesMaster(String facilitiesName,
			Set<OfficeFacilities> officeFacilitieses) {
		this.facilitiesName = facilitiesName;
		this.officeFacilitieses = officeFacilitieses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "facilities_name", nullable = false)
	public String getFacilitiesName() {
		return this.facilitiesName;
	}

	public void setFacilitiesName(String facilitiesName) {
		this.facilitiesName = facilitiesName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "availableFacilitiesMaster")
	public Set<OfficeFacilities> getOfficeFacilitieses() {
		return this.officeFacilitieses;
	}

	public void setOfficeFacilitieses(Set<OfficeFacilities> officeFacilitieses) {
		this.officeFacilitieses = officeFacilitieses;
	}

}
