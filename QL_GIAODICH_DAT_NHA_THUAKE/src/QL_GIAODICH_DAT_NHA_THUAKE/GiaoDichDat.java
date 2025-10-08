package QL_GIAODICH_DAT_NHA_THUAKE;

public class GiaoDichDat extends GiaoDich{
private String loaiDat ; 
private double dienTich ;

public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiDat, double dienTich) {
    super(maGiaoDich, ngayGiaoDich, donGia);
    this.loaiDat = loaiDat;
    this.dienTich = dienTich;
}
public String getLoaiDat() {
	return loaiDat;
}
public void setLoaiDat(String loaiDat) {
	this.loaiDat = loaiDat;
}

public double getDienTich() {
	return dienTich;
}
public void setDienTich(double dienTich) throws IllegalAccessException {
	if(dienTich < 0 ) { 
		throw new IllegalAccessException("vui luong nhap lai dien tich "); 
	}
	this.dienTich = dienTich;
}



@Override
public double tinhThanhTien() {
	if(loaiDat.equals("A")) { 
		 return dienTich*donGia* 1.5 ; 
	}else { 
		 return dienTich*donGia ; 
	}
}


}
