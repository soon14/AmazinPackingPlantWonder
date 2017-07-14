package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trans_lastprintedcommand database table.
 * 
 */
@Entity
@Table(name="trans_lastprintedcommand")
@NamedQuery(name="TransLastprintedcommand.findAll", query="SELECT t FROM TransLastprintedcommand t")
public class TransLastprintedcommand implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String command;

	@Column(name="di_number")
	private String diNumber;

	public TransLastprintedcommand() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getDiNumber() {
		return this.diNumber;
	}

	public void setDiNumber(String diNumber) {
		this.diNumber = diNumber;
	}

}