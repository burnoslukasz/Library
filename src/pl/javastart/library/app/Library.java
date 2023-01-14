package pl.javastart.library.app;

import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.6";
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz",
                2010, 296, "Greg", "9788373271890");
        Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch",
                2009, 352, "Helion", "9788548789690");
        Book book3 = new Book("Zachowaj Spokoj", "Harlan Coben",
                2008, 448, "Albatros");

        System.out.println(appName);
        System.out.println("Ksiazka dostepna w bibliotece: ");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
