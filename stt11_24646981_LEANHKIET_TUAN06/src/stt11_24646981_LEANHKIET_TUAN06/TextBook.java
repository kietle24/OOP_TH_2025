package stt11_24646981_LEANHKIET_TUAN06;

import java.time.LocalDate;

public class TextBook extends Book {
    private BookStatus status;

    public TextBook() {
        super();
        this.status = BookStatus.NEW;
    }

    public TextBook(String code, double unitPrice, int quantity, LocalDate importDate,
                    String publisher, BookStatus status) {
        super(code, unitPrice, quantity, importDate, publisher);
        this.status = status == null ? BookStatus.NEW : status;
    }

    @Override
    public double calculatePriceTotal() {
        double rate = (status == BookStatus.NEW) ? 1.0 : 0.5;
        return getQuantity() * getUnitPrice() * rate;
    }

    @Override
    public String toString() {
        return String.format("%s | %7s", super.toString(), status);
    }
}
