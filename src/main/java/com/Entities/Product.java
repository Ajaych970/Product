package com.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	
	
	private String name;
	
	private String desctiption;
	
	private long price;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String name, String desctiption, long price) {
		super();
		this.id = id;
		this.name = name;
		this.desctiption = desctiption;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesctiption() {
		return desctiption;
	}


	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desctiption=" + desctiption + ", price=" + price
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getDesctiption()=" + getDesctiption()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

	

}
