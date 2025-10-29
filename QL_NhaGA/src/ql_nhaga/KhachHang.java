package ql_nhaga;
/*
 * 
 cmnd: bắt buộc, duy nhất, chỉ 9 hoặc 12 chữ số, bất biến → bỏ setter.
ten: bắt buộc, không chỉ khoảng trắng, độ dài hợp lý.
gaDen: bắt buộc, không rỗng.
giaVe: > 0, hữu hạn (không NaN/∞).
toString: định dạng số đúng.

*/
public class KhachHang {
	private final String cmnd ; 
	private String ten  ; 
	private String gaDen ; 
	private double giaVe ; 
	
	
	public KhachHang(String cmnd, String ten, String gaDen, double giaVe) {	
		if(cmnd == null || !cmnd.trim().matches("\\d{9}|\\d{12}"))
			throw new IllegalArgumentException("CMND phai co 9 hoac 12 chu so ") ; 
		this.cmnd = cmnd.trim();
		setTen(ten);
		setGaDen(gaDen);
		setGiaVe(giaVe);
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		if(ten == null || ten.trim().isEmpty()) { 
			throw new IllegalArgumentException("ten khong khong duoc de trong ");
		}
		this.ten = ten.trim();
	}


	public String getGaDen() {
		return gaDen;
	}
	public void setGaDen(String gaDen) {
		if(gaDen == null || gaDen.trim().isEmpty()) { 
			throw new IllegalArgumentException("dia diem ga den khong duoc de trong ");
			
		}
		this.gaDen = gaDen.trim();
	}
	public double getGiaVe() {
	
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		if( giaVe < 0 )  { 
			throw new IllegalArgumentException("gia ve phai lon hon 0  ");
		}
		this.giaVe = giaVe;
	}
	public String getCmnd() {
		return cmnd;
	}
	
	@Override
	public String toString() {
		return String.format("%-12s | %-20s | %20s | %1.0",
				this.cmnd , this.ten , this.gaDen, this.giaVe); 
	} 
	
	
}
