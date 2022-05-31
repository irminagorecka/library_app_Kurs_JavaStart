package model;

public class Publication {

    private int year;
    private String title;
    private String publisher;

    Publication(int year, String title, String publisher) {//bez specyfikatora dostępu - konstrukto można wywołać w obrębie pakietu
        this.year = year;
        this.title = title;
        this.publisher = publisher;
    }

    int getYear() {
        return year;
    }//gettery bez specyfikatora dostępu żeby nie korzystać poza pakietem
    String getTitle() {
        return title;
    }
    String getPublisher() {
        return publisher;
    }

    void setYear(int year) {//settery bez specyfikatora dostępu żeby nie korzystać poza pakietem
        this.year = year;
    }
    void setTitle(String title) {
        this.title = title;
    }
    void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
