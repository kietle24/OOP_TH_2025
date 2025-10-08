package QL_GIAODICH_DAT_NHA_THUAKE;

public abstract  class GiaoDich {
 protected String maGiaoDich ; 
 protected String ngayGiaoDich ; 
 protected double donGia ;
 public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia) {
	this.maGiaoDich = maGiaoDich;
	this.ngayGiaoDich = ngayGiaoDich;
	this.donGia = donGia;	
 }
 public String getMaGiaoDich() {
	return maGiaoDich;
 }
 public void setMaGiaoDich(String maGiaoDich) {
	this.maGiaoDich = maGiaoDich;
 }
 public String getNgayGiaoDich() {
	return ngayGiaoDich;
 }
 public void setNgayGiaoDich(String ngayGiaoDich) {
	this.ngayGiaoDich = ngayGiaoDich;
 }
 public double getDonGia() {
	return donGia;
 }
 public void setDonGia(double donGia) {
	this.donGia = donGia;
 }
 public abstract double tinhThanhTien() ;


 @Override
 public String toString() {
	 return String.format("%-15s | %-6s | %-11s", maGiaoDich,ngayGiaoDich,donGia ); 
 }
 

}
