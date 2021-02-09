public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;

    }

    public String hasTitle(){
        return this.title;
    }

    public String hasAuthor(){
        return this.author;
    }

    public String hasGenre(){
        return this.genre;
    }
}
