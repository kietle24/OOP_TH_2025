package QL_PHUONGTIEN;

public class XeDap extends PhuongTienDiChuyen{
	
public XeDap(HangSanXuat hangSanXuat) { 
	 super("Xe Dap ", hangSanXuat) ; 
}

@Override
public double layVanToc() {
	return 20;
}

}
