package stt11_24646981_LEANHKIET_TUAN04;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HangThucPham {
    private String ma;
    private String ten;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private LoaiHang loai;

    public HangThucPham() {

    }

    public HangThucPham(String ma) {
        this(ma, "no-name", 1.0, LocalDate.now(), LocalDate.now(), LoaiHang.HOP);
    }

    public HangThucPham(String ma, String ten, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan,
            LoaiHang loai) {
        setDonGia(donGia);
        setMa(ma);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
        setTen(ten);
        this.loai = loai;  // <-- added this line
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        if (ma == null || ma.isEmpty()) {
            ma = "xxxxxx";
        }
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null || ten.isEmpty()) {
            ten = "no-name";
        }
        this.ten = ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia <= 0) {
            donGia = 1;
        }
        this.donGia = donGia;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat == null || ngaySanXuat.isAfter(LocalDate.now())) {
            ngaySanXuat = LocalDate.now();
        }
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan == null || ngayHetHan.compareTo(getNgaySanXuat()) <= 0) {
            ngayHetHan = LocalDate.now();
        }
        this.ngayHetHan = ngayHetHan;
    }
    public boolean hetHan() {
  
        return !ngayHetHan.isAfter(LocalDate.now());
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        DecimalFormat df = new DecimalFormat("#,##0");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%6s | %15s | %10s | %12s | %12s | %8s",
                ma,
                ten,
                df.format(donGia),
                dtf.format(ngaySanXuat),
                dtf.format(ngayHetHan),
                hetHan() ? "het han" : "con hang");
    }
}
