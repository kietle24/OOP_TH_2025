package QLMT;

public class HangSanXuat {
private String tenHang ; 
QuocGia tenQuocGia ;
public HangSanXuat(String tenHang, QuocGia tenQuocGia) {
	super();
	this.tenHang = tenHang;
	this.tenQuocGia = tenQuocGia;
}
public String getTenHang() {
	return tenHang;
}
public void setTenHang(String tenHang) {
	this.tenHang = tenHang;
}
public QuocGia getTenQuocGia() {
	return tenQuocGia;
}
public void setTenQuocGia(QuocGia tenQuocGia) {
	this.tenQuocGia = tenQuocGia;
} 
public String layTenQuocGia() { 
	return this.tenQuocGia.getTenQuocGia() ; 
}
}
