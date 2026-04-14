import java.util.Date;

class BookReservation {
    Date creationDate;
    ReservationStatus status;
    Member member;
    BookItem book;

    public BookReservation(Member member, BookItem book) {
        this.creationDate = new Date();
        this.status = ReservationStatus.WAITING;
        this.member = member;
        this.book = book;
    }

    public void completeReservation() {
        this.status = ReservationStatus.COMPLETED;
    }

    public void cancelReservation() {
        this.status = ReservationStatus.CANCELED;
    }

    public ReservationStatus getStatus() {
        return status;
    }
}
