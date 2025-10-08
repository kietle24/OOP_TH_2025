package testenum;
public class ThoiKhoaBieu {
	private DAY thu ; 
	private String cacMonHoc  ;
	public ThoiKhoaBieu(DAY thu, String cacMonHoc) {
		this.thu = thu;
		this.cacMonHoc = cacMonHoc;
	}
	public DAY getThu() {
		return thu;
	}
	public void setThu(DAY thu) {
		this.thu = thu;
	}
	public String getCacMonHoc() {
		return cacMonHoc;
	}
	public void setCacMonHoc(String cacMonHoc) {
		this.cacMonHoc = cacMonHoc;
		}
	@Override
	public String toString() {
		return "ThoiKhoaBieu [thu=" + thu + ", cacMonHoc=" + cacMonHoc + "]";
	
	}
}
