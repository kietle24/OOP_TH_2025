package stt11_24646981_LEANHKIET_TUAN02;

public class HinhTron {
	private ToaDo tam ; 
	private double banKinh ; 
	public final double PI =3.14  ;
	
	public ToaDo getTam() { 
		return tam ; 
	}
	public void setTam(ToaDo tam ) { 
		this.tam = tam ; 
	}
	public double getBanKinh() { 
		return banKinh ; 
	}
	public void setBanKinh(double bankinh) { 
		this.banKinh = banKinh ;
	}
	public HinhTron(ToaDo tam , double bankinh) { 
		this.tam = tam ; 
		this.banKinh= bankinh ; 
	}
	public HinhTron() {} ;
	public double tinhDienTich() { 
		return getBanKinh() * getBanKinh() * PI ; 
	}
	public double tinhChuVi() {
		return getBanKinh()*2 * PI ; 
	}
	@Override
	public String toString() {
		String s="";
		s= s+s.format(";Ban Kinh: %3s m; Dien Tich: %4s; Chu vi: %5f.0",getBanKinh(),tinhDienTich(),tinhDienTich(),tinhChuVi()); 
		return "Hinhtron"+ tam.toString() +s ; 
	
	}

	
}
