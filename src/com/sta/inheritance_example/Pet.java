package com.sta.inheritance_example;

public abstract class Pet {
	
	boolean licenceRequired;
	
	/**
	 * @param licenceRequired
	 */
	public Pet() {
	}
	/**
	 * @param licenceRequired
	 */
	public Pet(boolean licenceRequired) {
		super();
		this.licenceRequired = licenceRequired;
	}
	/**
	 * @return the licenceRequired
	 */
	boolean isLicenceRequired() {
		return licenceRequired;
	}


	/**
	 * @param licenceRequired the licenceRequired to set
	 */
	void setLicenceRequired(boolean licenceRequired) {
		this.licenceRequired = licenceRequired;
	}


	public abstract String feedingMethod();
}
