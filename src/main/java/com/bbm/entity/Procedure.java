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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long OID;
	
	@Column(nullable = true,name="PERFORMEDON")
	private Date performedOn;
	
	@Column(nullable = true,name="PERFORMEDBY")
	private Long performedBy;
	
	@Column(nullable = true,name="SPECIMENOID")
	private Long specimenOID;
	
	@Column(nullable = true,name="UNITSTRANSFUSED")
	private Long unitsTransfused;
	
	@Column(nullable = true,name="COMMENTS")
	private String comments;
	
	@Column(nullable = true,name="STATUS")
	private String status;

	@Column(nullable = true,name="PATIENTOID")
	private Long patientOID;

	public Procedure() {
		super();
	}

	public Procedure(Long OID, Date performedOn, Long performedBy, Long specimenOID, Long unitsTransfused,
			String comments, String status,Long PatientOID) {
		super();
		this.OID = OID;
		this.performedOn = performedOn;
		this.performedBy = performedBy;
		this.specimenOID = specimenOID;
		this.unitsTransfused = unitsTransfused;
		this.comments = comments;
		this.status = status;
		this.patientOID=PatientOID;
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

	public void setPatientOID(Long patientOID)
	{
		this.patientOID=patientOID;
	}

	public Long getPatientOID()
	{
		return this.patientOID;
	}

	@Override
	public String toString() {
		return "ProcedureEntity [procedureId=" + OID + ", performedOn=" + performedOn + ", performedBy="
				+ performedBy + ", specimenOID=" + specimenOID + ", unitsTransfused=" + unitsTransfused + ", comments="
				+ comments + ", status=" + status + "]";
	}

	
}
