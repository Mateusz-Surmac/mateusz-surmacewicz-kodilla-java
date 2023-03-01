package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Book book1 = new Book("Wiedzmin", "Andrzej Sapkowski", LocalDate.of(1997,10,10));
        Book book2 = new Book("Sztuka Wojny", "Sun Tzu,Sun Pin", LocalDate.of(-500, 4,4));
        Book book3 = new Book("Samozwaniec", "Jacek Komuda", LocalDate.of(2012, 11,11));
        Book book4 = new Book("Rok 1984", "George Orwell", LocalDate.of(1949, 6,6));

        Library library = new Library("Mateuszek Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When&Then
        Assertions.assertEquals(4, library.getBooks().size());
        Assertions.assertEquals(4, clonedLibrary.getBooks().size());
        Assertions.assertEquals(4, deepClonedLibrary.getBooks().size());

    }
}
