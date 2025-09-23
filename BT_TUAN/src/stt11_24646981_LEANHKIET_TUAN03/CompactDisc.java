package stt11_24646981_LEANHKIET_TUAN03;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public class CompactDisc {
	private int code ; 
	private String title ; 
	private int numSongs ; 
	private double price ;
	public CompactDisc(int code, String title, int numSongs, double price) {
		setCode(code); 
		setTitle(title); 
		setNumSongs(numSongs); 
		setPrice(price);
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		if(code <= 0 ) { 
			 code = 999999; 
		}
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title == null || title.isEmpty())  { 
			title = "Unidentified" ; 
					
		}
		this.title = title; 
	}
	public int getNumSongs() {
		return numSongs;
	}
	public void setNumSongs(int numSongs) {
		if(numSongs <= 0 ) {
			 throw new IllegalArgumentException("Number Of Songs >0 "); 
		}
		this.numSongs = numSongs;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price <= 0 ) {
			 throw new IllegalArgumentException("Price >0 "); 
		}
		this.price = price;
	}
	@Override
	public String toString() {
	    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
	    return String.format("%s | %s | %d | %s",
	            code, 
	            title,
	            numSongs,
	            nf.format(price)
	    );
	}
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompactDisc other = (CompactDisc) obj;
		return code == other.code;
	}

} 
	



