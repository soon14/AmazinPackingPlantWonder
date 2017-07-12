package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mas_timedur_type database table.
 * 
 */
@Entity
@Table(name="mas_timedur_type")
@NamedQuery(name="MasTimedurType.findAll", query="SELECT m FROM MasTimedurType m")
public class MasTimedurType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="duration_type")
	private String durationType;

	@Column(name="duration_typedesc")
	private String durationTypedesc;

	@Column(name="is_active")
	private String isActive;

	//bi-directional many-to-one association to MasProduction
	@OneToMany(mappedBy="masTimedurType")
	private List<MasProduction> masProductions;

	public MasTimedurType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDurationType() {
		return this.durationType;
	}

	public void setDurationType(String durationType) {
		this.durationType = durationType;
	}

	public String getDurationTypedesc() {
		return this.durationTypedesc;
	}

	public void setDurationTypedesc(String durationTypedesc) {
		this.durationTypedesc = durationTypedesc;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public List<MasProduction> getMasProductions() {
		return this.masProductions;
	}

	public void setMasProductions(List<MasProduction> masProductions) {
		this.masProductions = masProductions;
	}

	public MasProduction addMasProduction(MasProduction masProduction) {
		getMasProductions().add(masProduction);
		masProduction.setMasTimedurType(this);

		return masProduction;
	}

	public MasProduction removeMasProduction(MasProduction masProduction) {
		getMasProductions().remove(masProduction);
		masProduction.setMasTimedurType(null);

		return masProduction;
	}

}