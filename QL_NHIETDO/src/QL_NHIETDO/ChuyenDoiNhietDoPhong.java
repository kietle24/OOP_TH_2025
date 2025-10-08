package QL_NHIETDO;

public class ChuyenDoiNhietDoPhong {
	private double f ; 
	private double c ;
	public ChuyenDoiNhietDoPhong() {
	}
	public ChuyenDoiNhietDoPhong(double f, double c) {
		this.f = f;
		this.c = c;
	}
	public double getF() {
		return f;
	}
	public void setF(double f) throws IllegalAccessException {
		if (f <  0 )
		{ 
			throw new IllegalAccessException("loi nhap f ") ; 
		}
		this.f = f;
	}
	public double getC() {
	
		return c;
	}
	public void setC(double c) throws IllegalAccessException {
	if (c <  0 )
	{ 
		throw new IllegalAccessException("loi nhap c ") ; 
	}
		this.c = c;
	} 
    public static double cToF(double c) {
        return (c * 9.0 / 5.0) + 32.0;
    }
    public static double fToC(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }


	
}
