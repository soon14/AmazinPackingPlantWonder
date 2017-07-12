package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the map_packer_and_product database table.
 * 
 */
@Entity
@Table(name="map_packer_and_product")
@NamedQuery(name="MapPackerAndProduct.findAll", query="SELECT m FROM MapPackerAndProduct m")
public class MapPackerAndProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	@Column(name="production_date")
	private Timestamp productionDate;

	@Column(name="shiftmaster_id")
	private int shiftmasterId;

	//bi-directional many-to-one association to MapDischargedsideLoader
	@OneToMany(mappedBy="mapPackerAndProduct")
	private List<MapDischargedsideLoader> mapDischargedsideLoaders;

	//bi-directional many-to-one association to MasPacker
	@ManyToOne
	@JoinColumn(name="packermaster_id")
	private MasPacker masPacker;

	//bi-directional many-to-one association to MasProduct
	@ManyToOne
	@JoinColumn(name="productmaster_id")
	private MasProduct masProduct;

	public MapPackerAndProduct() {
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

	public Timestamp getProductionDate() {
		return this.productionDate;
	}

	public void setProductionDate(Timestamp productionDate) {
		this.productionDate = productionDate;
	}

	public int getShiftmasterId() {
		return this.shiftmasterId;
	}

	public void setShiftmasterId(int shiftmasterId) {
		this.shiftmasterId = shiftmasterId;
	}

	public List<MapDischargedsideLoader> getMapDischargedsideLoaders() {
		return this.mapDischargedsideLoaders;
	}

	public void setMapDischargedsideLoaders(List<MapDischargedsideLoader> mapDischargedsideLoaders) {
		this.mapDischargedsideLoaders = mapDischargedsideLoaders;
	}

	public MapDischargedsideLoader addMapDischargedsideLoader(MapDischargedsideLoader mapDischargedsideLoader) {
		getMapDischargedsideLoaders().add(mapDischargedsideLoader);
		mapDischargedsideLoader.setMapPackerAndProduct(this);

		return mapDischargedsideLoader;
	}

	public MapDischargedsideLoader removeMapDischargedsideLoader(MapDischargedsideLoader mapDischargedsideLoader) {
		getMapDischargedsideLoaders().remove(mapDischargedsideLoader);
		mapDischargedsideLoader.setMapPackerAndProduct(null);

		return mapDischargedsideLoader;
	}

	public MasPacker getMasPacker() {
		return this.masPacker;
	}

	public void setMasPacker(MasPacker masPacker) {
		this.masPacker = masPacker;
	}

	public MasProduct getMasProduct() {
		return this.masProduct;
	}

	public void setMasProduct(MasProduct masProduct) {
		this.masProduct = masProduct;
	}

}