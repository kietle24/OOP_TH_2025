package QL_DANHBA;

public class Main {
public static void main(String[] args) {
	DanhBa db = new DanhBa();
    db.themSo("", "0905123456");
    db.themSo("12 Nguyễn Trãi", "0905789123");
    db.themSo("45 Lê Lợi", "0987000123");

    db.timTheoDiaChi("12 Nguyễn Trãi");
    db.timTheoSo("0987000123");
}
}
