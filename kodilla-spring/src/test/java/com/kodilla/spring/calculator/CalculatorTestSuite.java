package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    public Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double add = calculator.add(4,2);
        double sub = calculator.sub(4,2);
        double mul = calculator.mul(4,2);
        double div = calculator.div(4,2);

        //Then
        Assertions.assertEquals(add,6);
        Assertions.assertEquals(sub,2);
        Assertions.assertEquals(mul, 8);
        Assertions.assertEquals(div, 2);

    }
}
