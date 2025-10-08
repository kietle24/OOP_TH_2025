package Set_LT;
import java.util.*;
public class set {
public static void main(String[] args) {
	Set<String> hashSet  = new HashSet<>() ; 
	hashSet.add("C++"); 
	hashSet.add("add") ; 
	hashSet.add("Python") ;
	hashSet.add("Java") ; 
	hashSet.add("C++"); // tu dong bo qua 
	
	System.out.println("HashSet: "+ hashSet);
	 Set<String> linkedSet = new LinkedHashSet<>();
     linkedSet.add("Apple");
     linkedSet.add("Orange");
     linkedSet.add("Banana");
    
     linkedSet.add("Apple"); // Trùng -> bỏ qua

     System.out.println("LinkedHashSet: " + linkedSet);
     
     Set<Integer> treeSet = new TreeSet<>() ;
     treeSet.add(5) ; 
     treeSet.add(5);
     treeSet.add(2);
     treeSet.add(8);
     treeSet.add(2); // trùng -> bỏ qua

     System.out.println("TreeSet (tự động sắp xếp): " + treeSet);
     /*
 HashSet: [C++, Python, Java]   // không theo thứ tự
LinkedHashSet: [Apple, Banana, Orange] // giữ nguyên thứ tự thêm vào
TreeSet (tự động sắp xếp): [2, 5, 8]  // tăng dần
      */
}
}
