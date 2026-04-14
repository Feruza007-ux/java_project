import java.util.Date;

class BookLending {
    Date creationDate;
    Date dueDate;
    Date returnDate;
    BookItem book;
    Member member;

    public BookLending(BookItem book, Member member) {
        this.creationDate = new Date();
        this.dueDate = new Date(System.currentTimeMillis() + 7L * 24 * 60 * 60 * 1000); // 7 days
        this.book = book;
        this.member = member;
    }

    public void returnBook() {
        this.returnDate = new Date();
        book.status = BookStatus.AVAILABLE;
       // member.borrowedBooks.remove(book);
    }
