// Day 4 pr1
// Program to demonstrate on access specifier
package in.bkcmet.Library;

public class Library {
	//Different access specifiers
	public String libraryName;
	private long userId;
	String booksName;
	
	//public method
	public void displayPublic() {
		System.out.println("Library Name:"+libraryName);
	}
	
	//private method
	private void displayPrivate() {
		System.out.println("User Id:"+userId);
	}
	
	//default method
	void displayDefault() {
		System.out.println("BookName is:"+booksName);
	}
}
