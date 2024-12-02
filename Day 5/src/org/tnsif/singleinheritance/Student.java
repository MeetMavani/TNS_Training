// Program to demonstrate Single Inheritance
package org.tnsif.singleinheritance;

//child class
public class Student extends Citizen {

		// private data members
		private int rollno;
		private String collegeName;
		
		// getters and setters
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		
		
		// parameterized constructor
		public Student(String city, int pincode, String area, long aadharNo, int rollno, String collegeName) {
			super(city, pincode, area, aadharNo);
			this.rollno= rollno;
			this.collegeName= collegeName;
		}
		
		// toString method by selecting toString in inherited...
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString()
					+ "]";
		}
		
		
		
		
		
		
		
		
}
