package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_packer database table.
 * 
 */
@Entity
@Table(name="mas_packer")
@NamedQuery(name="MasPacker.findAll", query="SELECT m FROM MasPacker m")
public class MasPacker implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	@Column(name="packer_no")
	private String packerNo;

	@Column(name="target_capacity")
	private String targetCapacity;

	//bi-directional many-to-one association to MapDischargedSide
	@OneToMany(mappedBy="masPacker")
	private List<MapDischargedSide> mapDischargedSides;

	//bi-directional many-to-one association to MapPackerAndProduct
	@OneToMany(mappedBy="masPacker")
	private List<MapPackerAndProduct> mapPackerAndProducts;

	//bi-directional many-to-one association to MasPlant
	@ManyToOne
	@JoinColumn(name="plant_master_id")
	private MasPlant masPlant;

	public MasPacker() {
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

	public String getPackerNo() {
		return this.packerNo;
	}

	public void setPackerNo(String packerNo) {
		this.packerNo = packerNo;
	}

	public String getTargetCapacity() {
		return this.targetCapacity;
	}

	public void setTargetCapacity(String targetCapacity) {
		this.targetCapacity = targetCapacity;
	}

	public List<MapDischargedSide> getMapDischargedSides() {
		return this.mapDischargedSides;
	}

	public void setMapDischargedSides(List<MapDischargedSide> mapDischargedSides) {
		this.mapDischargedSides = mapDischargedSides;
	}

	public MapDischargedSide addMapDischargedSide(MapDischargedSide mapDischargedSide) {
		getMapDischargedSides().add(mapDischargedSide);
		mapDischargedSide.setMasPacker(this);

		return mapDischargedSide;
	}

	public MapDischargedSide removeMapDischargedSide(MapDischargedSide mapDischargedSide) {
		getMapDischargedSides().remove(mapDischargedSide);
		mapDischargedSide.setMasPacker(null);

		return mapDischargedSide;
	}

	public List<MapPackerAndProduct> getMapPackerAndProducts() {
		return this.mapPackerAndProducts;
	}

	public void setMapPackerAndProducts(List<MapPackerAndProduct> mapPackerAndProducts) {
		this.mapPackerAndProducts = mapPackerAndProducts;
	}

	public MapPackerAndProduct addMapPackerAndProduct(MapPackerAndProduct mapPackerAndProduct) {
		getMapPackerAndProducts().add(mapPackerAndProduct);
		mapPackerAndProduct.setMasPacker(this);

		return mapPackerAndProduct;
	}

	public MapPackerAndProduct removeMapPackerAndProduct(MapPackerAndProduct mapPackerAndProduct) {
		getMapPackerAndProducts().remove(mapPackerAndProduct);
		mapPackerAndProduct.setMasPacker(null);

		return mapPackerAndProduct;
	}

	public MasPlant getMasPlant() {
		return this.masPlant;
	}

	public void setMasPlant(MasPlant masPlant) {
		this.masPlant = masPlant;
	}

}