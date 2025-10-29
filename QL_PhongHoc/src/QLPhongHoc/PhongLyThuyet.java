package QLPhongHoc;

public class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongLyThuyet(String maPhong, String dayNha,
                         double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean isCoMayChieu() { return coMayChieu; }
    public void setCoMayChieu(boolean coMayChieu) { this.coMayChieu = coMayChieu; }

    @Override
    public boolean datChuan() {
        return coMayChieu && datChuanAnhSang();
    }

    @Override
    public String toString() {
        return String.format("%s | Co may chieu: %s | Dat Chuan: %s|",
                super.toString(),
                coMayChieu ? "Co" : "Khong",
                datChuan() ? "YES" : "NO");
    }
}
