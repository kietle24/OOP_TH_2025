package QL_PHONGKHAM;

import java.time.LocalDate;

public class NhanVienChamSocKH extends NhanVien{
	private int soCong;  
	
	 public NhanVienChamSocKH(String hoTen, LocalDate ngaySinh, String maSoThue, double luongCanBan, int soCong) {
	        super(hoTen, ngaySinh, maSoThue, luongCanBan);
	        this.soCong = soCong;
	    }
	 
	 public double tinhLuong() { 
		   return luongCanBan + 200000 * soCong; 
	 }
	 public String toString() {
	        return super.toString() + ", Lương NVCSKH: " + tinhLuong();
	    }

}
