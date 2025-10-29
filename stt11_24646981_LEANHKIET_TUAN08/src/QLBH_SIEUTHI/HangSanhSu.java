package QLBH_SIEUTHI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class HangSanhSu extends HangHoa {
	private String nhaSanXuat ; 
	private LocalDate ngayNhapKho  ;
	public HangSanhSu(
			String maHang,
			String tenHang,
			int soLuong,
			double donGia,
			String nhaSanXuat,
			LocalDate ngayNhapKho) {
		super(maHang, tenHang, soLuong, donGia);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho  ; 
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public LocalDate getNgayNhapKho() {
	
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho == null)  {
			 throw new IllegalArgumentException(" ngay nhap kho khong duoc null ") ; 
		}
		if(ngayNhapKho.isAfter(getNgayNhapKho())) { 
			 throw new IllegalArgumentException("ngay nhap kho khong duoc o tuong lai ") ; 
		}
		this.ngayNhapKho = ngayNhapKho;
	}
	 public boolean isBanCham() {
	        long daysInStock = ChronoUnit.DAYS.between(ngayNhapKho, LocalDate.now());
	        return getSoLuong() > 50 && daysInStock > 10;
	    }
	@Override
	public double tinhVAT() {
		return 0.10 ;
	} 
	@Override
	public String toString() {
		DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		return String.format("%s | NSX : %s | Nhap kho : %s | Ban Cham: %s"
				,super.toString()
				,this.nhaSanXuat
				,dtf.format(ngayNhapKho)
				,isBanCham() ? "CO" : "Khong") ;  
	}	
    
}
