package com.example.homebuyer.beans;

public class Home {

	private int id;
	private String address;
	private int price;
	
	
	@Override
	public String toString() {
		return "Home [id=" + id + ", address=" + address + ", price=" + price + "]";
	}

	public Home() {
		super();
	}
	
	public Home(String address, int price) {
		super();
		this.address = address;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
