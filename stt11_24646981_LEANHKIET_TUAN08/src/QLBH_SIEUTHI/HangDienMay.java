package QLBH_SIEUTHI;

public class HangDienMay extends HangHoa {
	private int thoiGianBaoHanhThang;
	private double congSuatKW;

	public HangDienMay(
			String maHang,
			String tenHang,
			int soLuong, 
			double donGia,
			int thoiGianBaoHanhThang,
			double congSuatKW) {
		super(maHang, tenHang, soLuong, donGia);
		setThoiGianBaoHanhThang(thoiGianBaoHanhThang);
		setCongSuatKW(congSuatKW);
	}
	public HangDienMay(String maHang) {
		super(maHang);
	}
	public int getThoiGianBaoHanhThang() {
		return thoiGianBaoHanhThang;
	}
	public void setThoiGianBaoHanhThang(int thoiGianBaoHanhThang) {
		if (thoiGianBaoHanhThang < 0) {
			throw new IllegalArgumentException("bao hanh phai >=0  thang ");
		}
		this.thoiGianBaoHanhThang = thoiGianBaoHanhThang;
	}
	public double getCongSuatKW() {
		return congSuatKW;
	}

	public void setCongSuatKW(double congSuatKW) {
		if (congSuatKW < 0) {
			throw new IllegalArgumentException("cong suat phai > 0 ");
		}
		this.congSuatKW = congSuatKW;
	}
	public boolean isBanDuoc() {
		return getSoLuong() < 3;
	}
	public double tinhVAT() {
		return 0.1;
	}
	public String toString() {
		return String.format("%s | BH: %d th | CS: %f",
				super.toString(),
				this.thoiGianBaoHanhThang,
				this.congSuatKW);
	}

}