package qlsv;
/*
 * 4.3. Xây dựng chương trình Java hỗ trợ quản lý thông tin Sinh viên. 
 * Sinh viên bao gồm mã số sinh viên, họ và tên, ngày tháng năm sinh, điểm trung bình, lớp.
 *  Ngày sinh bao gồm ngày, tháng, năm. Lớp bao gồm tên lớp và tên khoa.
Xây dựng lớp và hiện thực các phương thức sau:
a. Cho biết tên khoa mà sinh vien đang theo học.
b. Cho biết học sinh có đậu hay không (điểm trung bình >=5.0)
c. Kiểm tra sinh viên có ngày sinh giống với ngày sinh của một sinh viên khác hay không. 
 * */
public class SinhVien {
private int mssv ; 
private String hoTen ; 
private NgaySinh ngaySinh ; 
private double diemTB ;
private Lop lop ;
public SinhVien(int mssv, String hoTen, NgaySinh ngaySinh, double diemTB, Lop lop) {
	super();
	this.mssv = mssv;
	this.hoTen = hoTen;
	this.ngaySinh = ngaySinh;
	this.diemTB = diemTB;
	this.lop = lop;
}
public int getMssv() {
	return mssv;
}
public void setMssv(int mssv) {
	this.mssv = mssv;
}
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public NgaySinh getNgaySinh() {
	return ngaySinh;
}
public void setNgaySinh(NgaySinh ngaySinh) {
	this.ngaySinh = ngaySinh;
}
public double getDiemTB() {
	return diemTB;
}
public void setDiemTB(double diemTB) {
	this.diemTB = diemTB;
}
public Lop getLop() {
	return lop;
}
public void setLop(Lop lop) {
	this.lop = lop;
} 
//
public String laytenKhoa() { 
	return this.lop.getTenKhoa() ; 
}
public boolean kiemTraThiDau() { 
	if (this.diemTB  >= 5.0 ) { 
		return true; 
	}else {
		 return false ; 
	}
}
public boolean kiemTraCungNgaySinh(SinhVien svKhac) { 
	return this.ngaySinh == svKhac.ngaySinh ; 
}
}
