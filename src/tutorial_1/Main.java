package tutorial_1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Advanced Java", "Orkhan G.");
        Book book2 = new Book("Advanced Java", "Orkhan G.");

        System.out.println(book1.equals(book2));

        Set<Book> bookShelf = new HashSet<>();
        bookShelf.add(book1);

        System.out.println(bookShelf.contains(book2));

    }
}
