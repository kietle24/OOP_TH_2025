package QLPhongHoc;
import java.util.*;
public class QuanLyPhongHoc {
	 List<PhongHoc> dsPhong ; 	 
	 
	public QuanLyPhongHoc() { 
		 dsPhong = new ArrayList<>() ; 
	} 
	public boolean addNewRoom(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
	    PhongMayTinh phong = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
	    return addNewRoom(phong);
	}


	// them phong moi 
	public boolean addNewRoom(PhongHoc p ) {
		 for(PhongHoc ph : dsPhong ) {  
			 if(ph.getMaPhong().equalsIgnoreCase(p.getMaPhong())) 
				 return false; 
		 }
		 dsPhong.add(p) ;
		 return true; 
	}
	// tim phong theo ma so 
	public PhongHoc timPhong(String maPhong ) {  
		for(PhongHoc p : dsPhong ) { 
			if (p.getMaPhong().equalsIgnoreCase(maPhong)) 	
			return p ; 
		}
		return null;  
	}
	// hien thi tat 
	public void hienThiTatCa() {
		 for(PhongHoc p : dsPhong ) { 
			 System.out.println(p);
		 }
	}
	// lay thong tin 
	public void layThongTinDatChuan() { 
		 for(PhongHoc p : dsPhong) { 
			 if(p.datChuan())
			  System.out.println(p);
		 }
	}
	// sap xep thong tin theo day nha 
	public void sapXepTangDanTheoDayNha() { 
		dsPhong.sort(Comparator.comparing(PhongHoc :: getDayNha)) ; 
	}
	// sap xep giam dan theo dien tich 
	public void sapXepGiamDanTheoDienTich() { 
		dsPhong.sort(Comparator.comparingDouble(PhongHoc :: getDienTich).reversed());
	}
	// sap xep tang dan theo so bong den 
	public void sapXepTangDanSoBongDen() { 
		dsPhong.sort(Comparator.comparingInt(PhongHoc :: getSoBongDen)) ; 
	}
	// cap nhat so may tinh moi 
	public boolean capNhatSoMayTinh(String maPhong , int soMayTinhMoi ) { 
		for(PhongHoc p: dsPhong ) {  
				if(p instanceof PhongMayTinh && p.getMaPhong().equalsIgnoreCase(maPhong)) { 
					((PhongMayTinh) p ).setSoMayTinh(soMayTinhMoi);
					return true ; 				
			}
		}
		return false ; 
		 
	}
	// tinh tong so phong hoc 
	public int tinhTongSoPhongHoc() { 
		 return dsPhong.size()  ; 
	}
	public List<PhongMayTinh> layDanhSachPhongMay60May() { 
		 List<PhongMayTinh> kq = new ArrayList<>()  ;
		 for(PhongHoc p : dsPhong) {  
			if( p instanceof PhongMayTinh) {  // chi xy ly phong may thoi 
				 PhongMayTinh pm = (PhongMayTinh) p  ; 
				 if(pm.getSoMayTinh() == 60 ) { //	dung dieu kien 6 may 
					 kq.add(pm) ; 
				 }
			}
		
		 }
		 return kq ; 
	}
}
	
	

