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
	 * @param purchasePrice
	 */
	public Poodle(double purchasePrice) {
		super(purchasePrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void voice()
	{
		System.out.println("Yap Yap slightly annyingly");
	}
	
	public boolean isGuardDog()
	{
		return false;
	}

}

