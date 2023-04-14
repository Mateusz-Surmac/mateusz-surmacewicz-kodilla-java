package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class LargePizzaDecorator extends AbstractPizzaOrderDecorator{

    public LargePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(50));
    }

    @Override
    public String getSize() {
        return super.getSize() + " Large";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients();
    }
}
