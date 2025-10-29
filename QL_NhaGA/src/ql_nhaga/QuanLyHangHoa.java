package ql_nhaga;
import java.util.*;
public class QuanLyHangHoa {
	private Queue<KhachHang> hangcho  = new LinkedList<>() ; 
	private List<KhachHang> daBan = new ArrayList<>() ; 
	public boolean themKhachHang(KhachHang kh ) { 
		 hangcho.add(kh) ; 
		 System.out.println("them khach hang thanh cong ");
		 return true  ; 
		 
	}
	public boolean banVe(KhachHang kh ){ 
		if(hangcho == null || hangcho.isEmpty()) {
			throw new IllegalArgumentException("hang cho khong duoc rong ") ; 
		}
		kh = hangcho.poll() ; 
		daBan.add(kh) ; 
		return true ; 
	}
	public void hienThiHangCho() { 
	    if (hangcho == null || hangcho.isEmpty()) { 
	        throw new IllegalArgumentException("Hàng chờ không được rỗng");
	    }

	    int stt = 1; 
	    System.out.println("Danh sách khách hàng trong hàng chờ ");
	    System.out.println(tieuDe());
	    for (KhachHang kh : hangcho) {
	        System.out.printf("%-3d %-12s %-20s %-15s %-10.0f\n", 
	                          stt, kh.getCmnd(), kh.getTen(), kh.getGaDen(), kh.getGiaVe());
	        stt++;
	    }
	}
	
	public void hienThiDaBan() { 
	    if (daBan == null || daBan.isEmpty()) { 
	        throw new IllegalArgumentException("Hàng chờ không được rỗng");
	    }

	    int stt = 1; 
	    System.out.println("Danh sách khách hàng trong da ban ");
	    System.out.println(tieuDe());
	    for (KhachHang kh : daBan) {
	        System.out.printf("%-3d %-12s %-20s %-15s %-10.0f\n", 
	                          stt, kh.getCmnd(), kh.getTen(), kh.getGaDen(), kh.getGiaVe());
	        stt++;
	    }
	}

	// huy khach hang 
	public void huyKhachHang(String huycmnd) { 
		if(hangcho == null || hangcho.isEmpty()) { 
			 throw new IllegalArgumentException("hang cho khong duoc rong ") ; 
		}
		boolean found = false ; 
		for(KhachHang kh :hangcho) { 
			if(kh.getCmnd().equals(huycmnd)) {  
				 hangcho.remove(huycmnd) ; 
		found = true ; 
		System.out.println("da huy khach thanh con trong hang cho " + huycmnd) ; 
			}
			if(!found ) { 
				 System.out.println("khong tim thay khach hang "+ huycmnd );
			}
		}
	}
	public void thongKeTinhHinhBanVe(){ 
		if((daBan == null || daBan.isEmpty())&& (hangcho == null || hangcho.isEmpty())) { 
			System.out.println("chua co du du lieu ban ve hoac hang cho ");
		}
		int soVeDaban  = 0  ; // khai bao bien de tinh tong so ve da ban 
		double tongTien  = 0 ;  // khai bao bien de tinh tong so tien da ban 
		if(daBan != null)  { 
			soVeDaban = daBan.size()  ; // tra ve so ve da ban 
		}
		for(KhachHang kh : daBan ) {
			tongTien += kh.getGiaVe() ; 
		} 
		 int soKhachChoMuaVe = (hangcho == null ) ?  0 : daBan.size() ;
		 System.out.println("Danh Sach Cho Mua Ve" ) ;
		 hienThiDaBan() ; 
		 System.out.println("tong ve ban duoc:"+ soVeDaban);
		 System.out.println("tinh thanh tien:"+tongTien );
		 System.out.println("Luong Khach Da Mua Ve "+ soKhachChoMuaVe);
	}
	
	public void danhSachNhaGa() { 
		 if(hangcho == null || hangcho.isEmpty()) {  
			  System.out.println("Hien khong co khach nao dang cho ");
		 }
		 Set<String> danhSachGa = new HashSet<>() ; 
		 for(KhachHang kh : hangcho ) { 
			 danhSachGa.add(kh.getGaDen()) ; 
		 }
		 System.out.println("cac ga dang co khach cho ===== ");
		 for(String ga : danhSachGa) {
			 System.out.println(ga) ; 
		 }
	}
	public String tieuDe(){  
		 return String.format("%-3s %-12s %-20s %-15s %-10s\n",
				 "STT",
				 "CMND",
				 "Tên",
				 "Ga Đến",
				 "Giá Vé") ; 
	}
	
}

