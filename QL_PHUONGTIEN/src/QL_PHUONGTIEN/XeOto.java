package QL_PHUONGTIEN;

public class XeOto extends PhuongTienDiChuyen{
	private HangSanXuat hangSanXuat ; 
private String loaiNhienLieu ;


public XeOto(
		HangSanXuat hangSanXuat, String loaiNhienLieu) {
	super(loaiNhienLieu, hangSanXuat);
	hangSanXuat = hangSanXuat;
	this.loaiNhienLieu = loaiNhienLieu;
}


public HangSanXuat getHangSanXuat() {
	return hangSanXuat;
}


public void setHangSanXuat(HangSanXuat hangSanXuat) {
	this.hangSanXuat = hangSanXuat;
}


public String getLoaiNhienLieu() {
	return loaiNhienLieu;
}


public void setLoaiNhienLieu(String loaiNhienLieu) {
	this.loaiNhienLieu = loaiNhienLieu; 
}


@Override
public double layVanToc() {
	// TODO Auto-generated method stub
	return 120;
}

}
