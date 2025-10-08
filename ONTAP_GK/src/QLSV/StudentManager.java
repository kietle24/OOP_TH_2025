package QLSV;

public class StudentManager {
	private Student[] students = new Student[10] ; 
	private int count = 0 ; 
	
	private boolean svExit( int id ) { 
		 for(int i = 0 ; i < count ; i++) { 
			 if(students[i].getId().equals(id));
			 return true; 
		 }
		 return false ; 
	}
public void themSinhVien(Student s) throws IllegalAccessException{
	   if(svExit(s.getId()))  { 
		   throw new IllegalAccessException("sinh vien voi id " + s.getId() + "da ton tai") ; 
	   }
	   if(count == students.length) { 
		   Student[] newArrays = new Student[students.length*2] ; 
		   for(int i = 0 ; i < count ; i++) { 
		   newArrays[i] = students[i] ; 
		   }
		   students = newArrays ;
	   }
	
	   students[count++] = s ;  // cach them sinh vien trong mang array 
	   System.out.println("them thanh cong sinh vien " + s.getId()); 
}
public void inDanhSach() { 
	 for(int i =0 ; i < count  ; i++) {
		   System.out.println(students[i]);
	 }
}
	
	
}
