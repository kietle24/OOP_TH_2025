package QLPhongHoc;

public class PhongThiNghiem extends PhongHoc {
	private String chuyenNghanh ; 
	private int sucChua ; 
	private boolean coBonChua ;
	public PhongThiNghiem(String maPhong, String dayNha,
		double dienTich, int soBongDen,String chuyenNghanh,
		int sucChua, boolean coBonChua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setChuyenNghanh(chuyenNghanh);
		setSucChua(sucChua);
		setCoBonChua(coBonChua);
	}
	public String getChuyenNghanh() {
		return chuyenNghanh;
	}
	public void setChuyenNghanh(String chuyenNghanh) {
		this.chuyenNghanh = chuyenNghanh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public void setCoBonChua(boolean coBonChua) {
	    this.coBonChua = coBonChua;
	}
	public boolean isCoBonChua() {
		return coBonChua;
	}

	@Override
	public boolean datChuan() {
		return datChuanAnhSang() && coBonChua  ; 
}
	@Override
	public String toString() {
		return String.format("%s | %16s | %13d | Dat Chuan: %s| %s ",super.toString()
				,chuyenNghanh, sucChua,coBonChua ,
				datChuan() ? "YES" : "NO") ; 
			
	}
}
