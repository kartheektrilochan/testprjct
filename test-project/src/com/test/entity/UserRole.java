package com.test.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the USER_ROLES database table.
 * 
 */
@Entity
@Table(name="USER_ROLES")
@NamedQuery(name="UserRole.findAll", query="SELECT u FROM UserRole u")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	private Object createddate;

	private String emailid;

	private BigDecimal failurecounts;

	private String isactive;

	private Object lastlogin;

	private Object lastupdated;

	private String password;

	@Column(name="\"ROLE\"")
	private String role;

	private String username;

	public UserRole() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Object createddate) {
		this.createddate = createddate;
	}

	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public BigDecimal getFailurecounts() {
		return this.failurecounts;
	}

	public void setFailurecounts(BigDecimal failurecounts) {
		this.failurecounts = failurecounts;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public Object getLastlogin() {
		return this.lastlogin;
	}

	public void setLastlogin(Object lastlogin) {
		this.lastlogin = lastlogin;
	}

	public Object getLastupdated() {
		return this.lastupdated;
	}

	public void setLastupdated(Object lastupdated) {
		this.lastupdated = lastupdated;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}