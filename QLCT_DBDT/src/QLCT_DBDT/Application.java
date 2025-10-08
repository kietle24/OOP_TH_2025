package QLCT_DBDT;

import java.util.*;

public class Application {
    private String address;
    private String phoneNumber;
static List<Application> list = new ArrayList<Application>() ; 

public Application(String address, String phoneNumber) {
	this.address = address;
	this.phoneNumber = phoneNumber;
}

public Application() {
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public static List<Application> getList() {
	return list;
}

public static void setList(List<Application> list) {
	Application.list = list;
}
public static void init() {
    list.add(new Application("Bien Hoa", "09877739223"));
    list.add(new Application("Binh Duong", "09877733121"));
}
@Override
public String toString() {
	return String.format("%-20s | %s" , address , phoneNumber);
}
public static void main(String[] args) {
	init() ; 
	  for (Application app : list) {
          System.out.println(app);
      }
  }
};




