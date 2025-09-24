package QL_PHUONGTIEN;

public class Test {
public static void main(String[] args) {
	HangSanXuat hang1 = new HangSanXuat("hang 1 " , "VN") ; 
	HangSanXuat hang2 = new HangSanXuat("hang 2 " , "USA") ; 
	HangSanXuat hang3 = new HangSanXuat("hang 3 " , "Japan") ;
	
	PhuongTienDiChuyen phuongTien1 = new XeOto( hang1, "Xăng") ;
	PhuongTienDiChuyen phuongTien2 = new MayBay(hang2 ,"dau ") ; 
	PhuongTienDiChuyen phuongTien3 = new XeDap(hang3) ;
	
	MayBay maybay1 = new MayBay(hang1,"dau");
	System.out.println("lay hang san xuat "); 
	System.out.println("Phuong Tien 1:"+ phuongTien1.layTenHangSanXuat()) ;
	System.out.println("Phuong Tien 2:"+phuongTien2.layTenHangSanXuat());
	System.out.println("Phuong Tien 3:"+phuongTien3.layTenHangSanXuat());
	
	phuongTien1.batDau();
	phuongTien2.batDau();
	phuongTien3.batDau();
	
	System.out.println("lay van toc: ");
	System.out.println("p1:"+phuongTien1.layVanToc());
	System.out.println("p2:"+phuongTien2.layVanToc());
	System.out.println("p3:"+phuongTien3.layVanToc());
}
}
