package QL_GIAODICH_DAT_NHA_THUAKE;

public class GiaoDichNha extends GiaoDich{
	private String loaiNha ; 
	private String diaChi; 
	private double dienTich ;
	public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiNha, String diaChi,
			double dienTich) {
		super(maGiaoDich, ngayGiaoDich, donGia);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
		this.dienTich = dienTich;
	}
	
	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	@Override
	public double tinhThanhTien() {
		if(loaiNha.equals("cao cap")) { 
			 return dienTich*donGia; 
		}else { 
			 return (dienTich*donGia)*0.9 ; 
		}
		
	}


	
	
}
