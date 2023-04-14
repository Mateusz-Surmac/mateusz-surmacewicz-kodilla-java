package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("SunTzu", "Art of War", -500,"54km3kgf45kmg");
        Book book2 = new Book("George Orwell", "1984", 1949,"vsdjn435j5n45");
        Book book3 = new Book("Niccolo Machiavelli", "Principe", 1513, "vsjkn4kn54");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When & Then
        assertEquals(1513,medianAdapter.publicationYearMedian(bookSet));
    }
}
