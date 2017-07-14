package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the distance_weightage_history database table.
 * 
 */
@Entity
@Table(name="distance_weightage_history")
@NamedQuery(name="DistanceWeightageHistory.findAll", query="SELECT d FROM DistanceWeightageHistory d")
public class DistanceWeightageHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dwh_id")
	private int dwhId;

	@Column(name="dwh_dw_id")
	private int dwhDwId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dwh_last_addedon")
	private Date dwhLastAddedon;

	@Column(name="dwh_weightage")
	private String dwhWeightage;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="dwh_last_updated_by")
	private UserDetail userDetail;

	public DistanceWeightageHistory() {
	}

	public int getDwhId() {
		return this.dwhId;
	}

	public void setDwhId(int dwhId) {
		this.dwhId = dwhId;
	}

	public int getDwhDwId() {
		return this.dwhDwId;
	}

	public void setDwhDwId(int dwhDwId) {
		this.dwhDwId = dwhDwId;
	}

	public Date getDwhLastAddedon() {
		return this.dwhLastAddedon;
	}

	public void setDwhLastAddedon(Date dwhLastAddedon) {
		this.dwhLastAddedon = dwhLastAddedon;
	}

	public String getDwhWeightage() {
		return this.dwhWeightage;
	}

	public void setDwhWeightage(String dwhWeightage) {
		this.dwhWeightage = dwhWeightage;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}