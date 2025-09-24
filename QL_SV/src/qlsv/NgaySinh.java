package qlsv;

import java.util.Objects;

public class NgaySinh {
private int ngay ,thang , nam ;

public NgaySinh(int ngay, int thang, int nam) {
	this.ngay = ngay;
	this.thang = thang;
	this.nam = nam;
}

@Override
public int hashCode() {
	return Objects.hash(nam, ngay, thang);
}

@Override // tra ve ket qua la true of false 
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	NgaySinh other = (NgaySinh) obj;
	return nam == other.nam && ngay == other.ngay && thang == other.thang;
} 

}
