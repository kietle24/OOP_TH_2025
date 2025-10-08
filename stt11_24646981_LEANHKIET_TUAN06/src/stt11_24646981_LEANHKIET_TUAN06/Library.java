package stt11_24646981_LEANHKIET_TUAN06;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> bookList ; 
	public Library() { 
		 this.bookList = new ArrayList<>() ;
	}
	public int getCount() {  
		return bookList.size() ; 
	}
	public List<Book> getBookList()  {  
		return bookList.subList( 0 , getCount()) ; 
	}
	public Book add(Book book) {  
		if(book == null) return null ; 
		if(bookList.contains(book)) { 
			return null ; 
		}
		bookList.add(book) ; 
		return book;
	}
	public Book remove(String code) {
	    for (int i = 0; i < getCount(); i++) {
	        if (code.equals(bookList.get(i).getCode())) {
	            return bookList.remove(i);
	        }
	    }
	    return null;
	}

	public int getQuantityTotal() {  
		 return bookList.stream()
				 .mapToInt(Book::getQuantity).sum()  ; 
	}
	public int getPrice() { 
		return bookList.stream()
				.mapToInt(Book::getQuantity)
				.sum() ; 
	}
	public double getPriceAverage() { 
	    return bookList.stream()
	            .mapToDouble(Book::calculatePriceTotal)
	            .average()
	            .getAsDouble(); 
	}
	public List<Book> getBooksByPublisher(String name) {
	    return bookList.stream()
	            .filter(book -> book.getPublisher().equalsIgnoreCase(name))
	            .collect(Collectors.toCollection(ArrayList::new));
	}

}
