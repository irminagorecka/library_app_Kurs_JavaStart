package model;

public class Book extends Publication{

    private String author;
    //private int relaseDate;
    private int pages;
    private String isbn;

    /*public Book(String title, String author, int relaseDate, int pages, String publisher, String isbn) { //constructor with isbn
        this(title, author, relaseDate, pages, publisher);
        this.isbn=isbn
    }*/

    public Book(String title, int year, String author, int pages, String publisher, String isbn) {
        super(year, title, publisher);
        //setTitle(title); //do klas prywatnych z klasy nadrzędnej odnosimy się poprzez settery i gettery
        //setPublisher(publisher);
       // setYear(year);
        this.author = author;
        this.pages = pages;
        this.isbn=isbn;
    }

    public void printInfo(){
       String info=getTitle()+ "; "+author+ "; "+ getYear()+"; "+pages+ "; "+getPublisher();
               if (isbn!=null){
                   info=info+"; "+isbn;
               };
        System.out.println(info);
    }


    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
