package P4_9_LTHDT2019;
/*
Viết lớp mô tả các toán tử trên danh sách liên kết sử dụng LinkedList. Chương trình tạo hai
LinkedList chứa thông tin là các chuỗi String. Các phần tử của danh sách này được đưa vào danh sách
kia. Các chuỗi trong danh sách được chuyển sang chữ hoa, xoá các phần tử. 

Yêu cầu phân tích

Tạo hai LinkedList<String>.

Chuyển các phần tử từ list này sang list kia (thêm tất cả phần tử).

Chuyển chuỗi thành chữ hoa.

Xóa các phần tử khỏi danh sách.

 */
import java.util.*;
// viet ham them tat cac cac phan tu trong list 2 sang list1 
public class LinkedListOperations {
	public static void addAllElement(LinkedList<String> list1  , LinkedList<String> list2  ) { 
		 list1.addAll(list2) ; 
	}
	public static void convertToUpperCase(LinkedList<String> list ) { 
		 for(int i  =0 ; i < list.size() ; i++) {
			  list.set(i, list.get(i).toUpperCase()) ; // lay ra gia tri cua list va ghi de bang phuong thuc moi 
		 }
	}
	public static void clearList(LinkedList<String> list ) { 
		 list.clear() ; 
	}
	// in toan bo danh sach 
	public static void printList(LinkedList<String> list ,String name ) { 
		 System.out.println(name + ":" + list );
	}
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
        addAllElement(list1 , list2 ) ; 
        printList(list1 , "list1 chen them list 2 ") ; 
        convertToUpperCase(list1 ) ; 
        printList(list1 ,"chuyen sang chu hoa ") ; 
        clearList(list1);
        printList(list1, "list1 sau khi duoc xoa ") ; 
 
	}
}
