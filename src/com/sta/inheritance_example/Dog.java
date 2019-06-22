package com.sta.inheritance_example;

public class Dog extends Pet {
	
	public double sellingPrice = 100;
	double purchasePrice;
	
	public Dog()
	{
		
	}
	
	public Dog(double purchasePrice) {
		super();
		this.purchasePrice = purchasePrice;
	}
	
	public Dog(boolean licenceRequired, String name,
			double purchasePrice, int petNo) 
	{
		super(licenceRequired, name, petNo);
	}
	
	/**
	 * @param sellingPrice
	 * @param purchasePrice
	 */
	public Dog(double sellingPrice, double purchasePrice) {
		super();
		this.sellingPrice = sellingPrice;
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

	@Override
	public String feedingMethod() {
		// TODO Auto-generated method stub
		return null;
	}
}
