package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the priority_updation database table.
 * 
 */
@Entity
@Table(name="priority_updation")
@NamedQuery(name="PriorityUpdation.findAll", query="SELECT p FROM PriorityUpdation p")
public class PriorityUpdation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pu_id")
	private int puId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	@Column(name="pu_percentage")
	private String puPercentage;

	@Column(name="pu_type")
	private String puType;

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

	public PriorityUpdation() {
	}

	public int getPuId() {
		return this.puId;
	}

	public void setPuId(int puId) {
		this.puId = puId;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getPuPercentage() {
		return this.puPercentage;
	}

	public void setPuPercentage(String puPercentage) {
		this.puPercentage = puPercentage;
	}

	public String getPuType() {
		return this.puType;
	}

	public void setPuType(String puType) {
		this.puType = puType;
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