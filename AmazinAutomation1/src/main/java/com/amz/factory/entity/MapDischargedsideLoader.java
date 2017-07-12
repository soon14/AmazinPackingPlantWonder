package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_dischargedside_loader database table.
 * 
 */
@Entity
@Table(name="map_dischargedside_loader")
@NamedQuery(name="MapDischargedsideLoader.findAll", query="SELECT m FROM MapDischargedsideLoader m")
public class MapDischargedsideLoader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="discharged_side_id")
	private int dischargedSideId;

	//bi-directional many-to-one association to MasLoader
	@ManyToOne
	@JoinColumn(name="loader_master_id")
	private MasLoader masLoader;

	//bi-directional many-to-one association to MapPackerAndProduct
	@ManyToOne
	@JoinColumn(name="packer_and_productmap_id")
	private MapPackerAndProduct mapPackerAndProduct;

	public MapDischargedsideLoader() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDischargedSideId() {
		return this.dischargedSideId;
	}

	public void setDischargedSideId(int dischargedSideId) {
		this.dischargedSideId = dischargedSideId;
	}

	public MasLoader getMasLoader() {
		return this.masLoader;
	}

	public void setMasLoader(MasLoader masLoader) {
		this.masLoader = masLoader;
	}

	public MapPackerAndProduct getMapPackerAndProduct() {
		return this.mapPackerAndProduct;
	}

	public void setMapPackerAndProduct(MapPackerAndProduct mapPackerAndProduct) {
		this.mapPackerAndProduct = mapPackerAndProduct;
	}

}