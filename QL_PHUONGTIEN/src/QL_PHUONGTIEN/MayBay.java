package QL_PHUONGTIEN;

public class MayBay extends PhuongTienDiChuyen{
private String loaiNhienLieu ;
private HangSanXuat hangSanXuat ; 


public MayBay( HangSanXuat hangSanXuat,
		String loaiNhienLieu) {
	super(loaiNhienLieu, hangSanXuat);
	this.loaiNhienLieu = loaiNhienLieu;
	hangSanXuat = hangSanXuat;
}

public String getLoaiNhienLieu() {
	return loaiNhienLieu;
}

public void setLoaiNhienLieu(String loaiNhienLieu) {
	this.loaiNhienLieu = loaiNhienLieu;
}

public HangSanXuat getHangSanXuat() {
	return hangSanXuat;
}

public void setHangSanXuat(HangSanXuat hangSanXuat) {
	this.hangSanXuat = hangSanXuat;
}

public double layVanToc() {
	// TODO Auto-generated method stub
	return 300;
}
public void catCanh() { 
	 System.out.println("cat canh ");
}
public void haCanh() {
	 System.out.println("Ha canh ");
}

}
