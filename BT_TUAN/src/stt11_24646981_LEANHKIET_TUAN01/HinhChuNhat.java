package stt11_24646981_LEANHKIET_TUAN01;
import java.util.Scanner;

public class HinhChuNhat {
	private double chieuDai ; 
	private double chieuRong ; 
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) throws Exception {
		if(d> 0 ) {
		this.chieuDai = d;
	}else throw new Exception("loi chieu dai"); 
		
	}

	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) throws Exception {
		if(r> 0 ) {
			this.chieuRong = r;
		}else throw new Exception("loi chieu rong"); 
			
	}
	public HinhChuNhat() {} ; 
	public HinhChuNhat(double d , double r ) throws Exception { 
		if(d> 0 ) {
			this.chieuDai = d;
		}else throw new Exception("loi chieu dai"); 
		
		if(r>0 ) {
		this.chieuRong = r;
	}else throw new Exception("loi chieu rong"); 
		
	}
	public double getDienTich() { 
		return getChieuDai() * getChieuRong() ; 
	}
	public double getChuVi() {
	    return 2 * (getChieuDai() + getChieuRong());
	}

	public static void inTieuDe() {
	    for(int i = 0; i < 45; i++) {
	        System.out.print("-");
	    }
	    System.out.println();
	    System.out.printf("|%10s|%10s|%10s|%10s|\n", "Chieu Dai", "Chieu Rong", "Dien Tich", "Chu Vi");
	    for(int i = 0; i < 45; i++) {
	        System.out.print("-");
	    }
	    System.out.println();
	}

	
	public String toString() {
	    return String.format("|%10s|%10s|%10s|%10s|",
	            getChieuDai(), getChieuRong(), getDienTich(), getChuVi());
	}

	public static void main(String[] args) throws Exception {
		inTieuDe();
	    HinhChuNhat h1 = new HinhChuNhat(); 
	    h1.setChieuDai(20); 
	    h1.setChieuRong(20); 
	    HinhChuNhat h2 = new HinhChuNhat();
	    Scanner sc = new Scanner(System.in); 
	    System.out.print("Nhap Chieu Dai h2: "); 
	    double d = sc.nextDouble(); 
	    h2.setChieuDai(d);
	    System.out.print("Nhap Chieu Rong h2: "); 
	    double r = sc.nextDouble(); 
	    h2.setChieuRong(r);
	    inTieuDe();
	    System.out.println(h1);
	    System.out.println(h2);
	    System.out.println("Ket qua chieu dai, chieu rong:"); 
	    System.out.println("Chieu Dai HCN h1:"+h1.getChieuDai());
	    System.out.println("Chieu Rong HCN h1:"+h1.getChieuRong());
	    
	   
	   
	   
	}


}
