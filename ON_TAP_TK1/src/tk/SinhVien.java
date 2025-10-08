package tk;
import java.time.*; 
public class SinhVien {
	private String maSinhVien ; 
	private String hoTen ; 
	private LocalDate ngaySinh ; 
	private GioiTinh gioiTinh ;
	private double diemTB  ;
	
	
	public SinhVien() {
		
	}

	public SinhVien(String maSinhVien, String hoTen, LocalDate ngaySinh, GioiTinh gioiTinh, double diemTB) throws IllegalAccessException {
		if(maSinhVien == null || maSinhVien.trim().isEmpty()) { 
			 throw new IllegalAccessException("chua cap nhat gioi tinh ") ;
		}
		this.maSinhVien = maSinhVien.trim();
		setHoTen(hoTen);
		setNgaySinh(ngaySinh);
		setGioiTinh(gioiTinh) ; 
		setDiemTB(diemTB) ; 
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if(hoTen == null || hoTen.trim().isEmpty()) {
			 throw new IllegalArgumentException("chua cap nhat ho ten "); 
		}
		this.hoTen = hoTen.trim();
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		if(ngaySinh.isAfter(LocalDate.now())) {
			 throw new IllegalArgumentException("ngay sinh khong hop le ") ; 
		}
		int tuoi = Period.between(ngaySinh, LocalDate.now()).getYears() ; 
		if(tuoi < 18 ) { 
			 throw new IllegalArgumentException("sinh vien phai tu 18 tuoi tro len "); 
		}
		this.ngaySinh = ngaySinh;
	}

	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(GioiTinh gioiTinh) {
		if(gioiTinh == null) { 
			 
		}
		this.gioiTinh = gioiTinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) { 
		if(diemTB < 0.0 || diemTB > 10.0) { 
			throw new IllegalArgumentException("diem trung binh tu 0 den 10 ") ; 
		}
		this.diemTB = diemTB;
	}

	@Override
	public String toString() {
		return String.format(
				"|ma sv: %6s| ho ten: %12s| gioi tinh: %2s| ngay sinh :%10s| diem tb :%.2f |"
				,maSinhVien
				,hoTen
				,(gioiTinh == GioiTinh.NAM ? "Nam" : "Nu")
				,ngaySinh,
				diemTB
	
				) ; 
	} 
	
	
	
	
}
