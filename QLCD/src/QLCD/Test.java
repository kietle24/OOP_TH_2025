package QLCD;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng quản lý CDRom với mảng kích thước 5
        QuanLyCDRom quanLy = new QuanLyCDRom(5);
        
        // Tạo các đối tượng CDRom
        CDROM cd1 = new CDROM("CD001", "Nhạc Trẻ 2024", 
                             LocalDate.of(2024, 1, 15), true, 100, 50000);
        CDROM cd2 = new CDROM("CD002", "Nhạc Bolero", 
                             LocalDate.of(2023, 12, 1), true, 50, 45000);
        CDROM cd3 = new CDROM("CD003", "Nhạc Thiếu Nhi", 
                             LocalDate.of(2024, 3, 10), true, 80, 30000);
        CDROM cd4 = new CDROM("CD004", "Nhạc Rock", 
                             LocalDate.of(2023, 11, 20), false, 0, 60000);
        CDROM cd5 = new CDROM("CD005", "Nhạc Jazz", 
                             LocalDate.of(2024, 2, 5), true, 30, 55000);
        
        // Thêm CD vào danh sách
        System.out.println("=== THÊM CD ===");
        quanLy.themCD(cd1);
        quanLy.themCD(cd2);
        quanLy.themCD(cd3);
        quanLy.themCD(cd4);
        quanLy.themCD(cd5);
        
        // Thử thêm CD trùng mã
        CDROM cdTrung = new CDROM("CD001", "Nhạc Trùng", 
                                LocalDate.now(), true, 10, 10000);
        quanLy.themCD(cdTrung);
        
        // Hiển thị danh sách
        quanLy.hienThiDanhSach();
        
        // Sắp xếp theo giá tăng dần
        System.out.println("\n=== SẮP XẾP THEO GIÁ TĂNG DẦN ===");
        quanLy.sapXepTheoGiaTangDan();
        quanLy.hienThiDanhSach();
        
        // Sắp xếp theo giá giảm dần
        System.out.println("\n=== SẮP XẾP THEO GIÁ GIẢM DẦN ===");
        quanLy.sapXepTheoGiaGiamDan();
        quanLy.hienThiDanhSach();
        
        // Sắp xếp theo tên tăng dần
        System.out.println("\n=== SẮP XẾP THEO TÊN TĂNG DẦN ===");
        quanLy.sapXepTheoTenTangDan();
        quanLy.hienThiDanhSach();
        
        // Tìm kiếm CD
        System.out.println("\n=== TÌM KIẾM CD ===");
        CDROM cdTimThay = quanLy.timKiemTheoMa("CD003");
        if (cdTimThay != null) {
            System.out.println("Tìm thấy CD: " + cdTimThay);
        } else {
            System.out.println("Không tìm thấy CD");
        }
        
        // Cập nhật CD
        System.out.println("\n=== CẬP NHẬT CD ===");
        quanLy.capNhatCD("CD002", "Nhạc Bolero Đặc Biệt", 
                        LocalDate.of(2024, 4, 1), false, 25, 48000);
        quanLy.hienThiDanhSach();
        
        // Xóa CD
        System.out.println("\n=== XÓA CD ===");
        quanLy.xoaCD("CD004");
        quanLy.hienThiDanhSach();
        
        // Thử xóa CD không tồn tại
        quanLy.xoaCD("CD999");
        
        // Hiển thị thông tin quản lý
        System.out.println("\n=== THÔNG TIN QUẢN LÝ ===");
        System.out.println("Số lượng CD hiện tại: " + quanLy.getSoLuongCD());
        System.out.println("Kích thước tối đa: " + quanLy.getKichThuocToiDa());
    }
}
