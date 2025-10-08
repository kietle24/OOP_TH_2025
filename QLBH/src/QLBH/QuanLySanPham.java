package QLBH;
import java.util.Arrays;
import java.util.Comparator;

public class QuanLySanPham {
	  SanPham[] dssp ;
	 int count = 0 ; 

	 public QuanLySanPham (int n) {   
		 this.dssp = new SanPham[5]; 
		 this.count = 0 ; 
	 }
	boolean kiemtraMaTrung(String ma ) { 
		for(int i =0 ; i < count ; i++) { 
			 if(dssp[i].getMaSP().equalsIgnoreCase(ma)) { 
				
				  return true ; 
			 }
		}
		return false ; 
		
	}
	
	private void tangKT() { 
		SanPham[] tam =  new SanPham[dssp.length*2] ; 
		for(int i =0 ; i < count ; i ++) {
			  tam[i] = dssp[i] ; 
		}
		dssp = tam ; 
	}
	// them san pham moi 
	boolean themSanPham(SanPham sp) {
	     if (count >= dssp.length) { tangKT();}
		 if(kiemtraMaTrung(sp.getMaSP())) { 
			 System.out.println("ma "+ sp.getMaSP() +" bi trung ");
				return false  ; 
		 }
		 dssp[count++] = sp; 
		return true ; 
	}

   boolean xoaTheoMa(String ma ) { 
		for(int i = 0 ; i < count ; i++) {
			 if(dssp[i].getMaSP().equalsIgnoreCase(ma)) { 
				 for(int j = i ; j < count - 1 ; j++) { 
					 dssp[j] = dssp[j+ 1 ] ; 
				 }
				 dssp[count-1] = null ; // set phan tu cuoi cung ve null 
				 count-- ; // giam bien den trong so luong thuc 
				 System.out.println("da xoa san pham co ma "+ma);
				 return true ; 
			 }
		}
		System.out.println("khong tim thay ma ");
		return false ; 
	}
	// sua gia moi 
boolean suaGiaMoi(String ma , double giaMoi ) throws IllegalAccessException { 
		 if(giaMoi <= 0 ) { 
			  System.out.println("gia khong hop le ");
			  return false ; 
		 }			  
for(int i =0 ; i < count ; i++) {
	if(dssp[i].getMaSP().equalsIgnoreCase(ma)) { 
		dssp[i].setGiaBan(giaMoi); // Giả sử bạn có setter setGiaBan trong SanPham
		System.out.println("Đã cập nhật giá của sản phẩm " + ma + " thành " + giaMoi + "đ.");
            return true;
	   }
  }
System.out.println("khong tim thay san pham ");
		  return false  ; 
	 }
	
	
void timKiemTheoTen(String tuKhoa ) { 
		 boolean tim = false ; 
		 for(int i =0 ; i < count ; i ++) {  
			 if(dssp[i].getTenSP() != null && dssp[i].getTenSP().contains(tuKhoa)) { 
				  System.out.println("tim thay ten san pham ");
				  tim =true ; 
			 }
		 }
		 if(!tim) { 
			 System.out.println("khong tim thay ten san pham " +tuKhoa);
		 }
	}

 void sapXepTheoGiaTang() { 
	 for(int i =0  ; i < count -1 ; i++) { 
		  for(int j =0 ; j < count -1 ; j++) { 
			  if(dssp[j].getGiaBan() > dssp[j+1].getGiaBan()) { 
				  SanPham temp = dssp[j] ; 
				  dssp[j] =dssp[j+ 1] ; 
				  dssp[j + 1] = temp ; 
			  }
		  }
	 }
	 System.out.println("da sap xep san pham theo gia tang dan ");
}
void timKiemTheoLoai(LoaiSanPham loai ) { 
	 boolean tim = false ; 
	 for(int i =0 ; i < count ; i ++) {  
		 if(dssp[i].getLoaiSanPham().equals(loai)) { 
			  System.out.println("tim thay loai san pham ");
			  tim =true ; 
		 }
	 }
	 if(!tim) { 
		 System.out.println("khong tim thay loai san pham ");
	 }
}

void inTatCa() { 
	if(count == 0 ) 
	{ 
		System.out.println("danh sach san pham trong ");
	}else  {
	for(SanPham sp : dssp) { 
		System.out.println(sp);
	}
	}
}




}


	
