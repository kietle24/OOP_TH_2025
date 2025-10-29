package QLBH_SIEUTHI;

import java.util.ArrayList;
import java.util.List;

public class QuanLyHangHoa {	
    private final List<HangHoa> ds = new ArrayList<>(); 
		// them hang chong trung ma 
    public boolean themHang(HangHoa h) {
        if (h == null) throw new IllegalArgumentException("Hang khong duoc null");
        if (timKiemTheoMa(h.getMa()) != null) return false; // trùng mã
        return ds.add(h);
    }
  
    // Xuất toàn bộ hàng
    public void xuatHangHoa() {
        ds.forEach(System.out::println);
    }
    public HangHoa timKiemTheoMa(String ma ) { 
    	if(ma == null ) return null ; 
    	for(HangHoa h : ds) if(ma.equalsIgnoreCase(h.getMa())) return h ; 
    	return null ; 
    }
   public double tinhTongVAT() {  
	   double sum  =0 ; 
	   for(HangHoa h : ds) { 
		   sum += h.getSoLuong() * h.getDonGia() * h.tinhVAT() ; 
	   }
	   return sum ; 
   }
	   

}
