package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_stage_movement database table.
 * 
 */
@Entity
@Table(name="mas_stage_movement")
@NamedQuery(name="MasStageMovement.findAll", query="SELECT m FROM MasStageMovement m")
public class MasStageMovement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String sequencenumber;

	//bi-directional many-to-one association to MasMovement
	@ManyToOne
	@JoinColumn(name="movementmaster_id")
	private MasMovement masMovement;

	//bi-directional many-to-one association to MasPlant
	@ManyToOne
	@JoinColumn(name="plantmaster_id")
	private MasPlant masPlant;

	//bi-directional many-to-one association to MasStage
	@ManyToOne
	@JoinColumn(name="stagemaster_id")
	private MasStage masStage;

	public MasStageMovement() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSequencenumber() {
		return this.sequencenumber;
	}

	public void setSequencenumber(String sequencenumber) {
		this.sequencenumber = sequencenumber;
	}

	public MasMovement getMasMovement() {
		return this.masMovement;
	}

	public void setMasMovement(MasMovement masMovement) {
		this.masMovement = masMovement;
	}

	public MasPlant getMasPlant() {
		return this.masPlant;
	}

	public void setMasPlant(MasPlant masPlant) {
		this.masPlant = masPlant;
	}

	public MasStage getMasStage() {
		return this.masStage;
	}

	public void setMasStage(MasStage masStage) {
		this.masStage = masStage;
	}

}