package com.amz.factory.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mas_mrpcommand database table.
 * 
 */
@Entity
@Table(name="mas_mrpcommand")
@NamedQuery(name="MasMrpcommand.findAll", query="SELECT m FROM MasMrpcommand m")
public class MasMrpcommand implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="cmd_name")
	private String cmdName;

	@Column(name="seq_no")
	private String seqNo;

	public MasMrpcommand() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCmdName() {
		return this.cmdName;
	}

	public void setCmdName(String cmdName) {
		this.cmdName = cmdName;
	}

	public String getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

}