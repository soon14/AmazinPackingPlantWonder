package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_plant database table.
 * 
 */
@Entity
@Table(name="mas_plant")
@NamedQuery(name="MasPlant.findAll", query="SELECT m FROM MasPlant m")
public class MasPlant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="is_active")
	private String isActive;

	@Column(name="plant_code")
	private String plantCode;

	@Column(name="plant_name")
	private String plantName;

	private String unit;

	//bi-directional many-to-one association to MapStageMovement
	@OneToMany(mappedBy="masPlant")
	private List<MapStageMovement> mapStageMovements;

	//bi-directional many-to-one association to MasBiddingTimeperiod
	@OneToMany(mappedBy="masPlant")
	private List<MasBiddingTimeperiod> masBiddingTimeperiods;

	//bi-directional many-to-one association to MasDeviceMaster
	@OneToMany(mappedBy="masPlant")
	private List<MasDeviceMaster> masDeviceMasters;

	//bi-directional many-to-one association to MasPacker
	@OneToMany(mappedBy="masPlant")
	private List<MasPacker> masPackers;

	//bi-directional many-to-one association to MasProduct
	@OneToMany(mappedBy="masPlant")
	private List<MasProduct> masProducts;

	//bi-directional many-to-one association to MasProduction
	@OneToMany(mappedBy="masPlant")
	private List<MasProduction> masProductions;

	//bi-directional many-to-one association to MasStageMovement
	@OneToMany(mappedBy="masPlant")
	private List<MasStageMovement> masStageMovements;

	//bi-directional many-to-one association to MasTransporter
	@OneToMany(mappedBy="masPlant")
	private List<MasTransporter> masTransporters;

	public MasPlant() {
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

	public String getPlantCode() {
		return this.plantCode;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}

	public String getPlantName() {
		return this.plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public List<MapStageMovement> getMapStageMovements() {
		return this.mapStageMovements;
	}

	public void setMapStageMovements(List<MapStageMovement> mapStageMovements) {
		this.mapStageMovements = mapStageMovements;
	}

	public MapStageMovement addMapStageMovement(MapStageMovement mapStageMovement) {
		getMapStageMovements().add(mapStageMovement);
		mapStageMovement.setMasPlant(this);

		return mapStageMovement;
	}

	public MapStageMovement removeMapStageMovement(MapStageMovement mapStageMovement) {
		getMapStageMovements().remove(mapStageMovement);
		mapStageMovement.setMasPlant(null);

		return mapStageMovement;
	}

	public List<MasBiddingTimeperiod> getMasBiddingTimeperiods() {
		return this.masBiddingTimeperiods;
	}

	public void setMasBiddingTimeperiods(List<MasBiddingTimeperiod> masBiddingTimeperiods) {
		this.masBiddingTimeperiods = masBiddingTimeperiods;
	}

	public MasBiddingTimeperiod addMasBiddingTimeperiod(MasBiddingTimeperiod masBiddingTimeperiod) {
		getMasBiddingTimeperiods().add(masBiddingTimeperiod);
		masBiddingTimeperiod.setMasPlant(this);

		return masBiddingTimeperiod;
	}

	public MasBiddingTimeperiod removeMasBiddingTimeperiod(MasBiddingTimeperiod masBiddingTimeperiod) {
		getMasBiddingTimeperiods().remove(masBiddingTimeperiod);
		masBiddingTimeperiod.setMasPlant(null);

		return masBiddingTimeperiod;
	}

	public List<MasDeviceMaster> getMasDeviceMasters() {
		return this.masDeviceMasters;
	}

	public void setMasDeviceMasters(List<MasDeviceMaster> masDeviceMasters) {
		this.masDeviceMasters = masDeviceMasters;
	}

	public MasDeviceMaster addMasDeviceMaster(MasDeviceMaster masDeviceMaster) {
		getMasDeviceMasters().add(masDeviceMaster);
		masDeviceMaster.setMasPlant(this);

		return masDeviceMaster;
	}

	public MasDeviceMaster removeMasDeviceMaster(MasDeviceMaster masDeviceMaster) {
		getMasDeviceMasters().remove(masDeviceMaster);
		masDeviceMaster.setMasPlant(null);

		return masDeviceMaster;
	}

	public List<MasPacker> getMasPackers() {
		return this.masPackers;
	}

	public void setMasPackers(List<MasPacker> masPackers) {
		this.masPackers = masPackers;
	}

	public MasPacker addMasPacker(MasPacker masPacker) {
		getMasPackers().add(masPacker);
		masPacker.setMasPlant(this);

		return masPacker;
	}

	public MasPacker removeMasPacker(MasPacker masPacker) {
		getMasPackers().remove(masPacker);
		masPacker.setMasPlant(null);

		return masPacker;
	}

	public List<MasProduct> getMasProducts() {
		return this.masProducts;
	}

	public void setMasProducts(List<MasProduct> masProducts) {
		this.masProducts = masProducts;
	}

	public MasProduct addMasProduct(MasProduct masProduct) {
		getMasProducts().add(masProduct);
		masProduct.setMasPlant(this);

		return masProduct;
	}

	public MasProduct removeMasProduct(MasProduct masProduct) {
		getMasProducts().remove(masProduct);
		masProduct.setMasPlant(null);

		return masProduct;
	}

	public List<MasProduction> getMasProductions() {
		return this.masProductions;
	}

	public void setMasProductions(List<MasProduction> masProductions) {
		this.masProductions = masProductions;
	}

	public MasProduction addMasProduction(MasProduction masProduction) {
		getMasProductions().add(masProduction);
		masProduction.setMasPlant(this);

		return masProduction;
	}

	public MasProduction removeMasProduction(MasProduction masProduction) {
		getMasProductions().remove(masProduction);
		masProduction.setMasPlant(null);

		return masProduction;
	}

	public List<MasStageMovement> getMasStageMovements() {
		return this.masStageMovements;
	}

	public void setMasStageMovements(List<MasStageMovement> masStageMovements) {
		this.masStageMovements = masStageMovements;
	}

	public MasStageMovement addMasStageMovement(MasStageMovement masStageMovement) {
		getMasStageMovements().add(masStageMovement);
		masStageMovement.setMasPlant(this);

		return masStageMovement;
	}

	public MasStageMovement removeMasStageMovement(MasStageMovement masStageMovement) {
		getMasStageMovements().remove(masStageMovement);
		masStageMovement.setMasPlant(null);

		return masStageMovement;
	}

	public List<MasTransporter> getMasTransporters() {
		return this.masTransporters;
	}

	public void setMasTransporters(List<MasTransporter> masTransporters) {
		this.masTransporters = masTransporters;
	}

	public MasTransporter addMasTransporter(MasTransporter masTransporter) {
		getMasTransporters().add(masTransporter);
		masTransporter.setMasPlant(this);

		return masTransporter;
	}

	public MasTransporter removeMasTransporter(MasTransporter masTransporter) {
		getMasTransporters().remove(masTransporter);
		masTransporter.setMasPlant(null);

		return masTransporter;
	}

}