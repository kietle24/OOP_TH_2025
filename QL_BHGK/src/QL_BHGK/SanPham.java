package QL_BHGK;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SanPham {
	
	private static String [] danhsachMa = new String[10]  ; 
	private static int soLuongMa = 0 ; 
	private String maSP ; 
	private String  tenSP ; 
	private LoaiSanPham loaiSanPham ;
	private double giaBan ; 
	private LocalDate ngayNhap ;
	private boolean conHang;

	
	public SanPham() {
	}

	public SanPham(String maSP, String tenSP, LoaiSanPham loaiSanPham,
			double giaBan, LocalDate ngayNhap , boolean conHang ) throws IllegalAccessException {
		setMaSP(maSP);
		setTenSP(tenSP);
		setLoaiSanPham(loaiSanPham);
		setGiaBan(giaBan);
		setNgayNhap(ngayNhap); 
		setConHang(conHang) ; 
	}

	public static String[] getDanhsachMa() {
		return danhsachMa;
	}

	public static void setDanhsachMa(String[] danhsachMa) {
		SanPham.danhsachMa = danhsachMa;
	}

	public static int getSoLuongMa() {
		return soLuongMa;
	}

	public static void setSoLuongMa(int soLuongMa) {
		SanPham.soLuongMa = soLuongMa;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) throws IllegalAccessException {
		if(maSP == null || maSP.trim().isEmpty()) { 
			throw new IllegalAccessException("nhap ma khong hop le ") ; 
		}
		this.maSP = maSP.trim();
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public LoaiSanPham getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) throws IllegalAccessException {
		if(giaBan < 0 ) {
			 throw new IllegalAccessException("gia tien khong hop le ") ; 
		}
		this.giaBan = giaBan;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		if(ngayNhap.isAfter(LocalDate.now())) { 
			 throw new IllegalArgumentException("ngay nhap khong hop le ") ; 
		}
		this.ngayNhap = ngayNhap;
	}

	
	
	public boolean isConHang() {
		return conHang;
	}

	public void setConHang(boolean conHang) {
		this.conHang = conHang;
	}

	public String toString() {
		NumberFormat nf  = NumberFormat.getIntegerInstance(new Locale("vi","VN")) ; 
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("  %-8s  |  %-15s  |   %-12s  |  %-10s  |  %-4s |%-6s",
				maSP ,
				tenSP,
				loaiSanPham, 
				nf.format(giaBan), 
				df.format(ngayNhap), 
				(conHang ? "Co" : "Het "));
	} 
	
}

