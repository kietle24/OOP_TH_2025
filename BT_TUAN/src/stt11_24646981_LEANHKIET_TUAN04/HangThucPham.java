package stt11_24646981_LEANHKIET_TUAN04;

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

    public HangThucPham(String ma) {
        this(ma, "Chưa có tên", 0, LocalDate.now(), LocalDate.now(), LoaiHang.HOP);
    }

    public HangThucPham(String ma, String ten, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan, LoaiHang loai) {
        setMa(ma);
        setTen(ten);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
        setLoai(loai);
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        if (ma != null && !ma.trim().isEmpty()) {
            this.ma = ma;
        } else {
            this.ma = "000000";
        }
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten != null && !ten.trim().isEmpty()) {
            this.ten = ten;
        } else {
            this.ten = "Chưa có tên";
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            this.donGia = 0;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat != null && !ngaySanXuat.isAfter(LocalDate.now())) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = LocalDate.now();
        }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan != null && ngayHetHan.isAfter(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = this.ngaySanXuat;
        }
    }
    
    public LoaiHang getLoai() {
        return loai;
    }

    public void setLoai(LoaiHang loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(localeVN);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ghiChu = this.ngayHetHan.isBefore(LocalDate.now()) ? "Hết hạn" : "Còn hạn";
        
        return String.format("%-8s | %-15s | %15s | %12s | %12s | %-10s | %s",
                this.ma, this.ten, nf.format(this.donGia), dtf.format(this.ngaySanXuat), dtf.format(this.ngayHetHan), this.loai, ghiChu);
    }
}