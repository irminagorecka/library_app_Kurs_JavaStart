package model;

public class Book {
    String title;
    private String author;
    private int relaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    public Book(String title, String author, int relaseDate, int pages, String publisher, String isbn) { //constructor with isbn
        this(title, author, relaseDate, pages, publisher);
        this.isbn=isbn;
    }

    public Book(String title, String author, int relaseDate, int pages, String publisher) { //constructor without isbn
        this.title = title;
        this.author = author;
        this.relaseDate = relaseDate;
        this.pages = pages;
        this.publisher = publisher;
    }

    public void printInfo(){
       String info=title+ "; "+author+ "; "+relaseDate+ "; "+pages+ "; "+publisher;
               if (isbn!=null){
                   info=info+"; "+isbn;
               };
        System.out.println(info);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getRelaseDate() {
        return relaseDate;
    }

    public int getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRelaseDate(int relaseDate) {
        this.relaseDate = relaseDate;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
