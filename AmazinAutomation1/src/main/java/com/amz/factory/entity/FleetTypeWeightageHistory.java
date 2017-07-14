package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the fleet_type_weightage_history database table.
 * 
 */
@Entity
@Table(name="fleet_type_weightage_history")
@NamedQuery(name="FleetTypeWeightageHistory.findAll", query="SELECT f FROM FleetTypeWeightageHistory f")
public class FleetTypeWeightageHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ftwh_id")
	private int ftwhId;

	@Column(name="ftwh_ftw_id")
	private int ftwhFtwId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ftwh_last_udtd_on")
	private Date ftwhLastUdtdOn;

	@Column(name="ftwh_weightage")
	private String ftwhWeightage;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="ftwh_last_updtd_by")
	private UserDetail userDetail;

	public FleetTypeWeightageHistory() {
	}

	public int getFtwhId() {
		return this.ftwhId;
	}

	public void setFtwhId(int ftwhId) {
		this.ftwhId = ftwhId;
	}

	public int getFtwhFtwId() {
		return this.ftwhFtwId;
	}

	public void setFtwhFtwId(int ftwhFtwId) {
		this.ftwhFtwId = ftwhFtwId;
	}

	public Date getFtwhLastUdtdOn() {
		return this.ftwhLastUdtdOn;
	}

	public void setFtwhLastUdtdOn(Date ftwhLastUdtdOn) {
		this.ftwhLastUdtdOn = ftwhLastUdtdOn;
	}

	public String getFtwhWeightage() {
		return this.ftwhWeightage;
	}

	public void setFtwhWeightage(String ftwhWeightage) {
		this.ftwhWeightage = ftwhWeightage;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}