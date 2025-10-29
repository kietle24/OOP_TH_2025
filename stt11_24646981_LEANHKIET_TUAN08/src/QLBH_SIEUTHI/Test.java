package QLBH_SIEUTHI;
import java.util.* ; 
import java.time.LocalDate;

public class Test {
	 public static void main(String[] args) {
	        QuanLyHangHoa ql = new QuanLyHangHoa();

	        // Tạo dữ liệu mẫu
	        HangHoa tp1 = new HangThucPham(
	                "TP01", "Gạo ST25", 100, 18000,
	                LocalDate.of(2024, 10, 1),
	                LocalDate.of(2025, 10, 1),
	                "CTY Lương Thực Miền Tây");

	        HangHoa dm1 = new HangDienMay(
	                "DM01", "Máy giặt LG", 2, 8000000,
	                12, 2.0);

	        HangHoa ss1 = new HangSanhSu(
	                "SS01", "Bộ chén Minh Long", 60, 350000,
	                "Minh Long", LocalDate.of(2024, 9, 25));
	        // Thêm vào danh sách
	        ql.themHang(tp1);
	        ql.themHang(dm1);
	        ql.themHang(ss1);
	        // Xuất toàn bộ danh sách
	        System.out.println("=== DANH SÁCH HÀNG HÓA ===");
	        ql.xuatHangHoa();

	        // Tìm kiếm theo mã
	        System.out.println("\n=== TÌM THEO MÃ ===");
	        String maCanTim = "DM01";
	        HangHoa ketQua = ql.timKiemTheoMa(maCanTim);
	        if (ketQua != null)
	            System.out.println("Tìm thấy: " + ketQua);
	        else
	            System.out.println("Không tìm thấy mã: " + maCanTim);

	        // Tính tổng VAT
	        System.out.println("\n=== TỔNG TIỀN VAT ===");
	        System.out.printf("Tổng VAT phải nộp: %, .0f VND%n", ql.tinhTongVAT());
	    }
			


}
