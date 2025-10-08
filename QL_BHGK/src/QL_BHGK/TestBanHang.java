package QL_BHGK;

import java.time.LocalDate;

public class TestBanHang {
	public static void inTieuDe() {  
		 System.out.printf("  %-8s  |  %-15s  |  %-12s  |  %-10s  |  %-4s  |  %-6s\n",
				 "Ma SP",
				 "Ten Sp" ,"Loai San Pham" , "Gia Ban","Ngay nhap", "Hang");
	}

public static void main(String[] args) {
	try {
		QuanLyBanHang qlbh = new QuanLyBanHang(3);
		SanPham sp1 = new SanPham("SP01" , 
				"Banh Mi", LoaiSanPham.DO_UONG , 4500 , LocalDate.of(2000, 1, 1), true  ) ; 
		SanPham sp2 = new SanPham("SP02" , 
				"Com Hen", LoaiSanPham.DO_UONG, 9000  , LocalDate.of(2000, 1, 2), true ) ; 
		SanPham sp3 = new SanPham("SP03" , 
				"Com Hen", LoaiSanPham.DO_UONG, 12000  , LocalDate.of(2000, 1, 3), false ) ; 
		SanPham sp4 = new SanPham("SP04" , 
				"Nuoc Cam", LoaiSanPham.DO_UONG, 25000  , LocalDate.of(2000, 1, 3), true ) ; 
		System.out.println("Danh Sach San Pham Hien Co ");
		qlbh.themSanPham(sp1) ;
		qlbh.themSanPham(sp2) ; 
		qlbh.themSanPham(sp3) ; 
		inTieuDe() ; 
		qlbh.inTatCa() ; 
		System.out.println("Danh Sach San Pham Them SP04 ");
		qlbh.themSanPham(sp4) ; 
		inTieuDe() ;
		qlbh.inTatCa() ;
		System.out.println("Tim kiem SP03"); 
		qlbh.kiemTraMaSp("SP03") ; 
		System.out.println("xoa ma SP03 "); 
		qlbh.xoaTheoMa("SP03") ; 
		inTieuDe() ; 
		qlbh.inTatCa() ;
		
		qlbh.suaGiaMoi("SP04", 10000) ; 
		qlbh.inTatCa() ;
		System.out.println("Tim Kiem Loai Hang Do Uong"); 
		qlbh.timKiemTheoLoai(LoaiSanPham.DO_UONG); 
		qlbh.inTatCa() ;
		
		qlbh.timKiemTheoTen("SP01");
		
	} catch (Exception e) {
		
	}

}
}
