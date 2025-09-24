package QLSACH_ON;

public class TacGia {
private String tenTacGia ;
private NgaySinh ngaySinh ;
public TacGia(String tenTacGia, NgaySinh ngaySinh) {
	super();
	this.tenTacGia = tenTacGia;
	this.ngaySinh = ngaySinh;
}
public String getTenTacGia() {
	return tenTacGia;
}
public void setTenTacGia(String tenTacGia) {
	this.tenTacGia = tenTacGia;
}
public NgaySinh getNgaySinh() {
	return ngaySinh;
}
public void setNgaySinh(NgaySinh ngaySinh) {
	this.ngaySinh = ngaySinh;
}

}
