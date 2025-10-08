package QLCT_DBDT;
import java.util.*;
public class PhoneBookApp {
	private String Address ; 
	private String PhoneNumber  ; // 
	public PhoneBookApp(String address, String phoneNumber) {
		Address = address;
		PhoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return String.format("%30s | %15s",Address ,PhoneNumber) ; 
	}
	// phuong thuc tinh static de khach nhap vao co the tra cuu duoc dia chi and number 
	   public static PhoneBookApp input(Scanner sc) {
	        System.out.print("Address: ");
	        String addr = sc.nextLine().trim() ; 
	        System.out.print("Phone: ");
	        String phone = sc.nextLine().trim();
	        return new PhoneBookApp(addr, phone);
	        
	    }
	
}
