package QLSV_ARRAYLIST;

import java.util.ArrayList;

public class DanhSachSinhVien {
private ArrayList <SinhVien> danhSach ;
//construct khong nhap gi 
public DanhSachSinhVien() { // khi khong muon nhap vao trong danh sach 
	this.danhSach = new ArrayList<SinhVien>() ;

}
//construction nhap danh sach sinh vien 
public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
	this.danhSach = danhSach;
} 
public void themSinhVien(SinhVien sv ) {
	this.danhSach.add(sv) ; 
}
public void themSV(SinhVien sv) { 
	this.danhSach.add(sv) ; 
}
public void inDanhSachSV( ) { 
	for(SinhVien sv :danhSach) { 
		System.out.println(sv);
	}
}

}
