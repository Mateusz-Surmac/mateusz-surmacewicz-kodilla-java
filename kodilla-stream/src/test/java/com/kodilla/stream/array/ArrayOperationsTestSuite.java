package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //When
        int[] testNumbers = {1,2,3,4,4,5,6,74,34,23,23,56,65,77,98,90,11};

        //Then
        OptionalDouble average = OptionalDouble.of(0);
        ArrayOperations x = new ArrayOperations() {};
        average = ArrayOperations.getAverage(testNumbers);
        OptionalDouble trueAverage = OptionalDouble.of(33.88235294117647);

        //Then
        Assertions.assertEquals(trueAverage,average);
    }
}
