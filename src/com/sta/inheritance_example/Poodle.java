package com.sta.inheritance_example;

/**
 * @author Paul
 *
 */
public class Poodle extends Dog {

	/**
	 * @param isGuardDog
	 * @param licenceRequired
	 * @param purchasePrice
	 * @param sellingPrice
	 */
	public Poodle(boolean isGuardDog, boolean licenceRequired, double purchasePrice, double sellingPrice) {
		super(isGuardDog, licenceRequired, purchasePrice, sellingPrice);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Poodle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String voice()
	{
		return "Yap Yap slightly annyingly";
	}

}

