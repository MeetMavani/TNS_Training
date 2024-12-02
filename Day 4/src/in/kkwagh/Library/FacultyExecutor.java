// day 4 pr 2
//driver code
// Program to demonstrate on access specifier

package in.kkwagh.Library;
import in.bkcmet.Library.Library;
// import in.bkcmet.Library.*

public class FacultyExecutor {

	public static void main(String[] args) {
		Library l= new Library();
		l.libraryName= "MET Library";
		l.displayPublic();
		
		/* userId and displayPrivate method is Private, so we can't access into another package or class. Only we can access inside the same class.*/
		//l.userId=123456L;
		//l.displayPrivate();
		
		/* booksName and displayDefault method is Default, so we can't access into another package or class. Only we can access inside the same package.*/
	//	l.booksName;
	//	l.displayDefault();
				
	}

}
