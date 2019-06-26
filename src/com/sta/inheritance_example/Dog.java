package com.sta.inheritance_example;

public class Dog extends Pet {
	
	boolean isGuardDog;
	
	/**
	 * 
	 */
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param isGuardDog
	 * @param licenceRequired
	 * @param purchasePrice
	 * @param sellingPrice
	 */
	public Dog(boolean isGuardDog, boolean licenceRequired, double purchasePrice, double sellingPrice) {
		super(licenceRequired, purchasePrice, sellingPrice);
		
		this.isGuardDog = isGuardDog;
	}


	/**
	 * @return the isGuardDog
	 */
	boolean isGuardDog() {
		return isGuardDog;
	}

	/**
	 * @param isGuardDog the isGuardDog to set
	 */
	void setGuardDog(boolean isGuardDog) {
		this.isGuardDog = isGuardDog;
	}

	@Override
	public String feedingMethod() {

		return "I like fresh meat";
	}

	@Override
	public String voice() {
		return "bark bark";
	}
}
