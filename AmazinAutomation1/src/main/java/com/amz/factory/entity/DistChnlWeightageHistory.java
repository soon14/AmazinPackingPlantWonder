package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dist_chnl_weightage_history database table.
 * 
 */
@Entity
@Table(name="dist_chnl_weightage_history")
@NamedQuery(name="DistChnlWeightageHistory.findAll", query="SELECT d FROM DistChnlWeightageHistory d")
public class DistChnlWeightageHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dcwh_id")
	private int dcwhId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dcwh_last_updtd_on")
	private Date dcwhLastUpdtdOn;

	@Column(name="dcwh_last_weightage")
	private String dcwhLastWeightage;

	//bi-directional many-to-one association to DistChnlWeightage
	@ManyToOne
	@JoinColumn(name="dcwh_dcw_id")
	private DistChnlWeightage distChnlWeightage;

	//bi-directional many-to-one association to UserDetail
	@ManyToOne
	@JoinColumn(name="dcwh_last_updtd_by")
	private UserDetail userDetail;

	public DistChnlWeightageHistory() {
	}

	public int getDcwhId() {
		return this.dcwhId;
	}

	public void setDcwhId(int dcwhId) {
		this.dcwhId = dcwhId;
	}

	public Date getDcwhLastUpdtdOn() {
		return this.dcwhLastUpdtdOn;
	}

	public void setDcwhLastUpdtdOn(Date dcwhLastUpdtdOn) {
		this.dcwhLastUpdtdOn = dcwhLastUpdtdOn;
	}

	public String getDcwhLastWeightage() {
		return this.dcwhLastWeightage;
	}

	public void setDcwhLastWeightage(String dcwhLastWeightage) {
		this.dcwhLastWeightage = dcwhLastWeightage;
	}

	public DistChnlWeightage getDistChnlWeightage() {
		return this.distChnlWeightage;
	}

	public void setDistChnlWeightage(DistChnlWeightage distChnlWeightage) {
		this.distChnlWeightage = distChnlWeightage;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}