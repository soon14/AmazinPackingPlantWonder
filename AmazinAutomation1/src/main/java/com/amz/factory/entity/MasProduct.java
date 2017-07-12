package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_product database table.
 * 
 */
@Entity
@Table(name="mas_product")
@NamedQuery(name="MasProduct.findAll", query="SELECT m FROM MasProduct m")
public class MasProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	@Column(name="product_code")
	private String productCode;

	@Column(name="product_name")
	private String productName;

	//bi-directional many-to-one association to MapPackerAndProduct
	@OneToMany(mappedBy="masProduct")
	private List<MapPackerAndProduct> mapPackerAndProducts;

	//bi-directional many-to-one association to MasPlant
	@ManyToOne
	@JoinColumn(name="plantmaster_id")
	private MasPlant masPlant;

	public MasProduct() {
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

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<MapPackerAndProduct> getMapPackerAndProducts() {
		return this.mapPackerAndProducts;
	}

	public void setMapPackerAndProducts(List<MapPackerAndProduct> mapPackerAndProducts) {
		this.mapPackerAndProducts = mapPackerAndProducts;
	}

	public MapPackerAndProduct addMapPackerAndProduct(MapPackerAndProduct mapPackerAndProduct) {
		getMapPackerAndProducts().add(mapPackerAndProduct);
		mapPackerAndProduct.setMasProduct(this);

		return mapPackerAndProduct;
	}

	public MapPackerAndProduct removeMapPackerAndProduct(MapPackerAndProduct mapPackerAndProduct) {
		getMapPackerAndProducts().remove(mapPackerAndProduct);
		mapPackerAndProduct.setMasProduct(null);

		return mapPackerAndProduct;
	}

	public MasPlant getMasPlant() {
		return this.masPlant;
	}

	public void setMasPlant(MasPlant masPlant) {
		this.masPlant = masPlant;
	}

}