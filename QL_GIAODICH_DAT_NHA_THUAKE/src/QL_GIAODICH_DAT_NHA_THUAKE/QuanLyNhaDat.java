package QL_GIAODICH_DAT_NHA_THUAKE;
import java.util.*;
public class QuanLyNhaDat {
private List<GiaoDich> danhSachGiaoDich= new ArrayList<>()  ;
public QuanLyNhaDat() {
	this.danhSachGiaoDich  = new ArrayList() ; 
} 
public void themGiaoDich(GiaoDich giaoDich ) { 
	danhSachGiaoDich.add(giaoDich); 
}
public void tinhTongSoluong() { 
	 int countDat = 0 ; 
	 int countNha = 0 ; 
	 for(GiaoDich gd : danhSachGiaoDich) { 
		  if(gd instanceof GiaoDichDat ) { 
			  countDat++ ; 
		  } else if (gd instanceof GiaoDichNha) { 
	            countNha++; 
		  }
	 }
	 System.out.println("tong so giao dich dat" + countDat);
	 System.out.println("tong so giao dich nha" + countNha );
}
public double tinhTrungBinhThanhTienTatCa() {  
    if (danhSachGiaoDich == null || danhSachGiaoDich.isEmpty()) return 0;

    double tongThanhTien = 0; 
    int count = 0;  

    for (GiaoDich gd : danhSachGiaoDich) { 
        tongThanhTien += gd.tinhThanhTien(); 
        count++; 
    }

    return tongThanhTien / count;  
}

public void inTieuDe() { s
	   System.out.printf("%-15s | %-6s| %s\n",
			   "LOẠI GIAO DỊCH", "MÃ", "NGÀY");
}


public void inTatCa() {  
	for(GiaoDich gd : danhSachGiaoDich) { 
	System.out.println(gd);
	}
	}
}

