package app;

public class LibraryApp { //klasa startowa
final static String APP_NAME="Boblioteka v1.1";

    public static void main(String[] args) {

        System.out.println(APP_NAME);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop(); //switche


    }

}
