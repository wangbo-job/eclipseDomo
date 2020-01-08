package com.dto;

import java.util.Date;

public class Shop {

	private Integer id;
	private String name;
	private Double price;
	private Date cdate;
	public Date getCdate() {
		return cdate;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", price=" + price
				+ ", cdate=" + cdate + "]";
	}
	
	
}
