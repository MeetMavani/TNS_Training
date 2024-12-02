// Program to demonstrate Single Inheritance
package org.tnsif.singleinheritance;

public class Citizen {
	
	private String city;
	private int pincode;
	private String area;
	private long aadharNo;
	
	//Getters and Setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", aadharNo=" + aadharNo + "]";
	}
	
	// default constructor
	public Citizen() {
		System.out.println("Citizen-Parent Class");
	}
	
	// parameterized constructor
	public Citizen(String city, int pincode, String area, long aadharNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.aadharNo = aadharNo;
	}
	
	
	
}
