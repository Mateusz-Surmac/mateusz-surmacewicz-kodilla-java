package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MediumPizzaDecorator extends AbstractPizzaOrderDecorator{

    public MediumPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(40));
    }

    @Override
    public String getSize() {
        return super.getSize() + " Medium";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients();
    }
}