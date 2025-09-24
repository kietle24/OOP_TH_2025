package QLSACH_ON;

public class Test {
public static void main(String[] args) {
	NgaySinh ngay1 = new NgaySinh(12,12,2025);
	NgaySinh ngay2 = new NgaySinh(13,12,2025);
	NgaySinh ngay3 = new NgaySinh(14,12,2022);
	
	TacGia tacgia1 = new TacGia("Nguyen Van A", ngay1 );
	TacGia tacgia2 = new TacGia("Nguyen Van B", ngay2 );
	TacGia tacgia3 = new TacGia("Nguyen Van C", ngay3 );
	
	Sach sach1 = new Sach("Dac Nhan Tam ", 1, tacgia1, ngay1,2023 );
	Sach sach2 = new Sach("Tinh Me", 1, tacgia2, ngay2 ,2025 );
	Sach sach3 = new Sach("Tinh Cha", 5000, tacgia2, ngay2 ,2023 );
	
	sach1.inTenSach();
	sach2.inTenSach(); 
	sach3.inTenSach() ; 
	
	System.out.println("sach 1 so voi sach 2 "+sach1.kiemTraCungNam(sach2));
	System.out.println("sach 1 so voi sach 3 "+sach1.kiemTraCungNam(sach3)) ; 
	
	System.out.println("sach 1 giam 10 "+sach1.giamGia(10));
	System.out.println("sach 2 giam gia 30"+sach1.giamGia(3));
	
}
}
