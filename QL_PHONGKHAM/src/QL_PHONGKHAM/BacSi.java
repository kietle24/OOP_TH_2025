package QL_PHONGKHAM;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class BacSi extends NhanVien{
	private int soGioTangCa ; 
	private DayOfWeek ngayTrongTuan ;
	
	public BacSi(String hoTen, LocalDate ngaySinh, String maSoThue, double luongCanBan, int soGioTangCa) {
		super(hoTen, ngaySinh, maSoThue, luongCanBan);
		this.soGioTangCa = soGioTangCa;
		this.ngayTrongTuan = ngayTrongTuan;
	}
	 @Override
	public double tinhLuong() {  
		double luongTangCa = 0 ; 
		if(ngayTrongTuan == DayOfWeek.SATURDAY || ngayTrongTuan == DayOfWeek.SUNDAY ) { 
			 luongTangCa = 300000* soGioTangCa ; 
		} else { 
			luongTangCa = 200000* soGioTangCa;  
		}
		return luongCanBan +luongTangCa ; 
		
	}
	 public String toString() { 
		 return super.toString() + "luong bac si " + tinhLuong() ;
	 }
	 


}
