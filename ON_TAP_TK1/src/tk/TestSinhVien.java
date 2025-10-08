package tk;

import java.time.LocalDate;

public class TestSinhVien {
	public static void main(String[] args) throws IllegalAccessException {
		QuanLySinhVien QLSV = new QuanLySinhVien() ;
		try { 
			 SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", LocalDate.of(2000, 5, 20),GioiTinh.NAM, 9.0);
			 SinhVien sv2 = new SinhVien("SV002", "Nguyen Van B", LocalDate.of(2000, 6, 12),GioiTinh.NAM, 4.0);
			 SinhVien sv3 = new SinhVien("SV003", "Nguyen Van C", LocalDate.of(2000, 6, 13),GioiTinh.NAM, 4.0);
			 QLSV.themSinhVien(sv1);
			 QLSV.themSinhVien(sv2); 
			 QLSV.hienthiDanhSach();
			
			// thu nghiem sinh vien 4 trung ma 
			SinhVien sv4 = new SinhVien("SV003", "Nguyen Van D", LocalDate.of(2000, 6, 13),GioiTinh.NAM, 4.0);
			 QLSV.themSinhVien(sv4); 
			 System.out.println("them sinh vien that bai trung ma");
			 System.out.println("danh sach hien co:");
				QLSV.hienthiDanhSach();
			 System.out.println("diem trung binh cua tat ca cac sinh vien "+QLSV.tinhDiemTrungBinh());
			 
			 System.out.println("\ndanh sach sinh vien sau khi sap xep theo ten ");
			 SinhVien[] sx = QLSV.sapXepTheoTenGiamDan() ; 
			 for(SinhVien sv : sx) { 
				  System.out.println(sv);
			 }
			 
		}catch(IllegalArgumentException e ) { 
			System.out.println("loi "+ e.getMessage());
		}
	

	}
	}

