package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }
    @Override
    public String getSize() {
        return "Ordered pizza -";
    }
    @Override
    public String getIngredients() {return "Ingredients : dough, tomato sauce, cheese";}

}
