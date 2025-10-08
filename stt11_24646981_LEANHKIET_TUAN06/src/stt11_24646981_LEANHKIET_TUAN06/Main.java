package stt11_24646981_LEANHKIET_TUAN06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
		

	String headerLine = String.format("%6s | %12s | %10s | %15s | %15s | %s",
				"Code", "Unit price", "Quantity", "Import Date", "Publisher", "Note");

		List<Book> books = generateSampleData();
		
		System.out.println(headerLine + "\n" + "-".repeat(80));
		Library library = new Library();		
		for (Book book : books) {
			System.out.println(library.add(book));
		}
		System.out.println("Sum: " + library.getQuantityTotal());
		System.out.println("Avg: " + library.getPriceAverage());
		library.getBooksByPublisher("kim dong").forEach(System.out::println);;
	}
	
	private static List<Book> generateSampleData() {
		List<Book> books = new ArrayList<>();
		Book book1 = new TextBook("001", 87e3, 5, LocalDate.of(2025, 5, 25), "Kim Dong", BookStatus.NEW);
		Book book2 = new ReferenceBook("101", 80e3, 2, LocalDate.of(2024, 6, 12), "Tre", 10e3);
		Book book3 = new TextBook("011", 50e3, 4, LocalDate.of(2025, 7, 10), "Nha Nam", BookStatus.OLD);
		Book book4 = new TextBook("071", 45e3, 6, LocalDate.of(2024, 5, 15), "Tre", BookStatus.NEW);
		Book book5 = new TextBook("106", 78e3, 10, LocalDate.of(2024, 8, 7), "Kim Dong", BookStatus.OLD);
		Book book6 = new ReferenceBook("092", 91e3, 2, LocalDate.of(2025, 12, 10), "Giao Duc", 13e3);
		Book book7 = new ReferenceBook("102", 82e3, 3, LocalDate.of(2025, 11, 19), "Nha Nam", 8e3);
		Book book8 = new TextBook("102", 82e3, 3, LocalDate.of(2025, 10, 19), "Nha Nam", BookStatus.NEW);
		Book book9 = new ReferenceBook("082", 77e3, 9, LocalDate.of(2024, 1, 5), "Tre", 7e3);
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		return books;
	}
}

