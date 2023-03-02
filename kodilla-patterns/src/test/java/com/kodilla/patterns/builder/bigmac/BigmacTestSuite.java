package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("No")
                .sauce("Standard")
                .sauce("Barbecue")
                .burgers(3)
                .ingredients("Pickles")
                .ingredients("Onion")
                .ingredients("Lettuce")
                .ingredients("Cheece")
                .build();
        System.out.println(bigmac);

        //When&Then
        Assertions.assertEquals(4, bigmac.getIngredients().size());
        Assertions.assertEquals(3, bigmac.getBurgers());
    }
}
