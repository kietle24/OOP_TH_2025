package stt11_24646981_LEANHKIET_TUAN04;

import java.time.LocalDate;

public class KiemThu {
    public static void main(String[] args) {
        // Tạo kho hàng với sức chứa ban đầu là 5
        KhoHang kho = new KhoHang(5);

        // Tạo các đối tượng HangThucPham
        HangThucPham hang1 = new HangThucPham("HTP001", "Gạo ST25", 35000,
                LocalDate.of(2025, 9, 2), LocalDate.of(2026, 9, 2), LoaiHang.HOP);
        HangThucPham hang2 = new HangThucPham("HTP002", "Sườn bò Mỹ", 250000,
                LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 17), LoaiHang.THIT);
        HangThucPham hang3 = new HangThucPham("HTP003", "Cải bó xôi", 25000,
                LocalDate.of(2025, 9, 12), LocalDate.of(2025, 9, 15), LoaiHang.RAU);
        HangThucPham hang4 = new HangThucPham("HTP001", "Gạo lặp mã", 10000,
                LocalDate.now(), LocalDate.now(), LoaiHang.HOP); // Mã trùng để kiểm tra

        // Thêm hàng vào kho
        System.out.println("--- Thêm hàng vào kho ---");
        kho.themHang(hang1);
        kho.themHang(hang2);
        kho.themHang(hang3);
        kho.themHang(hang4); // Sẽ báo lỗi và không thêm được
        
        System.out.println();

        // Xuất danh sách hàng hóa trong kho
        kho.xuatDanhSach();
    }
}