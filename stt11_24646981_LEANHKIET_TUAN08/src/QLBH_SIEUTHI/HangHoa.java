package QLBH_SIEUTHI;
import java.text.DecimalFormat;

public abstract class HangHoa {
	protected final String maHang ; 
	protected String tenHang; 
	protected int soLuong ; 
	protected double donGia ;
	public HangHoa(String maHang, String tenHang, int soLuong, double donGia) {
		if(maHang == null || maHang.trim().isEmpty())  {  
			 throw new IllegalArgumentException("ma khong duoc de trong ");
		}
		this.maHang = maHang;
		setDonGia(donGia) ; 
		setSoLuong(soLuong);
		setTen(tenHang);
	
	}
	public HangHoa(String maHang) {
		this.maHang = maHang;
	}
	public String getTen() {
		return tenHang;
	}
	public void setTen(String ten) {
		if(ten == null || ten.isEmpty())  {  
			 throw new IllegalArgumentException("ten khong duoc de trong ");
		}
		this.tenHang = ten;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		if(soLuong < 0 ) { 
			soLuong = 0  ;  
		}
		this.soLuong = soLuong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if(donGia < 0 ) { 
			donGia = 1.0 ; 
		}
		this.donGia = donGia;
	}
	public String getMa() {
		return maHang;
	} 
	public abstract double tinhVAT() ;
	@Override
	public String toString() {
		DecimalFormat df1 = new DecimalFormat("#,##0 VND") ; 
		DecimalFormat df2 = new DecimalFormat("0.00%") ;
		return String.format("%-7s | %-20s | %15s | %18s | %19s ",maHang, tenHang, soLuong
				,df1.format(donGia)
				,df2.format(tinhVAT()));

	} 
	
	
	
}
