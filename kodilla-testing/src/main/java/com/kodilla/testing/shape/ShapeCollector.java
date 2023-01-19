package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private String ShapeName;
    private int Field;

    private List<ShapeCollector> shapeCollectorList = new ArrayList<>();

    public ShapeCollector(String ShapeName, int Field) {
        this.ShapeName = ShapeName;
        this.Field = Field;
    }
    public void addFigure(ShapeCollector shape) {
        ShapeCollector newFigure = new ShapeCollector(ShapeName, Field);
        shapeCollectorList.add(newFigure);
    }
    public boolean removeFigure(ShapeCollector shape) {
        boolean result = false;
        if (shapeCollectorList.contains(shape)) {
            shapeCollectorList.remove(shape);
            result = true;
        }
        return result;
    }
    public ShapeCollector getFigure(int n) {
        ShapeCollector figure = shapeCollectorList.get(n);
        return figure;
    }
    public String showFigures() {
        List<String> allShapes = new ArrayList<>();
        for (ShapeCollector x : shapeCollectorList) {
            allShapes.add(x.getShapeName());
        }
        return "" + allShapes;
    }
    public int getShapesQuantity() {
            int result = shapeCollectorList.size();
        return result;
    }

    public String getShapeName() {
        return ShapeName;
    }

}
