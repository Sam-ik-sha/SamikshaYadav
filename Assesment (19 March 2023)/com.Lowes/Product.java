package com.Lowes;

public class Product {
	int pID;
	String pName;

	public Product(int pID) {
		super();
		this.pID = pID;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public void show() {
		System.out.println("The product ID is"+pID);
		System.out.println("Thnx for purchasing.."+pName);
	}
	}
