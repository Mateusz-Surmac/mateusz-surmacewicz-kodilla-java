package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SmallPizzaDecorator extends AbstractPizzaOrderDecorator{

    public SmallPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(30));
    }

    @Override
    public String getSize() {
        return super.getSize() + " Small";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients();
    }
}