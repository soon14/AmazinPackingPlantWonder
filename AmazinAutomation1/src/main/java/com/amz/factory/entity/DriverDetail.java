package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the driver_detail database table.
 * 
 */
@Entity
@Table(name="driver_detail")
@NamedQuery(name="DriverDetail.findAll", query="SELECT d FROM DriverDetail d")
public class DriverDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dd_id")
	private int ddId;

	@Column(name="dd_authentication")
	private String ddAuthentication;

	@Column(name="dd_driver_address")
	private String ddDriverAddress;

	@Column(name="dd_driver_licence_no")
	private String ddDriverLicenceNo;

	@Column(name="dd_driver_name")
	private String ddDriverName;

	@Column(name="dd_is_active")
	private String ddIsActive;

	@Column(name="dd_is_blocked")
	private String ddIsBlocked;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dd_licence_expiry_date")
	private Date ddLicenceExpiryDate;

	@Column(name="dd_mobile_no")
	private String ddMobileNo;

	//bi-directional many-to-one association to TransConsignmentDetail
	@OneToMany(mappedBy="driverDetail")
	private List<TransConsignmentDetail> transConsignmentDetails;

	public DriverDetail() {
	}

	public int getDdId() {
		return this.ddId;
	}

	public void setDdId(int ddId) {
		this.ddId = ddId;
	}

	public String getDdAuthentication() {
		return this.ddAuthentication;
	}

	public void setDdAuthentication(String ddAuthentication) {
		this.ddAuthentication = ddAuthentication;
	}

	public String getDdDriverAddress() {
		return this.ddDriverAddress;
	}

	public void setDdDriverAddress(String ddDriverAddress) {
		this.ddDriverAddress = ddDriverAddress;
	}

	public String getDdDriverLicenceNo() {
		return this.ddDriverLicenceNo;
	}

	public void setDdDriverLicenceNo(String ddDriverLicenceNo) {
		this.ddDriverLicenceNo = ddDriverLicenceNo;
	}

	public String getDdDriverName() {
		return this.ddDriverName;
	}

	public void setDdDriverName(String ddDriverName) {
		this.ddDriverName = ddDriverName;
	}

	public String getDdIsActive() {
		return this.ddIsActive;
	}

	public void setDdIsActive(String ddIsActive) {
		this.ddIsActive = ddIsActive;
	}

	public String getDdIsBlocked() {
		return this.ddIsBlocked;
	}

	public void setDdIsBlocked(String ddIsBlocked) {
		this.ddIsBlocked = ddIsBlocked;
	}

	public Date getDdLicenceExpiryDate() {
		return this.ddLicenceExpiryDate;
	}

	public void setDdLicenceExpiryDate(Date ddLicenceExpiryDate) {
		this.ddLicenceExpiryDate = ddLicenceExpiryDate;
	}

	public String getDdMobileNo() {
		return this.ddMobileNo;
	}

	public void setDdMobileNo(String ddMobileNo) {
		this.ddMobileNo = ddMobileNo;
	}

	public List<TransConsignmentDetail> getTransConsignmentDetails() {
		return this.transConsignmentDetails;
	}

	public void setTransConsignmentDetails(List<TransConsignmentDetail> transConsignmentDetails) {
		this.transConsignmentDetails = transConsignmentDetails;
	}

	public TransConsignmentDetail addTransConsignmentDetail(TransConsignmentDetail transConsignmentDetail) {
		getTransConsignmentDetails().add(transConsignmentDetail);
		transConsignmentDetail.setDriverDetail(this);

		return transConsignmentDetail;
	}

	public TransConsignmentDetail removeTransConsignmentDetail(TransConsignmentDetail transConsignmentDetail) {
		getTransConsignmentDetails().remove(transConsignmentDetail);
		transConsignmentDetail.setDriverDetail(null);

		return transConsignmentDetail;
	}

}