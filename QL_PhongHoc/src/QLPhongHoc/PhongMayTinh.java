package QLPhongHoc;

public class PhongMayTinh extends PhongHoc  {
    private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha,
                        double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        setSoMayTinh(soMayTinh);
    }

    public int getSoMayTinh() { return soMayTinh; }

    public void setSoMayTinh(int soMayTinh) {
        if (soMayTinh <= 0) throw new IllegalArgumentException("so may tinh > 0");
        this.soMayTinh = soMayTinh;
    }

    @Override
    public boolean datChuan() {
        return datChuanAnhSang() && (dienTich / soMayTinh >= 1.5);
    }

    @Override
    public String toString() {
        return String.format("%s | %16d | Dat Chuan: %s|",
                super.toString(),
                soMayTinh,
                datChuan() ? "YES" : "NO");
    }
}
