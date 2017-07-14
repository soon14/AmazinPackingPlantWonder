package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_login_details database table.
 * 
 */
@Entity
@Table(name="user_login_details")
@NamedQuery(name="UserLoginDetail.findAll", query="SELECT u FROM UserLoginDetail u")
public class UserLoginDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="uld_id")
	private int uldId;

	@Column(name="uld_ip_add")
	private String uldIpAdd;

	@Column(name="uld_is_active")
	private String uldIsActive;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="uld_loggedin_on")
	private Date uldLoggedinOn;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="uld_user_id")
	private UserDetail userDetail;

	public UserLoginDetail() {
	}

	public int getUldId() {
		return this.uldId;
	}

	public void setUldId(int uldId) {
		this.uldId = uldId;
	}

	public String getUldIpAdd() {
		return this.uldIpAdd;
	}

	public void setUldIpAdd(String uldIpAdd) {
		this.uldIpAdd = uldIpAdd;
	}

	public String getUldIsActive() {
		return this.uldIsActive;
	}

	public void setUldIsActive(String uldIsActive) {
		this.uldIsActive = uldIsActive;
	}

	public Date getUldLoggedinOn() {
		return this.uldLoggedinOn;
	}

	public void setUldLoggedinOn(Date uldLoggedinOn) {
		this.uldLoggedinOn = uldLoggedinOn;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}