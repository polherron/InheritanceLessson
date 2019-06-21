package com.sta.inheritance_example;

public class Dog {
	
	public double sellingPrice = 100;
	double purchasePrice;
	public Dog()
	{
		
	}
	
	public Dog(double purchasePrice) {
		super();
		this.purchasePrice = purchasePrice;
	}
	
	double getSellingPrice() {
		return sellingPrice;
	}

	void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public void voice()
	{
		System.out.println("Bark Bark");
	}
}
