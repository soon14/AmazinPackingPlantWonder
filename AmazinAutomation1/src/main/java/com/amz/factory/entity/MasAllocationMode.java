package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_allocation_mode database table.
 * 
 */
@Entity
@Table(name="mas_allocation_mode")
@NamedQuery(name="MasAllocationMode.findAll", query="SELECT m FROM MasAllocationMode m")
public class MasAllocationMode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	private String mode;

	//bi-directional many-to-one association to TransConsignAllocationDetail
	@OneToMany(mappedBy="masAllocationMode")
	private List<TransConsignAllocationDetail> transConsignAllocationDetails;

	public MasAllocationMode() {
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

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public List<TransConsignAllocationDetail> getTransConsignAllocationDetails() {
		return this.transConsignAllocationDetails;
	}

	public void setTransConsignAllocationDetails(List<TransConsignAllocationDetail> transConsignAllocationDetails) {
		this.transConsignAllocationDetails = transConsignAllocationDetails;
	}

	public TransConsignAllocationDetail addTransConsignAllocationDetail(TransConsignAllocationDetail transConsignAllocationDetail) {
		getTransConsignAllocationDetails().add(transConsignAllocationDetail);
		transConsignAllocationDetail.setMasAllocationMode(this);

		return transConsignAllocationDetail;
	}

	public TransConsignAllocationDetail removeTransConsignAllocationDetail(TransConsignAllocationDetail transConsignAllocationDetail) {
		getTransConsignAllocationDetails().remove(transConsignAllocationDetail);
		transConsignAllocationDetail.setMasAllocationMode(null);

		return transConsignAllocationDetail;
	}

}