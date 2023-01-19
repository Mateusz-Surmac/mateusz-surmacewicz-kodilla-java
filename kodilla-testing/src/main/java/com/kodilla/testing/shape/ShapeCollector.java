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
    }
    public boolean removeFigure(ShapeCollector shape) {
        return true;
    }
    public String getFigure(int n) {
        return null;
    }
    public ShapeCollector showFigures() {
        return null;
    }
    public int getShapesQuantity() {
        int result = shapeCollectorList.size();
        return result;
    }


}
