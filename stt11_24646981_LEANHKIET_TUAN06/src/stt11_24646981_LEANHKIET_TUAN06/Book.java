package stt11_24646981_LEANHKIET_TUAN06;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

public abstract class Book {
    protected String code;
    protected double unitPrice;
    protected int quantity;
    protected LocalDate importDate;
    protected String publisher;

    public Book() {
        this("99999", 1.0, 1, LocalDate.now(), "khong xac dinh");
    }

    public Book(String code, double unitPrice, int quantity, LocalDate importDate, String publisher) {
        this.code = code;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.importDate = importDate;
        this.publisher = publisher;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice < 0 ? 1 : unitPrice; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity < 0 ? 1 : quantity; }

    public LocalDate getImportDate() { return importDate; }
    public void setImportDate(LocalDate importDate) {
        if (importDate == null || importDate.isAfter(LocalDate.now())) {
            importDate = LocalDate.now();
        }
        this.importDate = importDate;
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) {
        this.publisher = (publisher == null || publisher.isBlank()) ? "khong xac dinh" : publisher;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCompactNumberInstance(new Locale("vi","VN"), NumberFormat.Style.SHORT);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%6s | %12s | %2d | %10s | %15s",
                code, nf.format(unitPrice), quantity, dtf.format(importDate), publisher);
    }

    @Override
    public int hashCode() { return Objects.hash(code); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book other)) return false;
        return Objects.equals(code, other.code);
    }

    // Bắt buộc class con cài đặt:
    public abstract double calculatePriceTotal();
}
