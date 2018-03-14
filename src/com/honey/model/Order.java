package com.honey.model;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private Honey honey;
	private Customer customer;
	private Integer honeynum;
	private Double total;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Honey honey) {
		this.honey = honey;
	}

	/** full constructor */
	public Order(Honey honey, Customer customer, Integer honeynum, Double total) {
		this.honey = honey;
		this.customer = customer;
		this.honeynum = honeynum;
		this.total = total;
	}

	// Property accessors

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Honey getHoney() {
		return this.honey;
	}

	public void setHoney(Honey honey) {
		this.honey = honey;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getHoneynum() {
		return this.honeynum;
	}

	public void setHoneynum(Integer honeynum) {
		this.honeynum = honeynum;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}