package QL_EVENT;
import java.time.LocalDateTime;
public class EventTest {
    public static void main(String[] args) {
        // Khởi tạo danh sách sự kiện
        EventList eventList = new EventList();

        // Tạo các sự kiện và thêm vào danh sách
        Event event1 = new Event("E001", "Concert", LocalDateTime.of(2023, 5, 20, 19, 0), "Hanoi", 500, 1000.0);
        eventList.addEvent(event1);

        Event event2 = new Event("E002", "Workshop", LocalDateTime.of(2023, 5, 22, 9, 0), "Danang", 300, 500.0);
        eventList.addEvent(event2);

        Event event3 = new Event("E003", "Conference", LocalDateTime.of(2023, 6, 10, 8, 0), "Hanoi", 1000, 1500.0);
        eventList.addEvent(event3);

        Event event4 = new Event("E004", "Seminar", LocalDateTime.of(2023, 7, 10, 14, 0), "HCM", 800, 1200.0);
        eventList.addEvent(event4);

        Event event5 = new Event("E005", "Exhibition", LocalDateTime.of(2023, 5, 15, 10, 0), "Hanoi", 500, 700.0);
        eventList.addEvent(event5);

        // Kiểm thử chức năng "getEventsWithMaxParsInYear" cho năm 2023
        System.out.println("Sự kiện có số người tham gia đông nhất trong năm 2023:");
        Event[] maxParsEvents = eventList.getEventsWithMaxParsInYear(2023);
        for (Event event : maxParsEvents) {
            System.out.println(event.toString());
        }

        // Kiểm thử chức năng "updateEvent"
        System.out.println("\nCập nhật sự kiện E002:");
        Event newEventInfo = new Event("E002", "Updated Workshop", LocalDateTime.of(2023, 5, 22, 9, 0), "Danang", 250, 600.0);
        boolean updated = eventList.updateEvent(newEventInfo);
        if (updated) {
            System.out.println("Sự kiện đã được cập nhật: " + event2.toString());
        } else {
            System.out.println("Cập nhật sự kiện thất bại");
        }

        // Kiểm thử chức năng "addEvent" và thêm sự kiện mới nếu cần
        System.out.println("\nThêm sự kiện E006:");
        Event event6 = new Event("E006", "Sports Event", LocalDateTime.of(2023, 8, 1, 15, 0), "Hanoi", 300, 900.0);
        boolean added = eventList.addEvent(event6);
        if (added) {
            System.out.println("Sự kiện đã được thêm: " + event6.toString());
        } else {
            System.out.println("Không thể thêm sự kiện");
        }

        // Kiểm thử lại sự kiện đã thêm vào
        System.out.println("\nDanh sách các sự kiện sau khi thêm:");
        for (Event event : eventList.getEvents()) {
            if (event != null) {
                System.out.println(event.toString());
            }
        }
    }
}

