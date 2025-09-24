package QL_PHUONGTIEN;
public abstract class PhuongTienDiChuyen {
protected String tenLoaiPhuongTien ;
protected HangSanXuat hangSanXuat; 
//contruction 
public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
	super();
	this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	this.hangSanXuat = hangSanXuat;
}
public String getTenLoaiPhuongTien() {
	return tenLoaiPhuongTien;
}
public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
	this.tenLoaiPhuongTien = tenLoaiPhuongTien;
}
public HangSanXuat getHangSanXuat() {
	return hangSanXuat;
}
public void setHangSanXuat(HangSanXuat hangSanXuat) {
	this.hangSanXuat = hangSanXuat;
}
public String layTenHangSanXuat() { 
	return this.hangSanXuat.getTenHangSanXuat(); 
}
;public void batDau() { 
	System.out.println("Tăng tốc..... ");
}
public void tangToc() { 
	System.out.println("Tăng tốc ");
}
public void dungLai() { 
	System.out.println("Dung lai ");
}
public abstract double layVanToc() ; 

}

