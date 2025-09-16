package QLSV;
import java.time.LocalDate;
public class Student {
private String fullname ; 
private String ID ; 
private LocalDate dob ; 
private double score ;
public Student(String fullname, String iD, LocalDate dob, double score) {
	this.fullname = fullname;
	ID = iD;
	this.dob = dob;
	this.score = score;
}

public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}

@Override
public String toString() {
	return "Student [fullname=" + fullname + ", ID=" + ID + ", dob=" + dob + ", score=" + score + "]";
} 



}
