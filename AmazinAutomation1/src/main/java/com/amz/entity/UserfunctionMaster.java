package com.amz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="userfunction_master")
@Entity
public class UserfunctionMaster
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_details_id")
	private String username;
	
	@Column(name =  "function_master_id")
	private String passsword;
	
	
	@Column(name =  "userrole_master_id")
	private String totalQty;
	
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
	private String loginType;
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
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public String getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(String totalQty) {
		this.totalQty = totalQty;
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

}
