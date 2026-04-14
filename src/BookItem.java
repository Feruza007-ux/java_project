import java.util.Date;

class BookItem extends Book {
    String barcode;
    boolean isReferenceOnly;
    Date borrowedDate;
    Date dueDate;
    double price;
    BookFormat format;
    BookStatus status;
    Date dateOfPurchase;
    Date publicationDate;

    public boolean checkout(Member member) {
        if (status != BookStatus.AVAILABLE) return false;

        status = BookStatus.LOANED;
        borrowedDate = new Date();
        dueDate = new Date(System.currentTimeMillis() + 7L*24*60*60*1000);
