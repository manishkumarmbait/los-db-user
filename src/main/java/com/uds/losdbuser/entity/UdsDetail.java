package com.uds.losdbuser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uds_detail")
public class UdsDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "UDSD_ID")
	private Integer UDSD_ID;

	@Column(name = "UDSD_TableName")
	private String UDSD_TableName;

	@Column(name = "UDSD_ColumnName")
	private String UDSD_ColumnName;

	@Column(name = "UDSD_PRODUCT")
	private String UDSD_PRODUCT;

	@Column(name = "UDSD_Columnvalidation")
	private String UDSD_Columnvalidation;

	public Integer getUDSD_ID() {
		return UDSD_ID;
	}

	public void setUDSD_ID(Integer uDSD_ID) {
		UDSD_ID = uDSD_ID;
	}

	public String getUDSD_TableName() {
		return UDSD_TableName;
	}

	public void setUDSD_TableName(String uDSD_TableName) {
		UDSD_TableName = uDSD_TableName;
	}

	public String getUDSD_ColumnName() {
		return UDSD_ColumnName;
	}

	public void setUDSD_ColumnName(String uDSD_ColumnName) {
		UDSD_ColumnName = uDSD_ColumnName;
	}

	public String getUDSD_PRODUCT() {
		return UDSD_PRODUCT;
	}

	public void setUDSD_PRODUCT(String uDSD_PRODUCT) {
		UDSD_PRODUCT = uDSD_PRODUCT;
	}

	public String getUDSD_Columnvalidation() {
		return UDSD_Columnvalidation;
	}

	public void setUDSD_Columnvalidation(String uDSD_Columnvalidation) {
		UDSD_Columnvalidation = uDSD_Columnvalidation;
	}

}
