package QL_EVENT;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventList {
    private Event[] events;
    private int size;

    // Default constructor, khởi tạo mảng 10 phần tử
    public EventList() {
        this.events = new Event[10];
        this.size = 0;
    }

    // Phương thức thêm sự kiện
    public boolean addEvent(Event event) {
        if (size >= events.length) {
            // Tăng kích thước mảng lên gấp đôi khi mảng đầy
            resizeArray();
        }
        for (int i = 0; i < size; i++) {
            if (events[i].getEventCode().equalsIgnoreCase(event.getEventCode())) {
                return false;  // Sự kiện trùng mã
            }
        }
        events[size++] = event;
        return true;
    }

    // Phương thức cập nhật sự kiện (chỉ cho phép cập nhật sự kiện chưa diễn ra)
    public boolean updateEvent(Event newInfo) {
        if (newInfo == null || newInfo.getEventCode() == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (events[i].getEventCode().equals(newInfo.getEventCode())) {
                if (events[i].getEventDate().isAfter(LocalDateTime.now())) {
                    // Cập nhật thông tin sự kiện
                    events[i] = newInfo;
                    return true;
                }
                return false;  // Sự kiện đã diễn ra không thể cập nhật
            }
        }
        return false;  // Sự kiện không tồn tại
    }

    // Phương thức liệt kê các sự kiện có số người tham gia đông nhất trong một năm
    public Event[] getEventsWithMaxParsInYear(int year) {
        List<Event> filteredEvents = new ArrayList<>();
        int maxParticipants = -1;

        for (int i = 0; i < size; i++) {
            Event event = events[i];
            int eventYear = event.getEventDate().getYear();
            if (eventYear == year) {
                if (event.getParticipantNumber() > maxParticipants) {
                    maxParticipants = event.getParticipantNumber();
                    filteredEvents.clear();  // Xóa danh sách sự kiện cũ
                    filteredEvents.add(event);
                } else if (event.getParticipantNumber() == maxParticipants) {
                    filteredEvents.add(event);  // Thêm sự kiện có số người tham gia bằng
                }
            }
        }

        return filteredEvents.toArray(new Event[0]);
    }

    // Phương thức để tăng kích thước mảng
    private void resizeArray() {
        Event[] newArray = new Event[events.length * 2];
        System.arraycopy(events, 0, newArray, 0, size);
        events = newArray;
    }

    // Getter
    public Event[] getEvents() {
        return events;
    }
}



