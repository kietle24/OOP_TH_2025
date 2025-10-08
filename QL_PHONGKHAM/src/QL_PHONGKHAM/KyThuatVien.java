package QL_PHONGKHAM;

import java.time.LocalDate;

public class KyThuatVien extends NhanVien{
	private int soCong;  
	
	 public KyThuatVien(String hoTen, LocalDate ngaySinh, String maSoThue, double luongCanBan, int soCong) {
	        super(hoTen, ngaySinh, maSoThue, luongCanBan);
	        this.soCong = soCong;
	    }
	 
	 public double tinhLuong() { 
		   return luongCanBan + 300000 * soCong; 
	 }
	 public String toString() {
	        return super.toString() + ", Lương kỹ thuật viên: " + tinhLuong();
	    }

}
