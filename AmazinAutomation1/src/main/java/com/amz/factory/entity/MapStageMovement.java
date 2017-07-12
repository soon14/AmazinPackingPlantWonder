package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_stage_movement database table.
 * 
 */
@Entity
@Table(name="map_stage_movement")
@NamedQuery(name="MapStageMovement.findAll", query="SELECT m FROM MapStageMovement m")
public class MapStageMovement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String is_active;

	@Column(name="`Sequence Number`")
	private int sequence_Number;

	//bi-directional many-to-one association to MasMovement
	@ManyToOne
	@JoinColumn(name="movementmaster_id")
	private MasMovement masMovement;

	//bi-directional many-to-one association to MasStage
	@ManyToOne
	@JoinColumn(name="stagemaster_id")
	private MasStage masStage;

	//bi-directional many-to-one association to MasPlant
	@ManyToOne
	@JoinColumn(name="plantmaster_id")
	private MasPlant masPlant;

	public MapStageMovement() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIs_active() {
		return this.is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public int getSequence_Number() {
		return this.sequence_Number;
	}

	public void setSequence_Number(int sequence_Number) {
		this.sequence_Number = sequence_Number;
	}

	public MasMovement getMasMovement() {
		return this.masMovement;
	}

	public void setMasMovement(MasMovement masMovement) {
		this.masMovement = masMovement;
	}

	public MasStage getMasStage() {
		return this.masStage;
	}

	public void setMasStage(MasStage masStage) {
		this.masStage = masStage;
	}

	public MasPlant getMasPlant() {
		return this.masPlant;
	}

	public void setMasPlant(MasPlant masPlant) {
		this.masPlant = masPlant;
	}

}