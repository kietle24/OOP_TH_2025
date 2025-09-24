package QLBP;
/*
 * 4.2. Xây dựng chương trình Java
quản lý các bộ phim tại một Rạp chiếu phim. 
Một bộ phim bao gồm các thông tin:
tên phim, năm sản xuất, hãng sản xuất, giá vé, ngày chiếu.
 Hãng sản xuất bao gồm tên hãng sản xuất, quốc gia.
  Ngày chiếu bao gồm thông tin ngày, tháng, năm.
Xây dựng lớp và hiện thực các phương thức sau:
a. Kiểm tra xem giá vé của một phim bất kỳ có rẽ hơn giá vé của một phim khác hay không?
b. Cho biết tên của hãng sản xuất phim.
c. Cho biết giá vé của phim khi có khuyến mãi (ví dụ như sau khi khuyến mãi 10%, 20%, ....), số tiền khuyến mãi được giảm trừ theo % giá bán.
 */
public class BoPhim {
private String tenPhim; 
private int namSanXuat ; 
private HangSanXuat hangsanxuat ; 
private double giaVe ; 
private NgayChieu ngayChieu ;
public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangsanxuat, double giaVe, NgayChieu ngayChieu) {
	super();
	this.tenPhim = tenPhim;
	this.namSanXuat = namSanXuat;
	this.hangsanxuat = hangsanxuat;
	this.giaVe = giaVe;
	this.ngayChieu = ngayChieu;
}
public String getTenPhim() {
	return tenPhim;
}
public void setTenPhim(String tenPhim) {
	this.tenPhim = tenPhim;
}
public int getNamSanXuat() {
	return namSanXuat;
}
public void setNamSanXuat(int namSanXuat) {
	this.namSanXuat = namSanXuat;
}
public HangSanXuat getHangsanxuat() {
	return hangsanxuat;
}
public void setHangsanxuat(HangSanXuat hangsanxuat) {
	this.hangsanxuat = hangsanxuat;
}
public double getGiaVe() {
	return giaVe;
}
public void setGiaVe(double giaVe) {
	this.giaVe = giaVe;
}
public NgayChieu getNgayChieu() {
	return ngayChieu;
}
public void setNgayChieu(NgayChieu ngayChieu) {
	this.ngayChieu = ngayChieu;
}
public boolean kiemtraPhim(BoPhim phimKhac) {
	return this.giaVe < phimKhac.giaVe ; 
	 
}
public String layTenHangSanXuat() { 
	return this.hangsanxuat.getTenHangSX() ; 
}
public double giaVeKhiKhuyenMai(int x ) { 
	return this.giaVe*(1-x/100.0) ; 
}
}
