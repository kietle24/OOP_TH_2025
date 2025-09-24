package QLCD;
import java.util.Arrays;

public class ListCDRom {
    CDROM[] danhSachCD;
    int soLuongCD;

    public ListCDRom(int n) {
        danhSachCD = new CDROM[n];
        soLuongCD = 0;
    }

    public void tangKT() {
        CDROM[] tam = new CDROM[danhSachCD.length * 2];
        System.arraycopy(danhSachCD, 0, tam, 0, soLuongCD);
        danhSachCD = tam;
    }

    public int timViTri(String maCD) {
        for (int i = 0; i < soLuongCD; i++) {
            if (danhSachCD[i].getMaCD().equalsIgnoreCase(maCD)) {
                return i;
            }
        }
        return -1;
    }

    public boolean themCDRom(CDROM cr) {
        if (soLuongCD >= danhSachCD.length)
            tangKT();
        for (int i = 0; i < soLuongCD; i++) {
            if (cr.getMaCD().equalsIgnoreCase(danhSachCD[i].getMaCD())) {
                return false;
            }
        }
        danhSachCD[soLuongCD++] = cr;
        return true;
    }
    // Lấy tổng số lượng CD hiện có
    public int getSoLuongCD() {
        return soLuongCD;
    }

    // Xóa CD theo mã
    public boolean xoa(String ma) {
        int viTri = timViTri(ma);
        if (viTri == -1) {
            return false; // không tìm thấy
        }
        for (int i = viTri; i < soLuongCD - 1; i++) {
            danhSachCD[i] = danhSachCD[i + 1];
        }
        danhSachCD[soLuongCD - 1] = null;
        soLuongCD--;
        return true;
    }

    // Sắp xếp theo ngày phát hành (mới nhất trước)
    public void sapXepTheoNgayPhatHanh() {
        Arrays.sort(danhSachCD, 0, soLuongCD,
            (a, b) -> b.getNgayPhatHanh().compareTo(a.getNgayPhatHanh()));
    }

    // Sắp xếp theo ngày phát hành (cũ nhất trước)
    public void sapXepTheoNgayPhatHanhCuNhat() {
        Arrays.sort(danhSachCD, 0, soLuongCD,
            (a, b) -> a.getNgayPhatHanh().compareTo(b.getNgayPhatHanh()));
    }

    // Lấy danh sách CD cũ (hơn 3 năm)
    public CDROM[] layCDCu() {
        int count = 0;
        for (int i = 0; i < soLuongCD; i++) {
            if (danhSachCD[i].isCDCu()) {
                count++;
            }
        }

        CDROM[] cdCu = new CDROM[count];
        int index = 0;
        for (int i = 0; i < soLuongCD; i++) {
            if (danhSachCD[i].isCDCu()) {
                cdCu[index++] = danhSachCD[i];
            }
        }
        return cdCu;
    }

    // Lấy danh sách CD mới
    public CDROM[] layCDMoi() {
        int count = 0;
        for (int i = 0; i < soLuongCD; i++) {
            if (!danhSachCD[i].isCDCu()) {
                count++;
            }
        }

        CDROM[] cdMoi = new CDROM[count];
        int index = 0;
        for (int i = 0; i < soLuongCD; i++) {
            if (!danhSachCD[i].isCDCu()) {
                cdMoi[index++] = danhSachCD[i];
            }
        }
        return cdMoi;
    }

    // Hiển thị toàn bộ danh sách CD
    public String hienThiDanhSach() {
        if (soLuongCD == 0) {
            return "Danh sách CD trống!";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < soLuongCD; i++) {
            sb.append(danhSachCD[i].toString()).append("\n");
        }
        return sb.toString();
    }
 // Sắp xếp theo giá tăng dần
    public void sapXepTheoGiaTangDan() {
        Arrays.sort(danhSachCD, 0, soLuongCD,
            (a, b) -> Double.compare(a.getGia(), b.getGia()));
    }

    // Sắp xếp theo giá giảm dần
    public void sapXepTheoGiaGiamDan() {
        Arrays.sort(danhSachCD, 0, soLuongCD,
            (a, b) -> Double.compare(b.getGia(), a.getGia()));
    }

    // Sắp xếp theo tên tăng dần
    public void sapXepTheoTenTangDan() {
        Arrays.sort(danhSachCD, 0, soLuongCD,
            (a, b) -> a.getTuaCD().compareToIgnoreCase(b.getTuaCD()));
    }

    // Tìm kiếm theo mã
    public CDROM timKiemTheoMa(String maCD) {
        int viTri = timViTri(maCD);
        return (viTri != -1) ? danhSachCD[viTri] : null;
    }

    // Cập nhật CD theo mã
    public boolean capNhatCD(String maCD, String tuaMoi, 
                            LocalDate ngayMoi, boolean tinhTrangMoi,
                            int soLuongMoi, double giaMoi) {
        int viTri = timViTri(maCD);
        if (viTri == -1) return false;

        danhSachCD[viTri].setTuaCD(tuaMoi);
        danhSachCD[viTri].setNgayPhatHanh(ngayMoi);
        danhSachCD[viTri].setConHang(tinhTrangMoi);
        danhSachCD[viTri].setSoLuong(soLuongMoi);
        danhSachCD[viTri].setGia(giaMoi);
        return true;
    }

    // Lấy kích thước mảng tối đa hiện tại
    public int getKichThuocToiDa() {
        return danhSachCD.length;
    }



}

