package GK;

public class Student {
	private String id ; 
	private String name ; 
	private int age ; 
	private double gpa ; 
	private String email ;
	public Student() {

	}
	//construction dinh dang cac dac diem cua doi tuong 
	public Student(String id, String name, int age, double gpa, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) throws IllegalAccessException {
		if(id == null || id.trim().isEmpty()) { 
			 throw new IllegalAccessException("id khong duoc de trong ") ; 
		}
		if (id.length() !=  8 )  { 
			throw new IllegalAccessException("do dai ki tu la 8") ; 
		}
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws IllegalAccessException {
		if(name == null || name.trim().isEmpty()) { 
			 throw new IllegalAccessException("khong duoc de trong ") ; 
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) throws IllegalAccessException {
		if(gpa < 0.0 || gpa > 4.0) {
			throw new IllegalAccessException("gpa nhap phai tu 0.0 - > 4.0") ; 
		}
		this.gpa = gpa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws IllegalAccessException   { 
		 if(email == null || email.trim().isEmpty()) { 
			 throw new IllegalAccessException("khong duoc de trong ") ; 
		 }
		 if(!email.contains("@")) { 
			 throw new IllegalAccessException("bac buoc phai co ki tu @") ; 
		 }
		 this.email = email ; 
	}

	@Override
	public String toString() {
		  return String.format("%-8s |%-20s |%s |%.5f| %s|", 
				  id , name ,age, gpa , email ) ;
	} 
	
}
