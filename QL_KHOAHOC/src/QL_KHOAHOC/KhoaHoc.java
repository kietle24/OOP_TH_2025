package QL_KHOAHOC;

import java.time.LocalDate;
import java.util.HashSet;

abstract class KhoaHoc {
	private static HashSet<String> dsMaHV = new HashSet<>() ; 
	private final String maHV;        
	protected String hoTen  ; 
	private double hocPhi   ;
	protected LocalDate ngayBatDau ; 
	protected LocalDate ngayKetThuc ; 
	protected double diemMucTieu ; 
	protected double diemKetQua;

	public KhoaHoc() {
		this.maHV = null ; 
		this.diemKetQua =  0 ; 
	}

	public KhoaHoc(
	String maHV,
	String hoTen, 
	double hocPhi, 
	LocalDate ngayBatDau, 
	LocalDate ngayKetThuc,
	double diemMucTieu, 
	double diemKetQua) {
		
		setmaHV(maHV);
		setHoTen(hoTen);
		setHocPhi(hocPhi);
		setNgayBatDau(ngayBatDau);
		setNgayKetThuc(ngayKetThuc);
		setDiemMucTieu(diemMucTieu);
		setDiemKetQua(diemKetQua);
	}
	
	public static HashSet<String> getDsMaHV() {
		return dsMaHV;
	}

	public static void setDsMaHV(HashSet<String> dsMaHV) {
		KhoaHoc.dsMaHV = dsMaHV;
	}
	

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		this.hocPhi = hocPhi;
	}

	public LocalDate getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(LocalDate ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public LocalDate getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(LocalDate ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public double getDiemMucTieu() {
		return diemMucTieu;
	}

	public void setDiemMucTieu(double diemMucTieu) {
		this.diemMucTieu = diemMucTieu;
	}

	public double getDiemKetQua() {
		return diemKetQua;
	}

	public void setDiemKetQua(double diemKetQua) {
		this.diemKetQua = diemKetQua;
	}

	public String getMaHV() {
		return maHV;
	}
	
	
	
	
	
	
	
}
