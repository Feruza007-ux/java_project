import java.util.*;

public class Catalog implements Search {

    private Map<String, List<Book>> titles = new HashMap<>();
    private Map<String, List<Book>> authors = new HashMap<>();
    private Map<String, List<Book>> subjects = new HashMap<>();
    private Map<String, List<Book>> publicationDates = new HashMap<>();

    // Add book to catalog
    public void addBook(Book book) {
        titles.computeIfAbsent(book.getTitle(), k -> new ArrayList<>()).add(book);
        authors.computeIfAbsent(book.getAuthor().getName(), k -> new ArrayList<>()).add(book);
        subjects.computeIfAbsent(book.getSubject(), k -> new ArrayList<>()).add(book);
        publicationDates.computeIfAbsent(book.getPublicationDate(), k -> new ArrayList<>()).add(book);
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return titles.getOrDefault(title, new ArrayList<>());
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return authors.getOrDefault(author, new ArrayList<>());
    }

    @Override
    public List<Book> searchBySubject(String subject) {
        return subjects.getOrDefault(subject, new ArrayList<>());
    }

    @Override
    public List<Book> searchByPublicationDate(String publicationDate) {
        return publicationDates.getOrDefault(publicationDate, new ArrayList<>());
    }
}
