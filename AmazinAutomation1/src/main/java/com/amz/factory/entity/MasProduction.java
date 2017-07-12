package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_production database table.
 * 
 */
@Entity
@Table(name="mas_production")
@NamedQuery(name="MasProduction.findAll", query="SELECT m FROM MasProduction m")
public class MasProduction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	@Column(name="target_qty")
	private String targetQty;

	//bi-directional many-to-one association to MasPlant
	@ManyToOne
	@JoinColumn(name="plantmaster_id")
	private MasPlant masPlant;

	//bi-directional many-to-one association to MasTimedurType
	@ManyToOne
	@JoinColumn(name="time_duration_id")
	private MasTimedurType masTimedurType;

	//bi-directional many-to-one association to TransConsignmentDetail
	@OneToMany(mappedBy="masProduction")
	private List<TransConsignmentDetail> transConsignmentDetails;

	public MasProduction() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getTargetQty() {
		return this.targetQty;
	}

	public void setTargetQty(String targetQty) {
		this.targetQty = targetQty;
	}

	public MasPlant getMasPlant() {
		return this.masPlant;
	}

	public void setMasPlant(MasPlant masPlant) {
		this.masPlant = masPlant;
	}

	public MasTimedurType getMasTimedurType() {
		return this.masTimedurType;
	}

	public void setMasTimedurType(MasTimedurType masTimedurType) {
		this.masTimedurType = masTimedurType;
	}

	public List<TransConsignmentDetail> getTransConsignmentDetails() {
		return this.transConsignmentDetails;
	}

	public void setTransConsignmentDetails(List<TransConsignmentDetail> transConsignmentDetails) {
		this.transConsignmentDetails = transConsignmentDetails;
	}

	public TransConsignmentDetail addTransConsignmentDetail(TransConsignmentDetail transConsignmentDetail) {
		getTransConsignmentDetails().add(transConsignmentDetail);
		transConsignmentDetail.setMasProduction(this);

		return transConsignmentDetail;
	}

	public TransConsignmentDetail removeTransConsignmentDetail(TransConsignmentDetail transConsignmentDetail) {
		getTransConsignmentDetails().remove(transConsignmentDetail);
		transConsignmentDetail.setMasProduction(null);

		return transConsignmentDetail;
	}

}