package com.sta.inheritance_example;

/**
 * @author Paul
 *
 */
public class Poodle extends Dog {

	public double sellingPrice = 400;
	
	/**
	 * 
	 */
	public Poodle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param petNo
	 * @param petType
	 * @param name
	 * @param purchasePrice
	 * @param licenceRequired
	 */
	public Poodle(int petNo, String petType, String name, double purchasePrice,
			boolean licenceRequired) {
		super(petNo, petType, name, purchasePrice, licenceRequired);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String voice()
	{
		return ("Yap Yap slightly annyingly");
	}
	
}

