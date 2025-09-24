package QLSACH_ON;

public class Sach {
private String tenSach ; 
private double giaBan ;
private TacGia tenTacgia ; 
private NgaySinh ngaySinh ;
private int  ngayXuatBan ; 


public String getTenSach() {
	return tenSach;
}


public void setTenSach(String tenSach) {
	this.tenSach = tenSach;
}


public double getGiaBan() {
	return giaBan;
}


public void setGiaBan(double giaBan) {
	this.giaBan = giaBan;
}


public TacGia getTenTacgia() {
	return tenTacgia;
}


public void setTenTacgia(TacGia tenTacgia) {
	this.tenTacgia = tenTacgia;
}


public NgaySinh getNgaySinh() {
	return ngaySinh;
}


public void setNgaySinh(NgaySinh ngaySinh) {
	this.ngaySinh = ngaySinh;
}


public int isNgayXuatBan() {
	return ngayXuatBan;
}


public void setNgayXuatBan(int ngayXuatBan) {
	this.ngayXuatBan = ngayXuatBan;
}


public Sach(String tenSach, double giaBan, TacGia tenTacgia, NgaySinh ngaySinh, int ngayXuatBan) {
	super();
	this.tenSach = tenSach;
	this.giaBan = giaBan;
	this.tenTacgia = tenTacgia;
	this.ngaySinh = ngaySinh;
	this.ngayXuatBan = ngayXuatBan;
}
public void inTenSach() { 
	System.out.println(this.tenSach);
}
public boolean kiemTraCungNam(Sach sachkhac) { 
	return this.ngayXuatBan == sachkhac.ngayXuatBan ; 
}
public double giamGia(int x ) { 
	return this.giaBan*(1-x/100); 
}
}
