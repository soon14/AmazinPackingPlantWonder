package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the user_details database table.
 * 
 */
@Entity
@Table(name="user_details")
@NamedQuery(name="UserDetail.findAll", query="SELECT u FROM UserDetail u")
public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="added_by")
	private String addedBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="is_active")
	private String isActive;

	@Column(name="last_updated")
	private Timestamp lastUpdated;

	@Column(name="login_type")
	private String loginType;

	private String password;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="user_type")
	private String userType;

	private String username;

	//bi-directional many-to-one association to UserroleMaster
	@ManyToOne
	@JoinColumn(name="userrole_master_id")
	private UserroleMaster userroleMaster;

	//bi-directional many-to-one association to UserfunctionMaster
//	@OneToMany(mappedBy="userDetail")
//	private List<UserfunctionMaster> userfunctionMasters;

	public UserDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddedBy() {
		return this.addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Timestamp getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getLoginType() {
		return this.loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserroleMaster getUserroleMaster() {
		return this.userroleMaster;
	}

	public void setUserroleMaster(UserroleMaster userroleMaster) {
		this.userroleMaster = userroleMaster;
	}

//	public List<UserfunctionMaster> getUserfunctionMasters() {
//		return this.userfunctionMasters;
//	}
//
//	public void setUserfunctionMasters(List<UserfunctionMaster> userfunctionMasters) {
//		this.userfunctionMasters = userfunctionMasters;
//	}
//
//	public UserfunctionMaster addUserfunctionMaster(UserfunctionMaster userfunctionMaster) {
//		getUserfunctionMasters().add(userfunctionMaster);
//		userfunctionMaster.setUserDetail(this);
//
//		return userfunctionMaster;
//	}
//
//	public UserfunctionMaster removeUserfunctionMaster(UserfunctionMaster userfunctionMaster) {
//		getUserfunctionMasters().remove(userfunctionMaster);
//		userfunctionMaster.setUserDetail(null);
//
//		return userfunctionMaster;
//	}

}