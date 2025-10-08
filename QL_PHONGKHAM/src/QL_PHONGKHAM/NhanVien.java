package QL_PHONGKHAM;

/*
Phòng khám XYZ là phòng khám chất lượng cao được đầu tư trang thiết bị hiện đại,
 đội ngũ chuyên môn giàu kinh nghiệm, 
 tận tình chu đáo phục vụ cho bệnh nhân. 
 Phóng khám có các nhân viên là Bác sỹ và Kỹ thuật viên và nhân viên chăm sóc khách hàng. 
 Đối với từng loại nhân viên sẽ thực hiện các nhiệm vụ sau
 
Bác sỹ sẽ là người khám bệnh cho bệnh nhân.
Kỹ thuật viên sẽ là người thực hiện xét nghiệm, siêu âm,...
Nhân viên chăm sóc khách hang có nhiệm vụ tư vấn chăm sóc khách hàng mới và cũ.
Viết chương trình quản lý nhân viên của phòng khám:
Mỗi nhân viên cần quản lý các thông cá nhân như họ tên, ngày sinh, mã số thuế,
Phòng khám cần trả lương cho nhân viên như sau:
Đối với bác sỹ ngoài lương căn bản thì mỗi giờ tăng ca sẽ được nhận thêm 200.000 với ngày trong tuần và 300.000 với ngày cuối tuần.
Đối với kỹ thuật viên phòng khám sẽ được tính theo công làm việc mỗi công sẽ được 300.000.
Đối với nhân viên chăm sóc khách hàng sẽ được tính theo công làm việc mỗi công sẽ được 200.000.
Sử dụng tính chất kế thừa và đa hình viết chương trình cho phép thực hiện các chức năng sau:
1. Nhập danh sách nhân viên (lưu trữ trong một mảng duy nhất)
2. Tính tổng lương mà công ty phải trả cho các nhân viên chăm sóc khách hàng.
3. Tìm bác sỹ có lương cao nhất. (trong trường hợp nhiều bác sĩ lương cao nhất thì chỉ cần tìm được một trong số đó)
4. Tính thu nhập trung bình của kỹ thuật viên.

 */

import java.time.LocalDate;

public abstract class NhanVien {
	protected String hoTen ; 
	protected LocalDate ngaySinh ;
	protected String maSoThue ; 
	protected double luongCanBan ;
	public NhanVien(String hoTen, LocalDate ngaySinh, String maSoThue, double luongCanBan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.maSoThue = maSoThue;
		this.luongCanBan = luongCanBan;
	} 
	
	public abstract double tinhLuong() ;

	@Override
	public String toString() {
		return String.format("Ho Ten"+hoTen +"Ngay Sinh:"+ngaySinh+ "Ma So Thue"+ maSoThue );
	} 
	
	
	

}























