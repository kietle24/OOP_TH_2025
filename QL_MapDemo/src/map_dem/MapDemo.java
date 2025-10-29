package map_dem;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		Map<String , Integer> hashMap = new HashMap<>() ;
		hashMap.put("A" , 3 );
		hashMap.put("B" , 4 );
		hashMap.put("D" , 5 );
		System.out.println("HashMap"+ hashMap );
		
		Map<String , Integer> LinkedHashMap = new LinkedHashMap<>() ;
		LinkedHashMap.put("A" , 3 );
		LinkedHashMap.put("B" , 4 );
		LinkedHashMap.put("D" , 5 );
		System.out.println("LinkedHashMap"+ LinkedHashMap );
		
		Map<String , Integer> hashTable = new Hashtable<>() ; 
		hashTable.put("C", 5) ; 
		hashTable.put("C", 3 ) ; 
		hashTable.put("D ",4); 
		
		System.out.println("HashTable" + hashTable );
		// HashMap operations 
		Map <String , Integer > map = new HashMap<>()  ;
		map.put("Apple", 1  ) ;
		map.put("Banana", 2);
		map.put("Cheery ", 3 );
		
		System.out.println("Value for key Apple " + map.get("Apple"));
		//Print all 
		
		 // ham check if key exists 
		 if(map.containsKey("banana")) {  
			 System.out.println("banana exitst in the map ");
			 map.remove("Cheery") ; 
		 }
		 for(String key : map.keySet()) {  
			 System.out.println(key + " " + map.get(key));
		 }
		 // ham 
		 HashMap<String , Integer> Wordcount = new HashMap<>()  ;
		 String text = " apple banana apple orange banana apple" ; 
		 String [] counts  = text.split(" "); 
		 for(String count : counts)
		 { 
			System.out.println(Wordcount.put(count, Wordcount.getOrDefault(count, 0) + 1  ));
		 }
	

	}

}
