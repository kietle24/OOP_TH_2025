package QL_GIAODICH_DAT_NHA_THUAKE;

public class Test {
	
public static void main(String[] args) {
	QuanLyNhaDat qlnd = new QuanLyNhaDat()  ;
		GiaoDichDat gddat1= new GiaoDichDat("D001","2025-6-12" , 100000  , "A" , 200);
		GiaoDichDat gddat2= new GiaoDichDat("D002","2025-7-12" , 200000  , "B" , 300);  
		GiaoDichDat gddat3= new GiaoDichDat("D003","2025-7-12" , 200000  , "B" , 300);  
		
	    GiaoDichNha gdNha1 = new GiaoDichNha("GD04", "2025-10-10", 5000000, "cao cap", "Đà Nẵng", 100);
        GiaoDichNha gdNha2 = new GiaoDichNha("GD05", "2025-10-11", 3000000, "thường", "Hà Nội", 80);

	 
		
		qlnd.themGiaoDich(gddat1) ; 
		qlnd.themGiaoDich(gddat2) ; 
		qlnd.themGiaoDich(gddat3) ; 
		qlnd.inTieuDe(); 
		qlnd.inTatCa();
		qlnd.tinhTongSoluong();
	    qlnd.tinhTrungBinhThanhTienTatCa();
		 
		
		

	}
}

