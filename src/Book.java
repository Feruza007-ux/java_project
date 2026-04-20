public class Book {
    private String ISBN;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int numberOfPages;

    public Book(String ISBN, String title, String subject, String publisher, String language, int numberOfPages){
        this.ISBN=ISBN;
        this.title=title;
        this.subject=subject;
        this.publisher=publisher;
        this.language=language;
        this.numberOfPages=numberOfPages;
    }

    public String getTitle(){
        return title;
    }
}
