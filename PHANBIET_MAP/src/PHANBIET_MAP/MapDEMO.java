package PHANBIET_MAP
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        // 1. HashMap - không đảm bảo thứ tự
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("C", 3);
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        System.out.println("HashMap: " + hashMap);

        // 2. LinkedHashMap - giữ thứ tự chèn
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("C", 3);
        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // 3. Hashtable - đồng bộ hóa, không cho null
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("C", 3);
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        System.out.println("Hashtable: " + hashtable);
    }
}
