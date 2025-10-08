	package QL_EVENT;
	import java.time.LocalDateTime;

	public class Event {
	    private String eventCode;
	    private String eventName;
	    private LocalDateTime eventDate;
	    private String location;
	    private int participantNumber;
	    private double cost;

	    // Constructor
	    public Event(String eventCode, String eventName, LocalDateTime eventDate, String location, int participantNumber, double cost) {
	        setEventCode(eventCode);  // Đảm bảo mã sự kiện hợp lệ
	        this.eventName = eventName;
	        this.eventDate = eventDate;
	        this.location = location;
	        this.participantNumber = participantNumber;
	        this.cost = cost;
	    }

	    // Getters và Setters
	    public String getEventCode() {
	        return eventCode;
	    }

	    public void setEventCode(String eventCode) {
	        if (eventCode != null && eventCode.matches("^E\\d{3,}$")) {
	            this.eventCode = eventCode;
	        } else {
	            throw new IllegalArgumentException("Mã sự kiện không hợp lệ!");
	        }
	    }

	    public String getEventName() {
	        return eventName;
	    }

	    public void setEventName(String eventName) {
	        this.eventName = eventName;
	    }

	    public LocalDateTime getEventDate() {
	        return eventDate;
	    }

	    public void setEventDate(LocalDateTime eventDate) {
	        this.eventDate = eventDate;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public int getParticipantNumber() {
	        return participantNumber;
	    }

	    public void setParticipantNumber(int participantNumber) {
	        this.participantNumber = participantNumber;
	    }

	    public double getCost() {
	        return cost;
	    }

	    public void setCost(double cost) {
	        this.cost = cost;
	    }

	    // Tính chi phí mỗi người tham gia
	    public double getCostPerParticipant() {
	        double totalCost = cost * 1.1;  // Tính cả VAT 10%
	        if (participantNumber > 0) {
	            return totalCost / participantNumber;
	        } else {
	            throw new IllegalArgumentException("Số người tham gia phải lớn hơn 0!");
	        }
	    }

	    // Phương thức toString để in ra thông tin sự kiện theo định dạng cột
	    public String toString() {
	        return String.format("%-10s | %-20s | %-20s | %-15s | %-10d | %.2f", eventCode, eventName, eventDate, location, participantNumber, cost);
	    }
	}

