package tk;

import java.util.Arrays;
import java.util.Comparator;

public class QuanLySinhVien {
private SinhVien[] ds  = new SinhVien[10]; 
private int soLuong ;
//construction mac dinh co suc chua khoang 10 phan tu 
public QuanLySinhVien() {
	this.ds = ds ; 
	this.soLuong = 0 ; 
}
//co suc chua n phan tu 
public QuanLySinhVien(int n ) throws IllegalAccessException {
	if(n <= 0) { 
		throw new IllegalAccessException("kich thuot mang phai lon hon 0 "); 
	}
	this.ds = ds;
	this.soLuong = soLuong;
}
//b tra ve so luong hien co trong 
public int getSoLuong() { 
	return soLuong ; 
}
//c them sinh vien (khong trung ma day thi tang gap doi )
 public void themSinhVien(SinhVien sv) { 
	  if(sv == null ) throw new IllegalArgumentException("sinh vien khong ton tai ") ; 
	  //kiem tra trung ma 
	  for(int i =0 ; i < soLuong ;i++) {
		  if (ds[i].getMaSinhVien().equals(sv.getMaSinhVien())) {
              throw new IllegalArgumentException("Mã số sinh viên trung lap"); 
          }
	  }
	  // neu mang day thi tang kich thuoc len 2 
	  
	  if(soLuong == ds.length) { 
		  ds= Arrays.copyOf(ds, soLuong*2);
	  }
	  ds[soLuong++] = sv ; 
	 
		 
 }
 //d tinh diem trung binh 
 public double tinhDiemTrungBinh() { 
	  if(soLuong == 0 ) return 0.0; 
		   double tong = 0 ; 
		   for(int i =0 ; i <soLuong ; i++) {
			    tong += ds[i].getDiemTB() ; 
		   
		   return tong / soLuong;
	  }
		   return tong ; 
 }
// e 

 public SinhVien[] sapXepTheoTenGiamDan() { 
	  SinhVien [] copy = Arrays.copyOf(ds, soLuong) ; 
	  Arrays.sort(copy,(sv1,sv2)->sv2.getHoTen().compareToIgnoreCase(sv1.getHoTen())) ; 
	  return copy ; 
 }

 public void hienthiDanhSach() { 
	 if(soLuong == 0 )  {
		 System.out.println("danh sach sinh vien trong ");
	 }
	  for(int i = 0 ; i < soLuong ; i++) { 
		   System.out.println(ds[i]);
	  }
    }
}
