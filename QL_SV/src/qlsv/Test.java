package qlsv;

public class Test {
 public static void main(String[] args) {
	 Lop lop1= new Lop("DHKHMT", "KHOA CNTT ") ; 
	 Lop lop2 = new Lop("DHHTT", "KHOA CNTT " ) ;
	 Lop lop3 = new Lop("DHKT-VT", "KHOA CNTT ") ; 

	 NgaySinh ngay1 = new NgaySinh(1,1,2025) ; 
	 NgaySinh ngay2 = new NgaySinh(1,1,2025) ; 
	 NgaySinh ngay3 = new NgaySinh(3,1,2025) ; 

	 SinhVien sv1 = new SinhVien(1, "A" , ngay1 , 1.0 , lop1); 
	 SinhVien sv2 = new SinhVien(2, "B" , ngay2 , 8.0 , lop2);
	 SinhVien sv3 = new SinhVien(3, "C" , ngay3 , 6.0 , lop3);
	
	 System.out.println(sv1.laytenKhoa());
	 System.out.println(sv2.laytenKhoa());
	 System.out.println(sv3.laytenKhoa());
	 
	 System.out.println(sv1.kiemTraThiDau());
	 System.out.println(sv2.kiemTraThiDau());
	 System.out.println(sv3.kiemTraThiDau());
	 
	 System.out.println(sv1.kiemTraCungNgaySinh(sv3));
	 System.out.println(sv2.kiemTraCungNgaySinh(sv1));
	 
}

}
