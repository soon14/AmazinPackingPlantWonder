package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the mas_function database table.
 * 
 */
@Entity
@Table(name="mas_function")
@NamedQuery(name="MasFunction.findAll", query="SELECT m FROM MasFunction m")
public class MasFunction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="added_by")
	private String addedBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="function_name")
	private String functionName;

	@Column(name="function_url")
	private String functionUrl;

	@Column(name="is_active")
	private String isActive;

	@Column(name="last_updated")
	private Timestamp lastUpdated;

	@Column(name="updated_by")
	private String updatedBy;

	//bi-directional many-to-one association to MasFunctiongroup
	@OneToMany(mappedBy="masFunction")
	private List<MasFunctiongroup> masFunctiongroups;

	//bi-directional many-to-one association to UserfunctionMaster
//	@OneToMany(mappedBy="masFunction")
//	private List<UserfunctionMaster> userfunctionMasters;

	public MasFunction() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddedBy() {
		return this.addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionUrl() {
		return this.functionUrl;
	}

	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Timestamp getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public List<MasFunctiongroup> getMasFunctiongroups() {
		return this.masFunctiongroups;
	}

	public void setMasFunctiongroups(List<MasFunctiongroup> masFunctiongroups) {
		this.masFunctiongroups = masFunctiongroups;
	}

	public MasFunctiongroup addMasFunctiongroup(MasFunctiongroup masFunctiongroup) {
		getMasFunctiongroups().add(masFunctiongroup);
		masFunctiongroup.setMasFunction(this);

		return masFunctiongroup;
	}

	public MasFunctiongroup removeMasFunctiongroup(MasFunctiongroup masFunctiongroup) {
		getMasFunctiongroups().remove(masFunctiongroup);
		masFunctiongroup.setMasFunction(null);

		return masFunctiongroup;
	}

//	public List<UserfunctionMaster> getUserfunctionMasters() {
//		return this.userfunctionMasters;
//	}
//
//	public void setUserfunctionMasters(List<UserfunctionMaster> userfunctionMasters) {
//		this.userfunctionMasters = userfunctionMasters;
//	}
//
//	public UserfunctionMaster addUserfunctionMaster(UserfunctionMaster userfunctionMaster) {
//		getUserfunctionMasters().add(userfunctionMaster);
//		userfunctionMaster.setMasFunction(this);
//
//		return userfunctionMaster;
//	}
//
//	public UserfunctionMaster removeUserfunctionMaster(UserfunctionMaster userfunctionMaster) {
//		getUserfunctionMasters().remove(userfunctionMaster);
//		userfunctionMaster.setMasFunction(null);
//
//		return userfunctionMaster;
//	}

}