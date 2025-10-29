package ql_nhaga;

public class Main {
	public static void main(String[] args) {
		QuanLyHangHoa qlhh = new QuanLyHangHoa() ;
		
		qlhh.themKhachHang(new KhachHang("123456781", "Nguyen Van A " , "HaNoi" , 1000000 ));
		qlhh.themKhachHang(new KhachHang("123456780", "Nguyen Van B " , "HCM" , 4000000 ));
		qlhh.themKhachHang(new KhachHang("123456782", "Nguyen Van C " , "HUE" , 4000000 ));
		qlhh.hienThiHangCho(); 
		
		System.out.println("Ban Ve Cho Khach Dau Tien");
		qlhh.banVe(new KhachHang("123456781", "Nguyen Van A " , "HaNoi" , 1000000 )); 
		qlhh.banVe(new KhachHang("123456780", "Nguyen Van B " , "HCM" , 4000000 )); 
		
		qlhh.hienThiDaBan(); 
		
		System.out.println("\nThong Ke Tinh Hinh Ban Ve");
		qlhh.thongKeTinhHinhBanVe();
		
		System.out.println("Huy Danh Sach co CMND 1234567890");
		qlhh.huyKhachHang("123456782");
		qlhh.hienThiHangCho();
		
		System.out.println("\n===== Danh sách các ga đang có khách chờ =====");
	    qlhh.danhSachNhaGa();
	
	}
}
