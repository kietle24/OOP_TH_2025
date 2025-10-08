package QLCD;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class CDRom {
private String maCD;  
private String tuaCD ; 
private LocalDate ngayPhatHanh ; 
private boolean trangThai ; 
private int soLuong; 
private double gia ;
public CDRom(String maCD, String tuaCD, LocalDate ngayPhatHanh, boolean trangThai, int soLuong, double gia) {
	super();
	this.maCD = maCD;
	this.tuaCD = tuaCD;
	this.ngayPhatHanh = ngayPhatHanh;
	this.trangThai = trangThai;
	this.soLuong = soLuong;
	this.gia = gia;
}
public CDRom() {
	super();
	this.maCD = "";
	this.tuaCD = "";
	this.ngayPhatHanh = LocalDate.now();
	this.trangThai = true;
	this.soLuong = 0;
	this.gia = 0.0;
}
public String getMaCD() {
	return maCD;
}
public void setMaCD(String maCD) {
	if(maCD == null || maCD.trim().isEmpty()) { 
		throw new IllegalArgumentException("khong duoc de trong ma cd") ; 
	}
	this.maCD = maCD.trim();
}
public String getTuaCD() {
	return tuaCD;
}
public void setTuaCD(String tuaCD) {
	if(tuaCD == null || tuaCD.trim().isEmpty()) { 
		throw new IllegalArgumentException("khong duoc de trong tua de cd ") ; 
	}
	this.tuaCD = tuaCD.trim();
}
public LocalDate getNgayPhatHanh() {
	return ngayPhatHanh;
}
public void setNgayPhatHanh(LocalDate ngayPhatHanh) throws IllegalAccessException {
	if(ngayPhatHanh == null || ngayPhatHanh.isAfter(LocalDate.now())) {  
		throw new IllegalAccessException("ngay phat khong dung ");
	}
	this.ngayPhatHanh = ngayPhatHanh;
}
public boolean isTrangThai() {
	return trangThai;
}
public void setTrangThai(boolean trangThai) {
	this.trangThai = trangThai;
}
public int getSoLuong() {
	return soLuong;
}
public void setSoLuong(int soLuong) throws IllegalAccessException {
	if(soLuong < 0 )  throw new IllegalAccessException("khong dung so luong ");
	this.soLuong = soLuong;
}
public double getGia() {
	return gia;
}
public void setGia(double gia) throws IllegalAccessException {
	if(gia < 0 ) throw new IllegalAccessException("gia khong duoc am ") ; 
	this.gia = gia;
} 
// kiem gia cd cu (> 3 nam )
public boolean isCDCu() {  
	Period period = Period.between(ngayPhatHanh,LocalDate.now()) ; 
	return period.getYears() > 3 ; 
}	
public int tinhSoNam() {  
	Period period = Period.between(ngayPhatHanh,LocalDate.now()) ; 
	return period.getYears()  ; 
}
@Override
public String toString() {
	// dinh dang ngay cua viet nam 
	DateTimeFormatter dateFormatter  = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // phuong thuc tao mot format mau de ban tu dinh nghia 
	String ngayPHFmatted = ngayPhatHanh.format(dateFormatter) ; 
	// dinh dang gia tien localdate viet nam 
	return ngayPHFmatted;
	
	
}

}
