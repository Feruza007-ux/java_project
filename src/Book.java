public class Book {
    private String title;
    private Author author;
    private String subject;
    private String publicationDate;

    public Book(String title, Author author, String subject, String publicationDate) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    public String getPublicationDate() {
        return publicationDate;
    }
}
