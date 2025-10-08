package stt11_24646981_LEANHKIET_TUAN06;

public enum BookStatus {
	OLD("cu"), 
	NEW("moi") ; 
	private String description ; 
	private BookStatus(String description ) { 
		this.description =description ; 
	}
	public String toString() {
		
		return description; 
		
	} 
	
	
}
