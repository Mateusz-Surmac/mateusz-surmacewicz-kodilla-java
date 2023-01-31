package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTestSuite {

/*    @Test
    void testReadFile() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertDoesNotThrow(() -> fileReader.readFile());
    }*/
    @Test
    void whenFileDosentExistsReadFileShouldThrowException() {
        // given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        // when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }
    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge x = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> x.probablyIWillThrowException(2.1, 1.5));
        assertThrows(Exception.class, () -> x.probablyIWillThrowException(1, 1.5));
        assertThrows(Exception.class, () -> x.probablyIWillThrowException(2, 1.8));

    }

}