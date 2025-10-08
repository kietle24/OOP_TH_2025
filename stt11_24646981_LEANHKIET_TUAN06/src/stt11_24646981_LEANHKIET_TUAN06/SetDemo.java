package stt11_24646981_LEANHKIET_TUAN06;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // 1. HashSet - không đảm bảo thứ tự
        Set<Integer> myHashSet = new HashSet<>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(2); // bị bỏ qua
        System.out.println("HashSet Elements: " + myHashSet);

        // 2. TreeSet - sắp xếp tự động
        Set<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(3);
        myTreeSet.add(1);
        myTreeSet.add(2);
        System.out.println("TreeSet Elements: " + myTreeSet);

        // 3. LinkedHashSet - giữ thứ tự chèn
        Set<Integer> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add(2);
        myLinkedHashSet.add(1);
        myLinkedHashSet.add(3);
        System.out.println("LinkedHashSet Elements: " + myLinkedHashSet);

        // 4. Các thao tác cơ bản
        System.out.println("\nSize of HashSet: " + myHashSet.size());
        System.out.println("HashSet contains 1: " + myHashSet.contains(1));
        myHashSet.remove(3);
        System.out.println("HashSet after removing 3: " + myHashSet);
        System.out.println("Is the HashSet empty? " + myHashSet.isEmpty());
        myHashSet.clear();
        System.out.println("HashSet after clear operation: " + myHashSet);

        // 5. Thêm phần tử vào TreeSet
        myTreeSet.add(5);
        myTreeSet.add(4);
        System.out.println("TreeSet after adding 4 and 5: " + myTreeSet);

        // 6. Thêm phần tử vào LinkedHashSet
        myLinkedHashSet.add(5);
        myLinkedHashSet.add(4);
        System.out.println("LinkedHashSet after adding 4 and 5: " + myLinkedHashSet);

        // 7. Tạo HashSet từ ArrayList (lọc trùng)
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1));
        System.out.println("\nArrayList with duplicates: " + myList);

        Set<Integer> mySetFromList = new HashSet<>(myList);
        System.out.println("HashSet created from ArrayList (duplicates removed): " + mySetFromList);
    }
}
