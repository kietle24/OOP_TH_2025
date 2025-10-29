package QLBH_SIEUTHI;

public enum MucDoBuonBan {
    BAN_DUOC("Bán được"), 
    BAN_CHAM("Bán chậm"), 
    BAN_KHONG_DUOC("Bán không được"), 
    KHONG_DANH_GIA("Không đánh giá");

    private String moTa;
    private MucDoBuonBan(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return moTa;
    }
}
