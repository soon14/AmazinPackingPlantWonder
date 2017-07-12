package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_loader_capacity database table.
 * 
 */
@Entity
@Table(name="map_loader_capacity")
@NamedQuery(name="MapLoaderCapacity.findAll", query="SELECT m FROM MapLoaderCapacity m")
public class MapLoaderCapacity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	@Column(name="truck_capacity")
	private String truckCapacity;

	//bi-directional many-to-one association to MasLoader
	@ManyToOne
	@JoinColumn(name="loadermaster_id")
	private MasLoader masLoader;

	public MapLoaderCapacity() {
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

	public String getTruckCapacity() {
		return this.truckCapacity;
	}

	public void setTruckCapacity(String truckCapacity) {
		this.truckCapacity = truckCapacity;
	}

	public MasLoader getMasLoader() {
		return this.masLoader;
	}

	public void setMasLoader(MasLoader masLoader) {
		this.masLoader = masLoader;
	}

}