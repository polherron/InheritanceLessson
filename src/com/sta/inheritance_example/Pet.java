package com.sta.inheritance_example;

import java.io.Serializable;

public abstract class Pet implements Serializable {
	
	int petNo;
	String petType;
	String name;
	public double sellingPrice = 100;
	double purchasePrice;
	boolean licenceRequired;
	
	/**
	 * @param petNo
	 * @param petType
	 * @param name
	 * @param sellingPrice
	 * @param purchasePrice
	 * @param licenceRequired
	 */
	public Pet(int petNo, String petType, String name, double purchasePrice,
			boolean licenceRequired) {
		super();
		this.petNo = petNo;
		this.petType = petType;
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.licenceRequired = licenceRequired;
	}

	/**
	 * @return the petType
	 */
	String getPetType() {
		return petType;
	}
	/**
	 * @param petType the petType to set
	 */
	void setPetType(String petType) {
		this.petType = petType;
	}

	/**
	 * @param licenceRequired
	 */
	public Pet() {
	}
	/**
	 * @param licenceRequired
	 */
	
	/**
	 * @return the sellingPrice
	 */
	double getSellingPrice() {
		return sellingPrice;
	}
	/**
	 * @param sellingPrice the sellingPrice to set
	 */
	void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	/**
	 * @return the purchasePrice
	 */
	double getPurchasePrice() {
		return purchasePrice;
	}
	/**
	 * @param purchasePrice the purchasePrice to set
	 */
	void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		name = name;
	}
	/**
	 * @return the petNo
	 */
	public int getPetNo() {
		return petNo;
	}
	/**
	 * @param petNo the petNo to set
	 */
	public void setPetNo(int petNo) {
		this.petNo = petNo;
	}
	/**
	 * @return the licenceRequired
	 */
	public boolean isLicenceRequired() {
		return licenceRequired;
	}


	/**
	 * @param licenceRequired the licenceRequired to set
	 */
	public void setLicenceRequired(boolean licenceRequired) {
		this.licenceRequired = licenceRequired;
	}


	public abstract String feedingMethod();
	public abstract String voice();
	
	public String toCSVString()
	{
		String myString = String.format("%s,%s,%s,%s,%s\r\n", this.petNo, this.name, 
				this.licenceRequired, this.purchasePrice, this.sellingPrice);
		return myString;
	}
}
