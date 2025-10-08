package MapExample;
import java.util.*;
public class MapExample {
public static void main(String[] args) {
// → Không theo thứ tự chèn, vì HashMap lưu bằng bảng băm (hash table).
Map<String, Integer> ages = new HashMap<>();
ages.put("ALice", 30 ) ; 
ages.put("Bob", 20 ) ; 
ages.put("Charlie", 27) ; 
System.out.println("Hash Map of ages"+ages);
//Tự động sắp xếp key tăng dần nhờ cấu trúc cây đỏ-đen (Red-Black Tree).
Map<Integer , String> treeMap = new TreeMap<>() ; 
treeMap.put(10, "ten");
treeMap.put(5, "five");
treeMap.put(20, "twenty");
System.out.println("TreeMap contents: " + treeMap);

// để hiển thị theo thứ tự nhập sách vào kho.
Map<Integer, String > linkedHashMap = new LinkedHashMap<>() ; 
linkedHashMap.put(1, "one");
linkedHashMap.put(2, "two");
linkedHashMap.put(3, "three");
System.out.println("LinkedHashMap contents:"+linkedHashMap);
    }

}

