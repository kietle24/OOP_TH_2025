package ArrayDeque ;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        // 1. Khởi tạo List
        List<Integer> numbers = new ArrayList<>();
        
        // 2. Thêm phần tử
        numbers.add(5);
        numbers.add(7);
        numbers.add(6);
        
        numbers.add(7); // cho phép phần tử trùng lặp
        System.out.println("Danh sách ban đầu: " + numbers);

        // 3. Sắp xếp tăng dần
        Collections.sort(numbers);
        System.out.println("Sau khi sort: " + numbers);

        // 4. Truy cập phần tử theo index
        System.out.println("Phần tử tại index 1: " + numbers.get(1));

        // 5. Cập nhật giá trị tại index
        numbers.set(2, 10);  // thay phần tử index 2
        numbers.remove(1);       // xóa theo index
        numbers.remove(Integer.valueOf(7)); // xóa giá trị 7 (lần xuất hiện đầu tiên)
        System.out.println("Sau khi xóa: " + numbers);

        // 7. Kiểm tra tồn tại
        System.out.println("List có chứa số 10 không? " + numbers.contains(10));
        System.out.println("Vị trí đầu tiên của số 10: " + numbers.indexOf(10));

        // 8. Duyệt qua List
        System.out.print("Duyệt bằng for-each: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
