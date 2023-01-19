package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@Nested
@DisplayName("Shape Collector Test Suite")
class ShapeCollectorTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    void testAddFigure() {
        //Given
        ShapeCollector newShape = new ShapeCollector("Wielobok", 40);

        //When
        newShape.addFigure(new ShapeCollector("Wielobok", 40));

        //Then
        Assertions.assertEquals(1, newShape.getShapesQuantity());
    }
    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector newShape = new ShapeCollector("Wielobok", 40);

        //When
        boolean result =  newShape.removeFigure(newShape);

        //Then
        Assertions.assertFalse(result);
    }
    @Test
    void  testGetFigure() {
        //Given
        ShapeCollector newShape = new ShapeCollector("Wielobok", 40);
        newShape.addFigure(new ShapeCollector("Wielobok", 40));

        //When
        ShapeCollector oldShape = newShape.getFigure(0);

        //Then
        Assertions.assertEquals(newShape, oldShape);
    }
    @Test
    void testShowFigures() {
        //Given
        ShapeCollector newShape = new ShapeCollector("Wielobok", 40);
        List<ShapeCollector> listOfShapes = new ArrayList<>();

        //When
        listOfShapes.add(newShape.showFigures());

        //Then
        Assertions.assertEquals(listOfShapes,newShape);

    }
}
