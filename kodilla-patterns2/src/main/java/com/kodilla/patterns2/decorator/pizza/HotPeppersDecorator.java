package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HotPeppersDecorator extends AbstractPizzaOrderDecorator {

    public HotPeppersDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", hot peppers";
    }
}