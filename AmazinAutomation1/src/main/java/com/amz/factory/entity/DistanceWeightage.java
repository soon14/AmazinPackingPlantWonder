package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the distance_weightage database table.
 * 
 */
@Entity
@Table(name="distance_weightage")
@NamedQuery(name="DistanceWeightage.findAll", query="SELECT d FROM DistanceWeightage d")
public class DistanceWeightage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dw_id")
	private int dwId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	@Column(name="dw_max_dis")
	private String dwMaxDis;

	@Column(name="dw_min_dis")
	private String dwMinDis;

	@Column(name="dw_weightage")
	private String dwWeightage;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_on")
	private Date updatedOn;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="added_by")
	private UserDetail userDetail1;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="updated_by")
	private UserDetail userDetail2;

	public DistanceWeightage() {
	}

	public int getDwId() {
		return this.dwId;
	}

	public void setDwId(int dwId) {
		this.dwId = dwId;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getDwMaxDis() {
		return this.dwMaxDis;
	}

	public void setDwMaxDis(String dwMaxDis) {
		this.dwMaxDis = dwMaxDis;
	}

	public String getDwMinDis() {
		return this.dwMinDis;
	}

	public void setDwMinDis(String dwMinDis) {
		this.dwMinDis = dwMinDis;
	}

	public String getDwWeightage() {
		return this.dwWeightage;
	}

	public void setDwWeightage(String dwWeightage) {
		this.dwWeightage = dwWeightage;
	}

	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public UserDetail getUserDetail1() {
		return this.userDetail1;
	}

	public void setUserDetail1(UserDetail userDetail1) {
		this.userDetail1 = userDetail1;
	}

	public UserDetail getUserDetail2() {
		return this.userDetail2;
	}

	public void setUserDetail2(UserDetail userDetail2) {
		this.userDetail2 = userDetail2;
	}

}