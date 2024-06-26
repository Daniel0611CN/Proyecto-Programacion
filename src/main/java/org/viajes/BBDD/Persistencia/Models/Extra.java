package org.viajes.BBDD.Persistencia.Models;

public class Extra {
	private Integer id;
	private String name;
	private double price;
	
	public Extra(Integer id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Extra() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
