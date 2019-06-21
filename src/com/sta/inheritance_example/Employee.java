package com.sta.inheritance_example;

public class Employee {
	
	private int empNo;
	private String fName;
	private String lName;
	private String Phone;
	private String isEUCitizen;
	
	/**
	 * @param empNo
	 * @param fName
	 * @param lName
	 * @param phone
	 * @param isEUCitizen
	 */
	public Employee(int empNo, String fName, String lName, String phone, String isEUCitizen) {
		super();
		this.empNo = empNo;
		this.fName = fName;
		this.lName = lName;
		Phone = phone;
		this.isEUCitizen = isEUCitizen;
	}
	/**
	 * @return the empNo
	 */
	int getEmpNo() {
		return empNo;
	}
	/**
	 * @param empNo the empNo to set
	 */
	void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	/**
	 * @return the fName
	 */
	String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * @return the phone
	 */
	String getPhone() {
		return Phone;
	}
	/**
	 * @param phone the phone to set
	 */
	void setPhone(String phone) {
		Phone = phone;
	}
	/**
	 * @return the isEUCitizen
	 */
	String getIsEUCitizen() {
		return isEUCitizen;
	}
	/**
	 * @param isEUCitizen the isEUCitizen to set
	 */
	void setIsEUCitizen(String isEUCitizen) {
		this.isEUCitizen = isEUCitizen;
	}

	
}
