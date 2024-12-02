// Program to demonstrate on hierarchical inheritance

package org.tnsif.hierarchicalinheritance;
// base class
public class Android {
	// private data members
	private String brand;
	private String slotType;
	
	// getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	
	// toString
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", slotType=" + slotType + "]";
	}
	
	// parameterized
	public Android(String brand, String slotType) {
		super();
		this.brand = brand;
		this.slotType = slotType;
	}
	
	
	
	
	

}
