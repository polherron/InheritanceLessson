package com.sta.inheritance_example;

public class Dog extends Pet {
	
	public Dog()
	{
		
	}
	
	/**
	 * @param petNo
	 * @param petType
	 * @param name
	 * @param purchasePrice
	 * @param licenceRequired
	 */
	public Dog(int petNo, String petType, String name, double purchasePrice,
			boolean licenceRequired) {
		super(petNo, petType, name, purchasePrice, licenceRequired);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String voice()
	{
		return "Bark Bark";
	}

	@Override
	public String feedingMethod() {
		// TODO Auto-generated method stub
		return null;
	}
}
