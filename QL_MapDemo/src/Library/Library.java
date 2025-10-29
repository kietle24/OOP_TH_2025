package Library;
//Su dung Array List 
import java.util.*;
public class Library {
	private ArrayList<String > books  ;
	public Library() {
		books = new ArrayList<>() ; 
	} 
	public void addBook(String book) {
		 books.add(book) ; 
	}
	public void in() { 
		 System.out.println("Book in the Library: ");
	for(String book  : books) {  
		System.out.println(book);
	}
	
	
}
	
	
}
