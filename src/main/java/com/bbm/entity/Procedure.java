package com.bbm.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Entity
@Table(name="procedure",schema = "BBM")
public class Procedure {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long OID;
	
	@Column(nullable = false,unique = false)
	private Date performedOn;
	
	@Column(nullable = false,unique = false)
	private Long performedBy;
	
	@Column(nullable = false,unique = false)
	private Long specimenOID;
	
	@Column(nullable = false,unique = false)
	private Long unitsTransfused;
	
	@Column(nullable = false,unique = false)
	private String comments;
	
	@Column(nullable = false,unique = false)
	private String status;

	public Procedure() {
		super();
	}

	public Procedure(Long OID, Date performedOn, Long performedBy, Long specimenOID, Long unitsTransfused,
			String comments, String status) {
		super();
		this.OID = OID;
		this.performedOn = performedOn;
		this.performedBy = performedBy;
		this.specimenOID = specimenOID;
		this.unitsTransfused = unitsTransfused;
		this.comments = comments;
		this.status = status;
	}

	public Long getProcedureId() {
		return OID;
	}

	public void setProcedureId(Long procedureId) {
		this.OID = procedureId;
	}

	public Date getPerformedOn() {
		return performedOn;
	}

	public void setPerformedOn(Date performedOn) {
		this.performedOn = performedOn;
	}

	public Long getPerformedBy() {
		return performedBy;
	}

	public void setPerformedBy(Long performedBy) {
		this.performedBy = performedBy;
	}

	public Long getSpecimenOID() {
		return specimenOID;
	}

	public void setSpecimenOID(Long specimenOID) {
		this.specimenOID = specimenOID;
	}

	public Long getUnitsTransfused() {
		return unitsTransfused;
	}

	public void setUnitsTransfused(Long unitsTransfused) {
		this.unitsTransfused = unitsTransfused;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProcedureEntity [procedureId=" + OID + ", performedOn=" + performedOn + ", performedBy="
				+ performedBy + ", specimenOID=" + specimenOID + ", unitsTransfused=" + unitsTransfused + ", comments="
				+ comments + ", status=" + status + "]";
	}

	
}
