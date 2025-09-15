package stt11_24646981_LEANHKIET_TUAN04;

public enum LoaiHang {
    THIT("Thịt"),
    RAU("Rau"),
    HOP("Đóng hộp");

    private String text;

    private LoaiHang(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
