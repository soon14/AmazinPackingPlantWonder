package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the dist_chnl_weightage database table.
 * 
 */
@Entity
@Table(name="dist_chnl_weightage")
@NamedQuery(name="DistChnlWeightage.findAll", query="SELECT d FROM DistChnlWeightage d")
public class DistChnlWeightage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dcw_id")
	private int dcwId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	@Column(name="dcw_dc_name")
	private String dcwDcName;

	@Column(name="dcw_order_type")
	private String dcwOrderType;

	@Column(name="dcw_weightage")
	private String dcwWeightage;

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

	//bi-directional many-to-one association to DistChnlWeightageHistory
	@OneToMany(mappedBy="distChnlWeightage")
	private List<DistChnlWeightageHistory> distChnlWeightageHistories;

	public DistChnlWeightage() {
	}

	public int getDcwId() {
		return this.dcwId;
	}

	public void setDcwId(int dcwId) {
		this.dcwId = dcwId;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getDcwDcName() {
		return this.dcwDcName;
	}

	public void setDcwDcName(String dcwDcName) {
		this.dcwDcName = dcwDcName;
	}

	public String getDcwOrderType() {
		return this.dcwOrderType;
	}

	public void setDcwOrderType(String dcwOrderType) {
		this.dcwOrderType = dcwOrderType;
	}

	public String getDcwWeightage() {
		return this.dcwWeightage;
	}

	public void setDcwWeightage(String dcwWeightage) {
		this.dcwWeightage = dcwWeightage;
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

	public List<DistChnlWeightageHistory> getDistChnlWeightageHistories() {
		return this.distChnlWeightageHistories;
	}

	public void setDistChnlWeightageHistories(List<DistChnlWeightageHistory> distChnlWeightageHistories) {
		this.distChnlWeightageHistories = distChnlWeightageHistories;
	}

	public DistChnlWeightageHistory addDistChnlWeightageHistory(DistChnlWeightageHistory distChnlWeightageHistory) {
		getDistChnlWeightageHistories().add(distChnlWeightageHistory);
		distChnlWeightageHistory.setDistChnlWeightage(this);

		return distChnlWeightageHistory;
	}

	public DistChnlWeightageHistory removeDistChnlWeightageHistory(DistChnlWeightageHistory distChnlWeightageHistory) {
		getDistChnlWeightageHistories().remove(distChnlWeightageHistory);
		distChnlWeightageHistory.setDistChnlWeightage(null);

		return distChnlWeightageHistory;
	}

}