package QLSV;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentManager {
	private ArrayList<Student> students = new ArrayList<>();

	public void add(Student s) {
		students.add(s);
	}

	public boolean remove(String ID) {
		return students.removeIf(s -> s.getID().equals(ID)); // phuong thuc cua ArrayList
	}

	public boolean update(String ID, String newName, LocalDate newDob, double newScore) {
		for (Student s : students) {
			if (s.getID().equals(ID)) {
				s.setFullname(newName);
				s.setDob(newDob);
				s.setScore(newScore);
				return true;
			}
		}
		return false;
	}

	public void showAll() {
		if (students.isEmpty()) {
			System.out.println("No students available.");
		} else {
			for (Student s : students) {
				System.out.println(s);
			}
		}
	}
}