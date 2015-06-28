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
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "sharemyoffice")
public class User implements java.io.Serializable {

	private Integer id;
	private String username;
	private String emailId;
	private String password;
	private int contactNumber;
	private Set<OfficeInfo> officeInfos = new HashSet<OfficeInfo>();

	public User() {
	}

	public User(String username, String emailId, String password,
			int contactNumber) {
		this.username = username;
		this.emailId = emailId;
		this.password = password;
		this.contactNumber = contactNumber;
	}

	public User(String username, String emailId, String password,
			int contactNumber, Set<OfficeInfo> officeInfos) {
		this.username = username;
		this.emailId = emailId;
		this.password = password;
		this.contactNumber = contactNumber;
		this.officeInfos = officeInfos;
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

	@Column(name = "username", nullable = false, length = 100)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "email_id", nullable = false, length = 100)
	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "password", nullable = false, length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "contact_number", nullable = false)
	public int getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<OfficeInfo> getOfficeInfos() {
		return this.officeInfos;
	}

	public void setOfficeInfos(Set<OfficeInfo> officeInfos) {
		this.officeInfos = officeInfos;
	}

}
