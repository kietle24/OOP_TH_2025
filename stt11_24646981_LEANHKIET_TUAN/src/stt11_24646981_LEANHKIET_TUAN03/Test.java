package stt11_24646981_LEANHKIET_TUAN03;
import java.util.Arrays;
public class Test {
public static void main(String[] args) {
	CompactDisc cd0= new CompactDisc(123 ,"Title 1 ", 10 , 105e3);
	CompactDisc cd1= new CompactDisc(456 ,"Title 2 ", 11 , 101e3);
	CompactDisc cd2= new CompactDisc(123 ,"Title 4 ", 12 , 104e3);
	CompactDisc cd3= new CompactDisc(789 ,"Title 5 ", 13 , 102e3);
	CompactDisc cd4= new CompactDisc(012 ,"Title 5 ", 14 , 103e3);
	CDManager manager = new CDManager() ; 
	manager.add(cd0);
	manager.add(cd1);
	manager.add(cd2);
	manager.add(cd3);
	manager.add(cd4);

	Arrays.asList(manager.getCdList()).forEach(item -> {
		System.out.println(item);
	}
	);
	System.out.println(manager.totalPrice()
			);
	CompactDisc[] sorted = manager.sortByPriceInDescending();
	System.out.println("-------------");
	for(CompactDisc compactDisc : sorted ) { 
		System.out.println(compactDisc);
	}
}
}
