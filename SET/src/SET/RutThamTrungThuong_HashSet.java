package SET;
import java.util.*;

public class RutThamTrungThuong_HashSet {
	Set<String> thungPhieuDuThuong =new HashSet<String>(); 	

	//construction
	public RutThamTrungThuong_HashSet() {
	}
	//get set 
	public boolean themPhieu(String giaTri ) { 
		return this.thungPhieuDuThuong.add(giaTri) ; 
	}
	public boolean xoaPhieu(String giaTri ) { 
		return this.thungPhieuDuThuong.remove(giaTri) ; 
	}
	public boolean kiemtraPhieu(String giaTri ) { 
		return this.thungPhieuDuThuong.contains(giaTri) ; 
	}
	public void xoatatcaPhieu() { 
	this.thungPhieuDuThuong.clear();
	}
	public int laySoLuong() { 
	 return this.thungPhieuDuThuong.size() ; 
	}
	public String rutMotPhieu() { 
		String 	ketQua= "";
		if (this.thungPhieuDuThuong.isEmpty()) { 
			return "khong co phieu nao de rut duoc " ; 
		}
		Random rd = new Random() ; 
		int viTri  = rd.nextInt(this.thungPhieuDuThuong.size()) ; 
		 ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri] ;
		 return ketQua  ; 
	}
	// to string 
	public void intatca() { 
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}
	// menu 
	public static void main(String[] args) {
		 int luaChon  = 0 ; 
		 Scanner sc = new Scanner(System.in);
		 
		 RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet() ; 
		  do { 
			  System.out.println("----------");
			  System.out.println("MENU: ");
			  System.out.println("1.them ma o du thuong ");
			  System.out.println("2.xoa ma so du thuong ");
			  System.out.println("3.kiem tra ma so du thuong co ton tai ");
			  System.out.println("4.xoa tat cac cac phieu du thuong ") ; 
			  System.out.println("5.lay so luong phieu du thuong ");
			  System.out.println("6.rut tham trung thuong ");
			  System.out.println("7.in ra tat cac phieu dang co  ");
			  System.out.println("0.thoat khoi chuong trinh ");
			  luaChon = sc.nextInt() ; 
			  sc.nextLine(); 
			  
			  if(luaChon == 1 || luaChon == 2 || luaChon == 3) { 
				  System.out.println("nhap vao ma so phong ma phieu du thuong ");
				  String giatri = sc.nextLine() ; 
			   	 if(luaChon == 1 ) { 
			   		 rt.themPhieu(giatri) ; 
			   	 }else if(luaChon == 2 ){ 
			   		  rt.xoaPhieu(giatri);
			   	 }else { 
			   		 System.out.println("ket qua kiem tra"+rt.kiemtraPhieu(giatri));
			   	 }
			   	 }else if (luaChon == 4) { 
			   		 rt.xoatatcaPhieu() ; 
			   	 }else if(luaChon ==5 )  { 
			   		 System.out.println("lay so luong phieu la: "+rt.laySoLuong());
			   	 }
			   	 else if (luaChon==6) { 
			   		 System.out.println("ma so trung thuong la: "+rt.rutMotPhieu());
			   	 }else if  (luaChon==7 ){ 
			   		 System.out.println("cac ma phieu du thuong la: ");
			   		rt.intatca();
			   	 }
			    
		  }while(luaChon != 0) ; 
	}
}
