package P4_9_LTHDT2019;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>() ; 
		LinkedList<String> list2 = new LinkedList<>() ; 
		list1.add("java") ; 	
		list1.add("c") ;
		list2.add("c++");
	    list2.add("golang");
	    System.out.println(list1);
	    System.out.println(list2 );
	    printList(list1, "List1 ban đầu");
        printList(list2, "List2 ban đầu");
        
	    
	}


	
}
