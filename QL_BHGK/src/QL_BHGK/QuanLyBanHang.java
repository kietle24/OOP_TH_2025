package QL_BHGK;

public class QuanLyBanHang {
	SanPham [] dssp; 
	int count =0 ;
	public QuanLyBanHang(int n ) {
		this.dssp = new SanPham[n] ; 
 		this.count = 0;
	}
private void tangKT() {  
	 SanPham[] tam = new SanPham[dssp.length*2] ; 
	 for(int i =0 ; i  < count ; i++) {
		  if (dssp[i] != null)
		 tam[i] = dssp[i] ; 
	 }
	 dssp = tam ; 
}	
boolean kiemTraMaSp(String ma) { 
	for(int i =0 ; i < count ; i++) { 
		 if (dssp[i] != null) 

		if(dssp[i].getMaSP().equalsIgnoreCase(ma)) {
			System.out.println("Ma SP " +ma+" bi Trung ");
			return true ; 
		}
	}
	return false ;
}
boolean themSanPham(SanPham sp  ) { 
	if(count >= dssp.length) {
		tangKT()  ; 
	}
	
	if(kiemTraMaSp(sp.getMaSP())) { 
		 System.out.println("ma "+ sp.getMaSP()+"trung");
		 return false ; 
	}
	dssp[count++] = sp  ; 
	return true ; 
}
boolean xoaTheoMa(String ma) { 
	for(int i =0 ; i < count ;i++) { 
	
		if(dssp[i].getMaSP().equalsIgnoreCase(ma)) { 
			 for(int j = i  ; j < count -1 ; j++) { 
				 dssp[j] = dssp[j+1] ; 
			 }
		}
	}
	dssp[count-1] = null ; 
	count--; 
	System.out.println("xoa thanh cong ");
	return true  ; 
}
boolean suaGiaMoi(String ma , double giaMoi ) throws IllegalAccessException {  
	if(giaMoi < 0 ) {  
		System.out.println("gia khong hop le ");
		return false ; 
	}
	for(int i =0 ; i < count ; i++) {
		 if (dssp[i] != null)
		if(dssp[i].getMaSP().equalsIgnoreCase(ma)) { 
			dssp[i].setGiaBan(giaMoi); 
			System.out.println("Đã cập nhật giá của sản phẩm " + ma + " thành " + giaMoi + "đ");
	            return true;
		   }
	  }
	System.out.println("khong tim thay ma san pham ");
	return false;
}

// tim kiem theo loai sab pham 
void timKiemTheoLoai(LoaiSanPham loai) { 
    boolean tim = false; 
    for (int i = 0; i < count; i++) {  // Duyệt qua tất cả các sản phẩm trong mảng
        if (dssp[i] != null && dssp[i].getLoaiSanPham().equals(loai)) {  // Kiểm tra null trước khi thao tác
            System.out.println("Tìm thấy loại sản phẩm: " + loai);
            System.out.println(dssp[i]);  // In thông tin sản phẩm tìm thấy
            tim = true; 
        }
    }
    if (!tim) { 
        System.out.println("Không tìm thấy loại sản phẩm: " + loai);
    }
}



// im t
void timKiemTheoTen(String tuKhoa) { 
	 boolean tim = false ; 
	 for(int i =0 ; i  < count ;i++) {  
		 if(dssp[i].getTenSP().contains(tuKhoa)) { 
			  System.out.println("tim thay ten san pham ");
			  tim = true ; 
		 }
	 }
	 if(!tim) {
		  System.out.println("khong tim thay ten" + tuKhoa);
	 }
}

void sapXepTheoGiaTang() {  
	for(int i =0 ; i < count -1 ; i++) { 
		for(int j =0 ; j < count-1 ; j++) {  
			if(dssp[i].getGiaBan() > dssp[j+1].getGiaBan()) { 
				SanPham temp = dssp[j] ;
				dssp[j] = dssp[j+1] ; 
				dssp[j+1] = temp ; 
			}
		}
	}
	System.out.println("da sap xep thanh cong");
}

void inTatCa() { 
	 if(count == 0 ) {
		  System.out.println("danh sach san pham trong ");
	 }else {
		  for(SanPham sp : dssp) { 
			  System.out.println(sp);
		  }
	 }
}


}
