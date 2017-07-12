package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_loaderdevice database table.
 * 
 */
@Entity
@Table(name="map_loaderdevice")
@NamedQuery(name="MapLoaderdevice.findAll", query="SELECT m FROM MapLoaderdevice m")
public class MapLoaderdevice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="device_master_id")
	private int deviceMasterId;

	//bi-directional many-to-one association to MasLoader
	@ManyToOne
	@JoinColumn(name="loader_master_id")
	private MasLoader masLoader;

	public MapLoaderdevice() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeviceMasterId() {
		return this.deviceMasterId;
	}

	public void setDeviceMasterId(int deviceMasterId) {
		this.deviceMasterId = deviceMasterId;
	}

	public MasLoader getMasLoader() {
		return this.masLoader;
	}

	public void setMasLoader(MasLoader masLoader) {
		this.masLoader = masLoader;
	}

}