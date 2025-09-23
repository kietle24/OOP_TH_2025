package stt11_24646981_LEANHKIET_TUAN02;
public class ToaDo {
	private String ten ; 
	private double x, y ;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) throws Exception {
		if (ten != null) {
			this.ten = ten;
		} else throw new Exception("loi") ;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public ToaDo(String ten, double x, double y) {
		
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	public ToaDo() {
	
	}

	public String toString() {
		String s ="" ; 
		 s=s+s.format("%2s(%2s;%2s)",getTen(), getX(), getY()); 
		return s ; 
	} 
	public static void main(String[] args) {
		ToaDo  t= new ToaDo("0", 20 , 25 ); 
		System.out.println(t); 
	}
}


