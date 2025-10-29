package QLBH_SIEUTHI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class HangThucPham extends HangHoa{
	private LocalDate ngaySanXuat ; 
	private LocalDate ngayHetHan ; 
	private String nhaCungCap  ;
	public HangThucPham(String ma, String ten,
			int soLuong, double donGia, 
			LocalDate ngaySanXuat,
			LocalDate ngayHetHan,
			String nhaCungCap) {
		super(ma, ten, soLuong, donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
		setNhaCungCap(nhaCungCap);
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat == null )  { 
			 ngaySanXuat = LocalDate.now(); 
			 throw new IllegalArgumentException("Ngay SX khong duoc null ") ; 
		}
		this.ngaySanXuat = ngaySanXuat;
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	   public void setNgayHetHan(LocalDate ngayHetHan) {
	        if (ngayHetHan == null)
	            throw new IllegalArgumentException("Ngay het han khong duoc null");
	        if (ngayHetHan.isBefore(ngaySanXuat))
	            throw new IllegalArgumentException("Ngay het han phai >= ngay san xuat");
	        this.ngayHetHan = ngayHetHan;
	    }
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		if(nhaCungCap == null || nhaCungCap.trim().isEmpty()) { 
			 nhaCungCap= "chua xac dinh duoc ncc  " ; 
		}
		this.nhaCungCap = nhaCungCap;
	} 
	@Override
	public double tinhVAT() {
		return 0.05;
	}	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		return String.format("%s | %s | %s | %s ", super.toString(),
				dtf.format(ngayHetHan),
				dtf.format(ngaySanXuat),
				nhaCungCap
				) ;
	}
	}
	


