package QLSV_ARRAYLIST;
import java.util.Scanner;

public class test {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in) ; 
	DanhSachSinhVien dsssv  = new DanhSachSinhVien() ; 
	int choices = 0 ; 
	do { 
		 System.out.println("MENU--------");
		 System.out.println("chon chuc nang ");
		 System.out.println(
				 "1.them sinh vien\n " 
				 +"2.in danh sach\n"
				 +"3.kiem tra danh sach co rong hay khong \n"
				 +"4.lay so luong sinh vien trong danh sach \\n"
				 +"5.lam rong danh sach sinh vien \n"
				 +"6.kiem tra sinh vien co ton tai trong ds hay khong. dua tren ma sinh vien\n"
				 +"7.xoa mot sinh vien ra khoi danh sach dua tren ma so sinh vien\n"
				 +"8.tim kiem tat ca sinh vien dua tren ten duoc nhap ten ban phim "
				 +"9.xuat ra danh sach tat ca sinh vien co diem tu cao den thap.\n"
				 +"0.thoat khoi chuong trinh");
		 choices = sc.nextInt() ; 
		 if(choices == 1 ) { 
			 System.out.println("nhap ma sinh vien ");String maSV = sc.nextLine() ; 
			 System.out.println("nhap ho ten sinh vien ");String hoVaTen = sc.nextLine() ; 
			 System.out.println("nhap nam sinh sinh vien ");int namSinh = sc.nextInt() ; 
			 System.out.println("nhap diem TB Cho sinh vien ");float diemTB = sc.nextFloat() ; 
			 SinhVien sv1 = new SinhVien(maSV,hoVaTen, namSinh,diemTB ) ; 
			 
		 }else if (choices == 2)  { 
			 System.out.println("in danh sach "); String maSV = sc.nextLine() ; 
		 }else if (choices == 3)  { 
			 
		 }else if (choices == 4)  { 
			 
		 }else if (choices == 5)  { 
			 
		 }else if (choices == 6)  { 
			 
		 }else if (choices == 7)  { 
			 
		 }else if (choices == 8)  { 
			 
		 }else if (choices == 9)  { 
			 
		 }else if (choices == 0)  { 
			 
		 
		 }
		 
	}while() ;
}
}
