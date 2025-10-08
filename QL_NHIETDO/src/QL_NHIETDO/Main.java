package QL_NHIETDO;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ; 
	double f ; 
	double c  ;
	int choices ; 
	do {  
		System.out.println("MENU");
		System.out.println("1. F TO C");
		System.out.println("2. C TO F");
		System.out.println("0. Exit");
		System.out.println("Enter Your Choices:");
		choices = sc.nextInt() ; 
		switch(choices) { 
		case 1 :  { 
			System.out.println("vui long nhap f");
			f = sc.nextDouble() ; 	
			System.out.println("F to C :"+ChuyenDoiNhietDoPhong.fToC(f));
			  System.out.println("Nhan Enter de tiep tuc...");
              sc.nextLine(); 
              sc.nextLine(); 
			  break;
		}
		case 2  : {
			System.out.println("vui long nhap c");
			c = sc.nextDouble() ; 	
		     System.out.println("C to F = " + ChuyenDoiNhietDoPhong.cToF(c));
		     System.out.println("Nhan Enter de tiep tuc...");
             sc.nextLine(); 
             sc.nextLine(); 
     
			break ; 
		}
		case 0 : 
			System.exit(0);
		     sc.nextLine(); 
             sc.nextLine(); 
		default : 
			System.out.println("lua chon khong hop le ");
		     sc.nextLine(); 
             sc.nextLine(); 
		}
	
	}while(choices != 0 ) ;
}



}
