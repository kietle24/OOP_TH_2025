package GK;
import java.util.*;
public class TestSinhVien {
public static void main(String[] args) throws IllegalAccessException {
	StudentManager sm = new StudentManager() ; 
	Student s1 = new Student("SV0001", "Nguyen Van A" , 19, 50, "nguyenvana@gmail.com") ; 
	Student s2 = new Student("SV0002", "Nguyen Van B" , 19, 4.0, "nguyenvanb@gmail.com") ; 
	Student s3 = new Student("SV0003", "Nguyen Van C" , 19, 7.0, "nguyenvana@gmail.com") ; 
	// them sinh vien vao trong 
	sm.themSinhVien(s1);	
	sm.themSinhVien(s2);
	sm.themSinhVien(s3);
    System.out.println("\n--- Danh sach sinh vien sau khi them ---");
    System.out.println(sm.tieuDe());
    sm.inDanhSachSinhVien() ; 
    sm.removeStudent("SV0002");
    System.out.println("\n--- Danh sach sinh vien sau khi xoa SV002 ---");
    System.out.println(sm.tieuDe());
    sm.inDanhSachSinhVien();
    sm.updateStudent("SV0003", new Student("SV0003", "Nguyen Van C Updated", 19, 8.2, "cnew@gmail.com"));
    System.out.println("\n--- Danh sach sinh vien sau khi cap nhat SV003 ---");
    System.out.println(sm.tieuDe());
    sm.inDanhSachSinhVien();

    // 5. Tìm kiếm sinh viên theo tên chứa "Nguyen"
    ArrayList<Student> results = sm.searchByName("Nguyen Van A");
    System.out.println("\n--- Ket qua tim kiem theo ten 'Nguyen Van A' ---");
    System.out.println(sm.tieuDe());
    for (Student s : results) {
        System.out.println(s);
    }

    // 6. Sắp xếp danh sách theo tên (A-Z)
    sm.sortByName();
    System.out.println("\n--- Danh sach sinh vien sau khi sap xep theo ten A-Z ---");
    System.out.println(sm.tieuDe());
    sm.inDanhSachSinhVien();

    // 7. Sắp xếp danh sách theo GPA (cao → thấp)
    sm.sortByGPA();
    System.out.println("\n--- Danh sach sinh vien sau khi sap xep theo GPA cao → thap ---");
    System.out.println(sm.tieuDe());
    sm.inDanhSachSinhVien();
}
}
