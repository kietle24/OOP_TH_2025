package QLBH;

import java.time.LocalDate;

public class TestBanHang {    
	public static void intieuDe() {  
  	 System.out.printf("%-8s |%-15s |%-12s |%-10s |%s |%s \n",
    			"MaSP:" , "TenSP" , "LoaiSanPham", "GiaBan" , "NgayNhap " ,"ConHang") ; 
    }
    public static void main(String[] args) {
        try {
            // Khởi tạo sản phẩm
            SanPham sp1 = new SanPham("SP01", "Bánh Mì", LoaiSanPham.THUC_PHAM, 4500, LocalDate.of(2000, 1, 1), true);
            SanPham sp2 = new SanPham("SP02", "Nước Ngọt", LoaiSanPham.DO_UONG, 10000, LocalDate.of(2000, 1, 2), true);
            SanPham sp3 = new SanPham("SP03", "Bàn Ghế", LoaiSanPham.GIA_DUNG, 10000, LocalDate.of(2000, 1, 3), true);
            SanPham sp4 = new SanPham("SP04", "Bàn Ghế", LoaiSanPham.GIA_DUNG, 2000, LocalDate.of(2000, 1, 3), true);

            // Quản lý sản phẩm
            QuanLySanPham qlsp = new QuanLySanPham(0);

            // Thêm sản phẩm vào quản lý
            System.out.println("\nThêm sản phẩm:");
            intieuDe();
            qlsp.themSanPham(sp1);
            qlsp.themSanPham(sp2);
            qlsp.themSanPham(sp3);
            qlsp.themSanPham(sp4);

            // In tất cả sản phẩm
            qlsp.inTatCa();

            // Xóa sản phẩm theo mã
            System.out.println("\nXóa sản phẩm theo mã 'SP03':");
            qlsp.xoaTheoMa("SP03");
            intieuDe();
            qlsp.inTatCa();

            // Tìm kiếm sản phẩm theo tên
            System.out.println("\nTìm kiếm sản phẩm theo tên 'to chen':");
            qlsp.timKiemTheoTen("to chen");  // Tìm kiếm tên không tồn tại

            // Sắp xếp sản phẩm theo giá tăng dần
            System.out.println("\nSắp xếp theo giá tăng dần:");
            qlsp.sapXepTheoGiaTang();
            intieuDe();
            qlsp.inTatCa();

            // Tìm kiếm sản phẩm theo loại GIA_DUNG
            System.out.println("\nTìm kiếm sản phẩm theo loại GIA_DUNG:");
            qlsp.timKiemTheoLoai(LoaiSanPham.GIA_DUNG);
            intieuDe();
            qlsp.inTatCa();

            // Kiểm tra mã trùng
            System.out.println("\nKiểm tra mã trùng SP02:");
            System.out.println(qlsp.kiemtraMaTrung("SP02") ? "Mã trùng" : "Mã không trùng");

            // Cập nhật giá sản phẩm
            System.out.println("\nCập nhật giá sản phẩm SP02:");
            qlsp.suaGiaMoi("SP02", 5500);

            // In tất cả sản phẩm sau khi cập nhật giá
            System.out.println("\nDanh sách sản phẩm sau khi cập nhật giá:");
            intieuDe();
            qlsp.inTatCa();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
