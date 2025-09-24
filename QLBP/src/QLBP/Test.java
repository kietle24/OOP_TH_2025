package QLBP;

public class Test {
	public static void main(String[] args) {
		NgayChieu ngay1 = new NgayChieu(1,12,2025) ; 
		NgayChieu ngay2 = new NgayChieu(2,12,2025);
		NgayChieu ngay3 = new NgayChieu(3,12,2025) ; 
		HangSanXuat hang1 = new HangSanXuat("Hang A", "USA") ;
		HangSanXuat hang2 = new HangSanXuat("Hang B", "Japan") ; 
		HangSanXuat hang3 = new HangSanXuat("Hang C", "VietNam") ;
		BoPhim bophim1 = new BoPhim("Bo Gia",2025 , hang1 , 1000 , ngay1  );
		BoPhim bophim2 = new BoPhim("Dap Mo Cuoc Tinh",2022 , hang2 , 1000 , ngay2  );
		BoPhim bophim3 = new BoPhim("Tinh Yeu Mau Nang ",2023 , hang3 , 1000 , ngay3  );
		 System.out.println("bo 1 vs 3 "+bophim1.kiemtraPhim(bophim3));
		 System.out.println(bophim1.layTenHangSanXuat());
		 System.out.println(bophim2.layTenHangSanXuat());
		 System.out.println(bophim3.layTenHangSanXuat());
		 
		 System.out.println("gia ve sau khi khuyen mai 10 "+bophim1.giaVeKhiKhuyenMai(10));
		 System.out.println("gia ve sau khi khuyen mai 20 "+bophim2.giaVeKhiKhuyenMai(20));
		 System.out.println("giaa ve sau khi khyeb mai 30 "+bophim3.giaVeKhiKhuyenMai(30));
		 
	}

}
