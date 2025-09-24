package qlsach;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15, 9, 2025); 
        Ngay ngay2 = new Ngay(15, 10, 2025); 
        Ngay ngay3 = new Ngay(20, 9, 2025);

        TacGia tacGia1 = new TacGia("Tung a", ngay1); 
        TacGia tacGia2 = new TacGia("Tung b", ngay2); 
        TacGia tacGia3 = new TacGia("Tung c", ngay3); 

        Sach sach1 = new Sach("Lập trình C", tacGia1, 10000, 2023);
        Sach sach2 = new Sach("Lập trình Java", tacGia2, 10000, 2029);
        Sach sach3 = new Sach("Lập trình Mạng", tacGia3, 15000, 2023);

        sach1.inTenSach(); 
        sach2.inTenSach();
        sach3.inTenSach(); 
       
        System.out.println("So nha XB sach 1 va 3: "+ sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println("So nha XB sach 2 va 3: "+ sach2.kiemTraCungNamXuatBan(sach3));
        System.out.println("So nha XB sach 1 va 2: "+ sach1.kiemTraCungNamXuatBan(sach2));
        System.out.println("Gia ban cua sach 1 khi giam 10% :"+ sach1.giasaukhiGiam(10));
        System.out.println("Gia ban cua sach 2 khi giam 30% :"+ sach1.giasaukhiGiam(30));
        System.out.println("Gia ban cua sach 3 khi giam 40% :"+ sach1.giasaukhiGiam(40));
    }
}
