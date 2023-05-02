package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPerfectPizza() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new LargePizzaDecorator(pizzaOrder);
        pizzaOrder = new HotPeppersDecorator(pizzaOrder);
        pizzaOrder = new CornDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When & Then
        assertEquals(new BigDecimal(76), pizzaOrder.getCost());
        assertEquals("Ordered pizza - Large", pizzaOrder.getSize());
        assertEquals("Ingredients : dough, tomato sauce, cheese, hot peppers, corn, extra cheese", pizzaOrder.getIngredients());
    }
}
