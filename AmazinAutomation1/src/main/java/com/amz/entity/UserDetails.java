package com.amz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="user_details")
@Entity
public class UserDetails implements Serializable
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name =  "password")
	private String userPassword;
	
	
	
	@Column(name = "is_active")
	private String isActive;


	@Column(name =  "userrole_master_id")
	private String userRoleMasterId;
	
	@Column(name = "created_date")
	private String createdDate;
	@Column(name =  "last_updated")
	private String lastUpdated;
	
	@Column(name = "added_by")
	private String addedBy;

	@Column(name = "updated_by")
	private String updatedBy;
	@Column(name = "user_type")
	private String userType;
	@Column(name = "login_type")
	
	private String login_type;
	@Column(name = "plant_id")
	private String plant_id;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getuserPassword() {
		return userPassword;
	}
	public void setuserPassword(String passsword) {
		this.userPassword = passsword;
	}

	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getUserRoleMasterId() {
		return userRoleMasterId;
	}
	public void setUserRoleMasterId(String userRoleMasterId) {
		this.userRoleMasterId = userRoleMasterId;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	
	public String getPlant_id() {
		return plant_id;
	}
	public void setPlant_id(String plant_id) {
		this.plant_id = plant_id;
	}

}
