package com.sta.inheritance_example;

public abstract class Pet {
	
	boolean licenceRequired;
	String Name;
	int petNo;
	
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
	 * @param licenceRequired
	 * @param name
	 * @param petNo
	 */
	public Pet(boolean licenceRequired, String name, int petNo) {
		super();
		this.licenceRequired = licenceRequired;
		Name = name;
		this.petNo = petNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
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
}
