package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the fleet_type_weightage database table.
 * 
 */
@Entity
@Table(name="fleet_type_weightage")
@NamedQuery(name="FleetTypeWeightage.findAll", query="SELECT f FROM FleetTypeWeightage f")
public class FleetTypeWeightage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ftw_id")
	private int ftwId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	@Column(name="ftw_type")
	private String ftwType;

	@Column(name="ftw_weightage")
	private String ftwWeightage;

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

	public FleetTypeWeightage() {
	}

	public int getFtwId() {
		return this.ftwId;
	}

	public void setFtwId(int ftwId) {
		this.ftwId = ftwId;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getFtwType() {
		return this.ftwType;
	}

	public void setFtwType(String ftwType) {
		this.ftwType = ftwType;
	}

	public String getFtwWeightage() {
		return this.ftwWeightage;
	}

	public void setFtwWeightage(String ftwWeightage) {
		this.ftwWeightage = ftwWeightage;
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