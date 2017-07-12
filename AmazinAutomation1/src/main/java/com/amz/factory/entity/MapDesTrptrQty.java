package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_des_trptr_qty database table.
 * 
 */
@Entity
@Table(name="map_des_trptr_qty")
@NamedQuery(name="MapDesTrptrQty.findAll", query="SELECT m FROM MapDesTrptrQty m")
public class MapDesTrptrQty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	private String percentage;

	//bi-directional many-to-one association to MasDestination
	@ManyToOne
	@JoinColumn(name="destination_id")
	private MasDestination masDestination;

	//bi-directional many-to-one association to MasTransporter
	@ManyToOne
	@JoinColumn(name="transportermaster_id")
	private MasTransporter masTransporter;

	public MapDesTrptrQty() {
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

	public String getPercentage() {
		return this.percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public MasDestination getMasDestination() {
		return this.masDestination;
	}

	public void setMasDestination(MasDestination masDestination) {
		this.masDestination = masDestination;
	}

	public MasTransporter getMasTransporter() {
		return this.masTransporter;
	}

	public void setMasTransporter(MasTransporter masTransporter) {
		this.masTransporter = masTransporter;
	}

}