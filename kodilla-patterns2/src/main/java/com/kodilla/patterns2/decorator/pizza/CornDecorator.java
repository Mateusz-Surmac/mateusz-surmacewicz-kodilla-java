package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CornDecorator extends AbstractPizzaOrderDecorator {

    public CornDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", corn";
    }
}