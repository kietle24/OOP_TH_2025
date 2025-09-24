package qlsach;
/*4.1 Xây dựng một ứng dụng Java
 quản lý những quyển sách với các thông tin sau: 
 Sách bao gồm tên sách, giá bán, năm xuất bản và ten tác giả. 
 Tác giả bao gồm các thông tin là tên và ngày sinh. 
 Ngày sinh bao gồm các thông tin là ngày, tháng và năm.
Viết các phương thức:
In ra màn hình tên của một quyển sách.
Cho biết quyển sách bất kỳ có được xuất bản cùng năm với một quyển sách nào đó hay không.
Cho biết giá sách sau khi giảm giá x%, x được truyền vào như là một tham số. 
 */
public class Sach {
private String tenSach ; 
private TacGia tacGia; 
private double giaBan ; 
private int namXuatBan ;
public Sach(String tenSach, TacGia tacGia, double giaBan, int namXuatBan) {
	this.tenSach = tenSach;
	this.tacGia = tacGia;
	this.giaBan = giaBan;
	this.namXuatBan = namXuatBan;
}

public String getTenSach() {
	return tenSach;
}

public void setTenSach(String tenSach) {
	this.tenSach = tenSach;
}

public TacGia getTacGia() {
	return tacGia;
}

public void setTacGia(TacGia tacGia) {
	this.tacGia = tacGia;
}

public double getGiaBan() {
	return giaBan;
}

public void setGiaBan(double giaBan) {
	this.giaBan = giaBan;
}

public int getNamXuatBan() {
	return namXuatBan;
}

public void setNamXuatBan(int namXuatBan) {
	this.namXuatBan = namXuatBan;
}
// PHUONG THUC IN TEN SACH 
public void inTenSach() { 
	 System.out.println(this.tenSach);
}
// PHUONG THUC KIEM TRA CUNG NAM XUAT BAN 
public  boolean kiemTraCungNamXuatBan(Sach sachkhac) { 
return this.namXuatBan == sachkhac.namXuatBan ; 
}
// PHUONG THUC SAU KHI GIAM 
public double giasaukhiGiam(double x ) {
	return this.giaBan*(1-x/100); 
}
}

