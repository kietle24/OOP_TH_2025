package QLCD;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CDROM {
private String maCD ; 
private String tuaCD ; 
private LocalDate ngayPhatHanh ; 
private boolean trangThaiCD; 
private int soLuong ; 
private double gia ;

public CDROM() { 
	this.maCD = "" ; 
	this.tuaCD = "" ; 
	this.ngayPhatHanh = LocalDate.now() ;
	this.trangThaiCD = true ; 
}
public CDROM(String maCD, String tuaCD,
		LocalDate ngayPhatHanh,
		boolean trangThaiCD,
		int soLuong, double gia) {
	super();
	this.maCD = maCD;
	this.tuaCD = tuaCD;
	this.ngayPhatHanh = ngayPhatHanh;
	this.trangThaiCD = trangThaiCD;
	this.soLuong = soLuong;
	this.gia = gia;
}
public String getMaCD() {
	return maCD;
}
//Người dùng có thể nhập " CD01 " hoặc " " (chỉ toàn khoảng trắng). Nếu không dùng trim(), chuỗi " " sẽ vẫn được coi là không rỗng, nhưng thực tế lại vô nghĩa.
public String setMaCD(String maCD) {
	if(maCD == null || maCD.trim().isEmpty()) {// trim = loai bo tat cac cac ki tu khoang trang  bao gom tab cac o dau va cuoi chuoi dam bao chuan hoa du lieu 
	throw new  IllegalArgumentException("ma cd khong duoc de trong ") ; 
	}
	return this.maCD = maCD.trim();
}
public String getTuaCD() {
	return tuaCD;
}
public void setTuaCD(String tuaCD) {
	if(tuaCD == null || tuaCD.trim().isEmpty()) {// trim = loai bo tat cac cac ki tu khoang trang  bao gom tab cac o dau va cuoi chuoi dam bao chuan hoa du lieu 
		throw new  IllegalArgumentException("tua cd khong duoc de trong ") ; 
		}
	this.tuaCD = tuaCD.trim();
}
public LocalDate getNgayPhatHanh() {
	return ngayPhatHanh;
}
public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
	if(ngayPhatHanh == null || ngayPhatHanh.isAfter(LocalDate.now())) {// trim = loai bo tat cac cac ki tu khoang trang  bao gom tab cac o dau va cuoi chuoi dam bao chuan hoa du lieu 
		throw new  IllegalArgumentException("ngay phat hanh cd khong duoc de trong ") ; 
		}

	this.ngayPhatHanh = ngayPhatHanh;
}
public boolean isTrangThaiCD() {
	return trangThaiCD;
}
public void setTrangThaiCD(boolean trangThaiCD) {
	this.trangThaiCD = trangThaiCD;
}
public int getSoLuong() {
	return soLuong;
}
public void setSoLuong(int soLuong) {
	if(soLuong < 0 ) {// trim = loai bo tat cac cac ki tu khoang trang  bao gom tab cac o dau va cuoi chuoi dam bao chuan hoa du lieu 
		throw new  IllegalArgumentException("so luong khong duoc de am") ; 
		}
	this.soLuong = soLuong;
}
public double getGia() {
	
	return gia;
}
public void setGia(double gia) {
	if(gia < 0 ) {// trim = loai bo tat cac cac ki tu khoang trang  bao gom tab cac o dau va cuoi chuoi dam bao chuan hoa du lieu 
		throw new  IllegalArgumentException("gia khong duoc de am") ; 
		}
	this.gia = gia;
}
// kiem tra CDROM CO PHAI LA CU(3 nam )
public boolean isCDcu() { 
	Period period = Period.between(ngayPhatHanh, LocalDate.now()) ; 
	return period.getYears() > 3 ; 
}
// tinh so nam ngay tu ngay phat hanh
 public int tinhSoNam() {
	 Period period = Period.between(ngayPhatHanh, LocalDate.now());
	 return period.getYears() ; 
 }
 // phuong thuc TOString() voi dinh dang Local VietNam 
 @Override
 public String toString() {
	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy" ); 
	String ngayPHFormatted = ngayPhatHanh.format(dateFormatter);
// dinh dang gia tien theo locale VIET NAM 
Locale localeVN = new Locale("vi","VN") ; 
NumberFormat currencyFormatter =NumberFormat.getCurrencyInstance(localeVN);
String giaFormatted = currencyFormatter.format(gia);
// xac dinh trang thai CD (cu/moi )
String tinhTrang = isCDcu() ? "CD cu ("+ tinhSoNam() + "nam" : "CD moi" ;  
String trangThai = trangThaiCD ? "dang hoat dong " : "ngung hoat dong " ; 
return String.format("%-6s | %-25s| %-12s | %-15s | %8s | %12s | %-10s", maCD, tuaCD , ngayPHFormatted , trangThai , soLuong, giaFormatted, tinhTrang); 
 }
}
