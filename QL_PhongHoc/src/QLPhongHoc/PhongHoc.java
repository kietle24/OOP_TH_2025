package QLPhongHoc;

public abstract class PhongHoc {
	protected String maPhong ; 
	protected String dayNha ; 
	protected double dienTich; 
	protected int soBongDen ;
	public PhongHoc() {
		
	}
	public PhongHoc(
			String maPhong,
			String dayNha,
			double dienTich,
			int soBongDen) {
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}
	
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		if(maPhong == null || maPhong.trim().isEmpty())  { 
			 throw new IllegalArgumentException("ma phong khong hop le") ; 
		}
 		this.maPhong = maPhong.trim();
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		if(dayNha == null || dayNha.trim().isEmpty()) { 
			 throw new IllegalArgumentException("day nha khong hop le "); 
		}
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		if(dienTich  <  0 ) { 
			 throw new IllegalArgumentException("dien tich > 0 ") ; 
		}
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		if(soBongDen < 0 ) { 
			throw new IllegalArgumentException("so bong den >= 0 ") ; 
		}
		this.soBongDen = soBongDen;
	}
	public abstract boolean datChuan () ; 
	public boolean datChuanAnhSang() {
	        return soBongDen >= soBongDenToiThieu();
	    }
	public final int soBongDenToiThieu() { 
		 return (int) Math.ceil(dienTich / 10.0 ) ; // ct thuc final = dientich /10.0 
	}
	@Override
	public String toString() {
		return String.format("%-8s | %-10s | %.2f | %8d ",maPhong , dayNha ,dienTich ,soBongDen);
	} 
		
}
