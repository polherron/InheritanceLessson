package com.sta.inheritance_example;

public abstract class Pet {
	boolean licenceRequired;
	double purchasePrice;
	double sellingPrice;
	
	/**
	 * 
	 */
	public Pet() {
		super();
	}
	/**
	 * @param licenceRequired
	 * @param purchasePrice
	 */
	public Pet(boolean licenceRequired, double purchasePrice) {
		super();
		this.licenceRequired = licenceRequired;
		this.purchasePrice = purchasePrice;
	}

	
	/**
	 * @param licenceRequired
	 * @param purchasePrice
	 * @param sellingPrice
	 */
	public Pet(boolean licenceRequired, double purchasePrice, double sellingPrice) {
		super();
		this.licenceRequired = licenceRequired;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
	}
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
	 * @return the licenceRequired
	 */
	public boolean isLicenceRequired() {
		return licenceRequired;
	}


	/**
	 * @param licenceRequired the licenceRequired to set
	 */
	void setLicenceRequired(boolean licenceRequired) {
		this.licenceRequired = licenceRequired;
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
	public abstract String feedingMethod();
	
	public abstract String voice();
}
