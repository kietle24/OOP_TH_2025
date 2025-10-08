	package QLBH;
	
	import java.text.NumberFormat;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.util.Locale;
	
	public class SanPham {
	    // Danh sách mã dùng chung cho toàn bộ sản phẩm (static)
	    private static String[] danhSachMa = new String[100];
	    private static int soLuongMa = 0;
	
	    private String maSP;
	    private String tenSP;
	    private LoaiSanPham loaiSanPham;
	    private double giaBan;
	    private LocalDate ngayNhap;
	    private boolean conHang;
	
	    // ====== Constructors ======
	    public SanPham() {}
	
	    public SanPham(String maSP, String tenSP, LoaiSanPham loaiSanPham,
	                   double giaBan, LocalDate ngayNhap, boolean conHang) {
	        setMaSP(maSP);
	        setTenSP(tenSP);
	        setLoaiSanPham(loaiSanPham);
	        setGiaBan(giaBan);
	        setNgayNhap(ngayNhap);
	        setConHang(conHang);
	    }
	
	    // ====== Getters & Setters ======
	    public String getMaSP() { return maSP; }
	
	    public void setMaSP(String maSP) {
	        if (maSP == null || maSP.trim().isEmpty()) { 
	            throw new IllegalArgumentException("Mã sản phẩm không được để trống");
	        }
	        this.maSP = maSP.trim() ; 
	    }
	
	    public String getTenSP() { return tenSP; }
	    public void setTenSP(String tenSP) { this.tenSP = tenSP; }
	
	    public LoaiSanPham getLoaiSanPham() { return loaiSanPham; }
	    public void setLoaiSanPham(LoaiSanPham loaiSanPham) { this.loaiSanPham = loaiSanPham; }
	
	    public double getGiaBan() { return giaBan; }
	    public void setGiaBan(double giaBan) {
	        if (giaBan <= 0)
	            throw new IllegalArgumentException("Giá bán phải lớn hơn 0");
	        this.giaBan = giaBan;
	    }
	
	    public LocalDate getNgayNhap() { return ngayNhap; }
	    public void setNgayNhap(LocalDate ngayNhap) {
	        if (ngayNhap.isAfter(LocalDate.now()))
	            throw new IllegalArgumentException("Ngày nhập không được sau ngày hiện tại");
	        this.ngayNhap = ngayNhap;
	    }
	    
	    public boolean isConHang() { return conHang; }
	    public void setConHang(boolean conHang) { this.conHang = conHang; }
	
	    // ====== toString ======
	    @Override
	    
	    public String toString() {
	        NumberFormat nf = NumberFormat.getInstance(new Locale("vi", "VN"));
	       
	        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	  
	        return String.format(
	        		"%-8s |%-15s |%-12s |%-10s |%s |%s",
	            maSP,
	            tenSP,
	            loaiSanPham,
	            nf.format(giaBan),
	            df.format(ngayNhap),
	            conHang ? "Có" : "Hết"
	        );
	    }
	}
