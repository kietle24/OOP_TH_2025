package GK;
import java.util.*;
public class StudentManager {
	private Student[] students = new Student[10]  ; 
	private int count = 0 ; 
	
	
	
   private boolean svExits(String id) { 
	    for(int i =0  ; i < count ; i++) { 
	    	if(students[i].getId().equals(id)) {
	    		 return true ; 
	    	}
	    	
	    }
	    return false ; 
   }
   
   
  
   public void themSinhVien(Student s ) throws IllegalAccessException { 
	   if(svExits(s.getId()))  { 
		   throw new IllegalAccessException("sinh vien voi id " + s.getId() + "da ton tai") ; 
	   }
	   // neu mang day tang gap doi kich thuot 
	   if(count == students.length) { 
		   Student [] newArrays = new Student[students.length*2]  ; 
		   for(int i = 0 ; i  < students.length; i++) { 
			   newArrays[i] = students[i] ; 
		   }
		   students = newArrays ; 
		   
	   }
	   students[count++] = s ;  // cach them sinh vien trong mang array 
	   System.out.println("them thanh cong sinh vien " + s.getId()); 
	   
   }
   public void inDanhSachSinhVien() { 
	    for(int i =0 ; i < count ; i++) { 
	    	 System.out.println(students[i]);
	    }
   }
   public void removeStudent(String id) { 
	    int index = -1;  // Giả sử ta chưa tìm thấy sinh viên 
	    for (int i = 0; i < count; i++) { 
	        if (students[i].getId().equals(id)) {  // Kiểm tra nếu sinh viên có ID phù hợp
	            index = i;  // Lưu vị trí của sinh viên cần xóa
	            break;  // Không cần tiếp tục duyệt mảng nữa
	        }
	    }
	    
	    if (index == -1) {
	        System.out.println("Không tìm thấy sinh viên với ID: " + id);
	        return;  // Nếu không tìm thấy, thoát ra
	    }

	    // Di chuyển tất cả các sinh viên phía sau về trước một vị trí
	    for (int i = index; i < count - 1; i++) { 
	        students[i] = students[i + 1]; 
	    }
	    
	    // Đặt phần tử cuối cùng thành null và giảm số lượng sinh viên
	    students[count - 1] = null; 
	    count--; 
	    System.out.println("Xóa thành công sinh viên với ID: " + id);
	}

	public void updateStudent(String id , Student newinfo) { 
		boolean found = false  ; 
		for(int i =0  ; i < count ; i++  ) { 
			if(students[i].getId().equals(id)) { 
				students[i] = newinfo ; 
				found  = true ; 
				 System.out.println("tim thay sinh vien "+ id ) ;
				 break ; 
			}
		} 
		if(!found) { 
			 System.out.println("khong tim thay sinh vien voi id "+id );
			 
		}
	}
	// phuong thuc tim kiem ten va them 
	public ArrayList<Student> searchByName(String name ) { 
		ArrayList <Student> result = new ArrayList<>() ; 
		for(int i  = 0 ; i  < count-1; i++ ) { 
			if(students[i].getName().contains(name)) {
				  result.add(students[i]) ; 
			}
			
		}
		return result ; 
	}
	public void sortByName() {  
		   Arrays.sort(students, 0, count, new Comparator<Student>() {
			   @Override
			 public int compare(Student s1 , Student s2 ) { 
				  return s1.getName().compareTo(s2.getName()) ; 
			 }
		 });
	}
	public String tieuDe() {
	    return String.format("%-10s %-20s %-5s %-5s %-25s", "ID", "Name", "Age", "GPA", "Email");
	}

	// sap xep thep gpa ; 
	public void sortByGPA() { 
		 Arrays.sort(students, 0, count, new Comparator<Student>() {
			 public int compare(Student s1 , Student s2 ) { 
				  return Double.compare(s2.getGpa(), s1.getGpa());
			 }
	 });
}
	
	
}


