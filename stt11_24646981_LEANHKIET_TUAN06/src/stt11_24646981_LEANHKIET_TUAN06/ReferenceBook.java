package stt11_24646981_LEANHKIET_TUAN06;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class ReferenceBook extends Book {
    private double tax; // tiền thuế cố định trên mỗi quyển (ví dụ)

    public ReferenceBook() {
        super();
        this.tax = 0;
    }

    public ReferenceBook(String code, double unitPrice, int quantity, LocalDate importDate,
                         String publisher, double tax) {
        super(code, unitPrice, quantity, importDate, publisher);
        this.tax = Math.max(0, tax);
    }

    @Override
    public double calculatePriceTotal() {
        // giá = unitPrice * quantity + tax * quantity
        return getQuantity() * (getUnitPrice() + tax);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0 VND");
        return String.format("%s | %7s", super.toString(), df.format(tax));
    }
}
