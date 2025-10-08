import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TestPhongKham {
    public static void main(String[] args) {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin cho nhân viên
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));

            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Ngày sinh (yyyy-mm-dd): ");
            LocalDate ngaySinh = LocalDate.parse(sc.nextLine());
            System.out.print("Mã số thuế: ");
            String maSoThue = sc.nextLine();
            System.out.print("Lương căn bản: ");
            double luongCanBan = sc.nextDouble();

            System.out.println("Loại nhân viên (1 - Bác sĩ, 2 - Kỹ thuật viên, 3 - Chăm sóc khách hàng): ");
            int loaiNhanVien = sc.nextInt();

            switch (loaiNhanVien) {
                case 1:
                    System.out.print("Số giờ tăng ca: ");
                    int soGioTangCa = sc.nextInt();
                    System.out.print("Ngày trong tuần (1 - Thứ 2, ..., 7 - Chủ nhật): ");
                    DayOfWeek ngayTrongTuan = DayOfWeek.of(sc.nextInt());
                    danhSachNhanVien.add(new BacSi(hoTen, ngaySinh, maSoThue, luongCanBan, soGioTangCa));
                    break;
                case 2:
                    System.out.print("Số công: ");
                    int soCong = sc.nextInt();
                    danhSachNhanVien.add(new KyThuatVien(hoTen, ngaySinh, maSoThue, luongCanBan, soCong));
                    break;
                case 3:
                    System.out.print("Số công: ");
                    int soCongKH = sc.nextInt();
                    danhSachNhanVien.add(new NhanVienChamSocKH(hoTen, ngaySinh, maSoThue, luongCanBan, soCongKH));
                    break;
                default:
                    System.out.println("Chọn sai loại nhân viên!");
            }
            sc.nextLine();  // consume newline
        }

        // Tính tổng lương nhân viên chăm sóc khách hàng
        double tongLuongChamSoc = 0;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof NhanVienChamSocKH) {
                tongLuongChamSoc += nv.tinhLuong();
            }
        }
        System.out.println("Tổng lương phải trả cho nhân viên chăm sóc khách hàng: " + tongLuongChamSoc);

        // Tìm bác sĩ có lương cao nhất
        double maxLuong = 0;
        BacSi bacSiMaxLuong = null;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof BacSi) {
                double luongBacSi = nv.tinhLuong();
                if (luongBacSi > maxLuong) {
                    maxLuong = luongBacSi;
                    bacSiMaxLuong = (BacSi) nv;
                }
            }
        }
        if (bacSiMaxLuong != null) {
            System.out.println("Bác sĩ có lương cao nhất: " + bacSiMaxLuong);
        }

        // Tính thu nhập trung bình của kỹ thuật viên
        double tongThuNhapKyThuatVien = 0;
        int soLuongKyThuatVien = 0;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof KyThuatVien) {
                tongThuNhapKyThuatVien += nv.tinhLuong();
                soLuongKyThuatVien++;
            }
        }
        if (soLuongKyThuatVien > 0) {
            double thuNhapTrungBinh = tongThuNhapKyThuatVien / soLuongKyThuatVien;
            System.out.println("Thu nhập trung bình của kỹ thuật viên: " + thuNhapTrungBinh);
        }
    }
}
