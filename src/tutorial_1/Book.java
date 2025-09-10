package tutorial_1;

import java.util.Objects;

public class Book extends Object {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book otherBook = (Book) obj;

        return title.equals(otherBook.title) &&
                author.equals(otherBook.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

}