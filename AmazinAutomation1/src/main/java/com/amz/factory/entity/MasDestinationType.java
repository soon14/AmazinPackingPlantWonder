package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_destination_type database table.
 * 
 */
@Entity
@Table(name="mas_destination_type")
@NamedQuery(name="MasDestinationType.findAll", query="SELECT m FROM MasDestinationType m")
public class MasDestinationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="is_active")
	private String isActive;

	@Column(name="type_code")
	private String typeCode;

	@Column(name="type_name")
	private String typeName;

	//bi-directional many-to-one association to MasDestination
	@OneToMany(mappedBy="masDestinationType")
	private List<MasDestination> masDestinations;

	public MasDestinationType() {
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

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<MasDestination> getMasDestinations() {
		return this.masDestinations;
	}

	public void setMasDestinations(List<MasDestination> masDestinations) {
		this.masDestinations = masDestinations;
	}

	public MasDestination addMasDestination(MasDestination masDestination) {
		getMasDestinations().add(masDestination);
		masDestination.setMasDestinationType(this);

		return masDestination;
	}

	public MasDestination removeMasDestination(MasDestination masDestination) {
		getMasDestinations().remove(masDestination);
		masDestination.setMasDestinationType(null);

		return masDestination;
	}

}