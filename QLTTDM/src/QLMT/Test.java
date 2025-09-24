package QLMT;

public class Test {
public static void main(String[] args) {
	Ngay ngay1 = new Ngay(1,12,2025) ; 
	Ngay ngay2 = new Ngay(2,12,2025) ; 
	Ngay ngay3 = new Ngay(3,12,2025) ; 
	
	QuocGia quocgia1  = new QuocGia("1","VN"); 
	QuocGia quocgia2  = new QuocGia("2","USA");
	QuocGia quocgia3 = new QuocGia("3","JAPAN" ) ; 
	
	HangSanXuat hang1 = new HangSanXuat("ASUS" , quocgia1) ; 
	HangSanXuat hang2 = new HangSanXuat("LAPTOP" , quocgia2) ; 
	HangSanXuat hang3 = new HangSanXuat("IMAC", quocgia3) ; 
	
	MayTinh mayTinh1 = new MayTinh(hang1, ngay1, 1500, 12);
	MayTinh mayTinh2 = new MayTinh(hang2, ngay2, 2000, 24);
	MayTinh mayTinh3 = new MayTinh(hang3, ngay3, 1000, 12);
	
	System.out.println("M1 < M2: "+mayTinh1.kiemTraGia(mayTinh3));
	System.out.println("M1 >  M2  "+mayTinh2.kiemTraGia(mayTinh2));

	System.out.println("M1:"+ mayTinh1.layTenQuocGia());
	System.out.println("M2:"+ mayTinh2.layTenQuocGia());
	
}
}
