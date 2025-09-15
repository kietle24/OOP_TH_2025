package stt11_24646981_LEANHKIET_TUAN04;

import java.util.Arrays;

public class KhoHang {
    private HangThucPham[] danhSach;
    private int soLuong;

    public KhoHang() {
        this(10); // Sức chứa mặc định là 10
    }

    public KhoHang(int sucChua) {
        if (sucChua > 0) {
            this.danhSach = new HangThucPham[sucChua];
        } else {
            this.danhSach = new HangThucPham[10];
        }
        this.soLuong = 0;
    }

    public boolean themHang(HangThucPham hang) {
        if (hang == null) return false;

        // Kiểm tra mã hàng trùng lặp
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMa().equalsIgnoreCase(hang.getMa())) {
                System.out.println("Lỗi: Mã hàng " + hang.getMa() + " đã tồn tại.");
                return false;
            }
        }

        // Tăng kích thước mảng nếu đầy
        if (soLuong == danhSach.length) {
            danhSach = Arrays.copyOf(danhSach, danhSach.length * 2);
        }

        danhSach[soLuong++] = hang;
        return true;
    }

    public void xuatDanhSach() {
        System.out.println("--- DANH SÁCH HÀNG HÓA TRONG KHO ---");
        System.out.printf("%-8s | %-15s | %15s | %12s | %12s | %-10s | %s\n",
                "Mã hàng", "Tên hàng", "Đơn giá", "Ngày SX", "Ngày HH", "Loại", "Ghi chú");
        System.out.println("-".repeat(105));
        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSach[i]);
        }
    }
}