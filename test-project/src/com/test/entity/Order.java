package com.test.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ORDERS database table.
 * 
 */
@Entity
@Table(name="ORDERS")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	private String bulkorderid;

	private Object createddate;

	private Object lastupdated;

	private String oderedby;

	private String ordername;

	private String orderstatus;

	private String processedby;

	public Order() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBulkorderid() {
		return this.bulkorderid;
	}

	public void setBulkorderid(String bulkorderid) {
		this.bulkorderid = bulkorderid;
	}

	public Object getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Object createddate) {
		this.createddate = createddate;
	}

	public Object getLastupdated() {
		return this.lastupdated;
	}

	public void setLastupdated(Object lastupdated) {
		this.lastupdated = lastupdated;
	}

	public String getOderedby() {
		return this.oderedby;
	}

	public void setOderedby(String oderedby) {
		this.oderedby = oderedby;
	}

	public String getOrdername() {
		return this.ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getOrderstatus() {
		return this.orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getProcessedby() {
		return this.processedby;
	}

	public void setProcessedby(String processedby) {
		this.processedby = processedby;
	}

}