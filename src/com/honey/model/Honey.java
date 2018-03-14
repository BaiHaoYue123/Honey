package com.honey.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Honey entity. @author MyEclipse Persistence Tools
 */

public class Honey implements java.io.Serializable {

	// Fields

	private Integer honeyid;
	private String honeyname;
	private Double unitprice;
	private String filepath;
	private Set orders = new HashSet(0);
	private Set orders_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Honey() {
	}

	/** minimal constructor */
	public Honey(String honeyname, Double unitprice, String filepath) {
		this.honeyname = honeyname;
		this.unitprice = unitprice;
		this.filepath = filepath;
	}

	/** full constructor */
	public Honey(String honeyname, Double unitprice, String filepath, Set orders, Set orders_1) {
		this.honeyname = honeyname;
		this.unitprice = unitprice;
		this.filepath = filepath;
		this.orders = orders;
		this.orders_1 = orders_1;
	}

	// Property accessors

	public Integer getHoneyid() {
		return this.honeyid;
	}

	public void setHoneyid(Integer honeyid) {
		this.honeyid = honeyid;
	}

	public String getHoneyname() {
		return this.honeyname;
	}

	public void setHoneyname(String honeyname) {
		this.honeyname = honeyname;
	}

	public Double getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getOrders_1() {
		return this.orders_1;
	}

	public void setOrders_1(Set orders_1) {
		this.orders_1 = orders_1;
	}

}