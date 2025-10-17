package QLPhongHoc;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuanLyPhongHoc qlph = new QuanLyPhongHoc();
        // 1. Tạo các phòng
        PhongLyThuyet p1 = new PhongLyThuyet("L101", "A", 80.0, 10, true);
        PhongMayTinh p2 = new PhongMayTinh("L102", "B", 90.0, 80, 25);
        PhongThiNghiem p3 = new PhongThiNghiem("L103", "C", 90.0, 15, "KHMT", 40, true);
        PhongMayTinh p4 = new PhongMayTinh("L104", "D", 90.0, 8, 60);
        // 2. Thêm phòng vào danh sách
        qlph.addNewRoom(p1);
        qlph.addNewRoom(p2);
        qlph.addNewRoom(p3);
        qlph.addNewRoom(p4);
        // 3. Hiển thị toàn bộ danh sách
        System.out.println("=== Danh sách tất cả phòng học ===");
        qlph.hienThiTatCa();
        // 4. Hiển thị phòng đạt chuẩn
        System.out.println("\n=== Danh sách phòng đạt chuẩn ===");
        qlph.layThongTinDatChuan();

        // 5. Tìm phòng theo mã
        System.out.println("\n=== Tìm phòng theo mã L102 ===");
        PhongHoc found = qlph.timPhong("L102");
        System.out.println(found != null ? found : "Không tìm thấy");

        // 6. Sắp xếp theo dãy nhà
        System.out.println("\n=== Sắp xếp tăng dần theo dãy nhà ===");
        qlph.sapXepTangDanTheoDayNha();
        qlph.hienThiTatCa();

        // 7. Sắp xếp giảm dần theo diện tích
        System.out.println("\n=== Sắp xếp giảm dần theo diện tích ===");
        qlph.sapXepGiamDanTheoDienTich();
        qlph.hienThiTatCa();

        // 8. Sắp xếp tăng dần theo số bóng đèn
        System.out.println("\n=== Sắp xếp tăng dần theo số bóng đèn ===");
        qlph.sapXepTangDanSoBongDen();
        qlph.hienThiTatCa();

        // 9. Cập nhật số máy tính cho phòng
        System.out.println("\n=== Cập nhật số máy tính phòng L104 ===");
        qlph.capNhatSoMayTinh("L104", 65);
        qlph.hienThiTatCa();

        // 11. Tính tổng số phòng
        System.out.println("\nTổng số phòng học: " + qlph.tinhTongSoPhongHoc());

        // 12. Lấy danh sách phòng máy có 60 máy
        System.out.println("\n=== Danh sách phòng máy có 60 máy ===");
        List<PhongMayTinh> ds60 = qlph.layDanhSachPhongMay60May();
        for (PhongMayTinh pm : ds60) {
            System.out.println(pm);
        }
    }
}
