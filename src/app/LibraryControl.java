package app;

import io.DataReader;
import model.Book;
import model.Library;
import model.Magazine;

public class LibraryControl {
    //public static void main(String[] args) {

    private static final int EXIT =0; //5 pól do obsługi switcha
    private static final int ADD_BOOK =1;
    private static final int ADD_MAGAZINE = 2;
    private static final int PRINT_BOOKS =3;
    private static final int PRINT_MAGAZINES = 4;

    private DataReader dataReader = new DataReader();
    private Library library = new Library();


public void controlLoop() { //główna pętla programu
    int option;
    do {
        printOptions();
        option = dataReader.getInt();
        switch (option) {
            case ADD_BOOK:
                addBook();
                break;
            case ADD_MAGAZINE:
                addMagazine();
                break;
            case PRINT_BOOKS:
                printBooks();
                break;
            case EXIT:
                exit();
                break;
            default:
                System.out.println("Nie ma takiej opcji, wprowadź ponownie");
        }
    } while (option != EXIT);
}

    private void exit() {
        System.out.println("Zamykam program.");
        dataReader.close(); //zamykam strumień
    }

    private void printBooks() {
    library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook(); //tworzę nową książkę
        library.addBook(book); // dodaję książkę do biblioteki
    }

    private void printMagazines() {
        library.printMagazines();
    }

    private void addMagazine(){
        Magazine magazine = dataReader.readAndCreateMagazine();//tworzę nowy magazyn
        library.addMagazine(magazine);
    }



    private void printOptions() {
        System.out.println("Wybierz opcję:\n"+ EXIT +"-wyjście z programu\n"+ ADD_BOOK +"-dodanie nowej książki\n"+ADD_MAGAZINE + "-dodanie nowego magazynu\n"+ PRINT_BOOKS +"-wyświetlenie dostępnych książek"+PRINT_MAGAZINES + "-wyświetl dostępne magazyny\n");

    }


}
    //}
