package QLSV;

public class Student {
	private String id ; 
	private String name ; 
	private int age  ; 
	private double gpa ; 
	private String email ;
	public String getId() {
		return id;
	}
	public Student() {
	}
	public Student(String id, String name, int age, double gpa, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		this.email = email;
	}

	public void setId(String id) {
		if(id != null || id.trim().isEmpty()) {
			throw new IllegalArgumentException("khong duoc de trong id  ") ;
		
		}
		if(id.length() != 8 ) {
			throw new IllegalArgumentException("nhap phai la 8 ki tu ") ;
		}
		this.id = id.trim();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("khong duoc ten trong ten  ") ;
		
		}
		this.name = name.trim();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 16 ) {
			throw new IllegalArgumentException("do tuoi phai tu lon hon 16 ") ;
		
		}
		this.age = age;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		if(gpa < 4.0 || gpa > 10.0 ) {
			throw new IllegalArgumentException("gpa khong hop le ") ;
		
		}
		this.gpa = gpa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
	    // Kiểm tra xem email có hợp lệ hay không
	    if (email == null || !email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)+$")) {
	        throw new IllegalArgumentException("Email không hợp lệ. Vui lòng nhập lại.");
	    }
	    this.email = email.trim();
	}


	@Override
	public String toString() {
		return String.format("%-8s | %-20 | %s  | %.5f | %s",id , name , age , gpa , email ) ; 
	}
	
	
}
