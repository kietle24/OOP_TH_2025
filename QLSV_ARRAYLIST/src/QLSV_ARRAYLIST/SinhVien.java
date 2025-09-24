package QLSV_ARRAYLIST;

public class SinhVien {
private String maSV ; 
private String hoVaTen ; 
private int namSinh ; 
private float diemTB ;
public SinhVien(String maSV, String hoVaTen, int namSinh, float diemTB) {
	this.maSV = maSV;
	this.hoVaTen = hoVaTen;
	this.namSinh = namSinh;
	this.diemTB = diemTB;
}
public String getMaSV() {
	return maSV;
}
public void setMaSV(String maSV) {
	this.maSV = maSV;
}
public String getHoVaTen() {
	return hoVaTen;
}
public void setHoVaTen(String hoVaTen) {
	this.hoVaTen = hoVaTen;
}
public int getNamSinh() {
	return namSinh;
}
public void setNamSinh(int namSinh) {
	this.namSinh = namSinh;
}
public float getDiemTB() {
	return diemTB;
}
public void setDiemTB(float diemTB) {
	this.diemTB = diemTB;
}
public SinhVien() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "SinhVien [maSV=" + maSV + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", diemTB=" + diemTB + "]";
} 

}
