//package com.amz.factory.entity;
//
//import java.io.Serializable;
//import java.sql.Timestamp;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//
//
///**
// * The persistent class for the userfunction_master database table.
// * 
// */
//@Entity
//@Table(name="userfunction_master")
//@NamedQuery(name="UserfunctionMaster.findAll", query="SELECT u FROM UserfunctionMaster u")
//public class UserfunctionMaster implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	private int id;
//
//	@Column(name="added_by")
//	private String addedBy;
//
//	@Column(name="created_date")
//	private Timestamp createdDate;
//
//	@Column(name="function_isauthorized")
//	private String functionIsauthorized;
//
//	@Column(name="is_active")
//	private String isActive;
//
//	@Column(name="last_updated")
//	private Timestamp lastUpdated;
//
//	@Column(name="updated_by")
//	private String updatedBy;
//
//	//bi-directional many-to-one association to MasFunction
//	@ManyToOne
//	@JoinColumn(name="function_master_id")
//	private MasFunction masFunction;
//
//	//bi-directional many-to-one association to UserDetail
//	@ManyToOne
//	@JoinColumn(name="user_details_id")
//	private UserDetail userDetail;
//
//	public UserfunctionMaster() {
//	}
//
//	public int getId() {
//		return this.id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getAddedBy() {
//		return this.addedBy;
//	}
//
//	public void setAddedBy(String addedBy) {
//		this.addedBy = addedBy;
//	}
//
//	public Timestamp getCreatedDate() {
//		return this.createdDate;
//	}
//
//	public void setCreatedDate(Timestamp createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public String getFunctionIsauthorized() {
//		return this.functionIsauthorized;
//	}
//
//	public void setFunctionIsauthorized(String functionIsauthorized) {
//		this.functionIsauthorized = functionIsauthorized;
//	}
//
//	public String getIsActive() {
//		return this.isActive;
//	}
//
//	public void setIsActive(String isActive) {
//		this.isActive = isActive;
//	}
//
//	public Timestamp getLastUpdated() {
//		return this.lastUpdated;
//	}
//
//	public void setLastUpdated(Timestamp lastUpdated) {
//		this.lastUpdated = lastUpdated;
//	}
//
//	public String getUpdatedBy() {
//		return this.updatedBy;
//	}
//
//	public void setUpdatedBy(String updatedBy) {
//		this.updatedBy = updatedBy;
//	}
//
//	public MasFunction getMasFunction() {
//		return this.masFunction;
//	}
//
//	public void setMasFunction(MasFunction masFunction) {
//		this.masFunction = masFunction;
//	}
//
//	public UserDetail getUserDetail() {
//		return this.userDetail;
//	}
//
//	public void setUserDetail(UserDetail userDetail) {
//		this.userDetail = userDetail;
//	}
//
//}