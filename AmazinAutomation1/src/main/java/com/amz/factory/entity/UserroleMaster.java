package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the userrole_master database table.
 * 
 */
@Entity
@Table(name="userrole_master")
@NamedQuery(name="UserroleMaster.findAll", query="SELECT u FROM UserroleMaster u")
public class UserroleMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String userrole;

	//bi-directional many-to-one association to UserDetail
	@OneToMany(mappedBy="userroleMaster")
	private List<UserDetail> userDetails;

	public UserroleMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserrole() {
		return this.userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public List<UserDetail> getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(List<UserDetail> userDetails) {
		this.userDetails = userDetails;
	}

	public UserDetail addUserDetail(UserDetail userDetail) {
		getUserDetails().add(userDetail);
		userDetail.setUserroleMaster(this);

		return userDetail;
	}

	public UserDetail removeUserDetail(UserDetail userDetail) {
		getUserDetails().remove(userDetail);
		userDetail.setUserroleMaster(null);

		return userDetail;
	}

}