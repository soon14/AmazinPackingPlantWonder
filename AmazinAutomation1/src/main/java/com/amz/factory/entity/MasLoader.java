package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_loader database table.
 * 
 */
@Entity
@Table(name="mas_loader")
@NamedQuery(name="MasLoader.findAll", query="SELECT m FROM MasLoader m")
public class MasLoader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	@Column(name="loader_no")
	private String loaderNo;

	//bi-directional many-to-one association to MapDischargedsideLoader
	@OneToMany(mappedBy="masLoader")
	private List<MapDischargedsideLoader> mapDischargedsideLoaders;

	//bi-directional many-to-one association to MapLoaderCapacity
	@OneToMany(mappedBy="masLoader")
	private List<MapLoaderCapacity> mapLoaderCapacities;

	//bi-directional many-to-one association to MapLoaderdevice
	@OneToMany(mappedBy="masLoader")
	private List<MapLoaderdevice> mapLoaderdevices;

	public MasLoader() {
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

	public String getLoaderNo() {
		return this.loaderNo;
	}

	public void setLoaderNo(String loaderNo) {
		this.loaderNo = loaderNo;
	}

	public List<MapDischargedsideLoader> getMapDischargedsideLoaders() {
		return this.mapDischargedsideLoaders;
	}

	public void setMapDischargedsideLoaders(List<MapDischargedsideLoader> mapDischargedsideLoaders) {
		this.mapDischargedsideLoaders = mapDischargedsideLoaders;
	}

	public MapDischargedsideLoader addMapDischargedsideLoader(MapDischargedsideLoader mapDischargedsideLoader) {
		getMapDischargedsideLoaders().add(mapDischargedsideLoader);
		mapDischargedsideLoader.setMasLoader(this);

		return mapDischargedsideLoader;
	}

	public MapDischargedsideLoader removeMapDischargedsideLoader(MapDischargedsideLoader mapDischargedsideLoader) {
		getMapDischargedsideLoaders().remove(mapDischargedsideLoader);
		mapDischargedsideLoader.setMasLoader(null);

		return mapDischargedsideLoader;
	}

	public List<MapLoaderCapacity> getMapLoaderCapacities() {
		return this.mapLoaderCapacities;
	}

	public void setMapLoaderCapacities(List<MapLoaderCapacity> mapLoaderCapacities) {
		this.mapLoaderCapacities = mapLoaderCapacities;
	}

	public MapLoaderCapacity addMapLoaderCapacity(MapLoaderCapacity mapLoaderCapacity) {
		getMapLoaderCapacities().add(mapLoaderCapacity);
		mapLoaderCapacity.setMasLoader(this);

		return mapLoaderCapacity;
	}

	public MapLoaderCapacity removeMapLoaderCapacity(MapLoaderCapacity mapLoaderCapacity) {
		getMapLoaderCapacities().remove(mapLoaderCapacity);
		mapLoaderCapacity.setMasLoader(null);

		return mapLoaderCapacity;
	}

	public List<MapLoaderdevice> getMapLoaderdevices() {
		return this.mapLoaderdevices;
	}

	public void setMapLoaderdevices(List<MapLoaderdevice> mapLoaderdevices) {
		this.mapLoaderdevices = mapLoaderdevices;
	}

	public MapLoaderdevice addMapLoaderdevice(MapLoaderdevice mapLoaderdevice) {
		getMapLoaderdevices().add(mapLoaderdevice);
		mapLoaderdevice.setMasLoader(this);

		return mapLoaderdevice;
	}

	public MapLoaderdevice removeMapLoaderdevice(MapLoaderdevice mapLoaderdevice) {
		getMapLoaderdevices().remove(mapLoaderdevice);
		mapLoaderdevice.setMasLoader(null);

		return mapLoaderdevice;
	}

}