package pl.lublin.wsei.java.cwiczenia;

public class Book {
    String title;
    private String author;
    private int relaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    public Book(String title, String author, int relaseDate, int pages, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.relaseDate = relaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn = isbn;
    }
}
