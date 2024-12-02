// Program to demonstrate on multilevel inheritance

package org.tnsif.multilevelinheritance;
// parent class(A)
public class Manager {
	
	//private data members
	private String deptname;
	private String name;
	private int empId;
	
	//getters and setters
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	// toString
	@Override
	public String toString() {
		return "Manager [deptname=" + deptname + ", name=" + name + ", empId=" + empId + "]";
	}
	
	//parameterized constructor
	public Manager(String deptname, String name, int empId) {
		super();
		this.deptname = deptname;
		this.name = name;
		this.empId = empId;
	}
	
	
	
	
}
