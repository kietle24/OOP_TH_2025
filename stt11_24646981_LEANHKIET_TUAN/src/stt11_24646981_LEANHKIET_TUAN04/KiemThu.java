package stt11_24646981_LEANHKIET_TUAN04;

public class KiemThu {
    public static void main(String[] args) {
        // Create objects of HangThucPham
        HangThucPham hang1 = new HangThucPham("AU0001");
        HangThucPham hang2 = new HangThucPham("AG0025", "Gạo ST25", 30e3,
                LocalDate.of(2025, 8, 10), LocalDate.of(2025, 9, 20), null);
        
        // Prepare header line
        String headerline = String.format("%6s | %15s | %10s | %12s | %12s",
                "Code", "Name", "Price", "Mfg Date", "Exp Date");
        
        // Print header and objects
        System.out.println(headerline + "\n" + "-".repeat(80));
        System.out.println(hang1);
        System.out.println(hang2);
    }
}

