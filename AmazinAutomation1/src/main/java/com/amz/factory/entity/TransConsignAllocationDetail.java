package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trans_consign_allocation_details database table.
 * 
 */
@Entity
@Table(name="trans_consign_allocation_details")
@NamedQuery(name="TransConsignAllocationDetail.findAll", query="SELECT t FROM TransConsignAllocationDetail t")
public class TransConsignAllocationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	//bi-directional many-to-one association to TransConsignClubbing
	@ManyToOne
	@JoinColumn(name="consignclubbing_id")
	private TransConsignClubbing transConsignClubbing;

	//bi-directional many-to-one association to MasAllocationMode
	@ManyToOne
	@JoinColumn(name="allocationmodemaster_id")
	private MasAllocationMode masAllocationMode;

	//bi-directional many-to-one association to MasTransporter
	@ManyToOne
	@JoinColumn(name="transportermaster_id")
	private MasTransporter masTransporter;

	public TransConsignAllocationDetail() {
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

	public TransConsignClubbing getTransConsignClubbing() {
		return this.transConsignClubbing;
	}

	public void setTransConsignClubbing(TransConsignClubbing transConsignClubbing) {
		this.transConsignClubbing = transConsignClubbing;
	}

	public MasAllocationMode getMasAllocationMode() {
		return this.masAllocationMode;
	}

	public void setMasAllocationMode(MasAllocationMode masAllocationMode) {
		this.masAllocationMode = masAllocationMode;
	}

	public MasTransporter getMasTransporter() {
		return this.masTransporter;
	}

	public void setMasTransporter(MasTransporter masTransporter) {
		this.masTransporter = masTransporter;
	}

}