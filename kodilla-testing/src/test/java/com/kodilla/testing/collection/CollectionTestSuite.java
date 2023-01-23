package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Rozpoczęcie testowania");
    }

    @AfterEach
    public void after() {
        System.out.println("Koniec testowania");
    }
    @Test
    void OddNumbersExterminatorNormalList() {
        //Given
        List<Integer> OddNumbersExterminatorNormalList = new ArrayList<>();
        OddNumbersExterminatorNormalList.add(5);
        OddNumbersExterminatorNormalList.add(4);
        OddNumbersExterminatorNormalList.add(3);
        OddNumbersExterminatorNormalList.add(2);
        OddNumbersExterminatorNormalList.add(1);
        List<Integer> testList = new ArrayList<>();
        testList.add(4);
        testList.add(2);
        List<Integer> reslutList = new ArrayList<>();

        //When
        OddNumbersExterminator test = new OddNumbersExterminator();
        reslutList = test.exterminate(OddNumbersExterminatorNormalList);

        //Then
        Assertions.assertEquals(reslutList, testList);
    }
    @Test
    void OddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> OddNumbersExterminatorEmptyList = new ArrayList<>();
        List<Integer> testList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        //When
        OddNumbersExterminator test = new OddNumbersExterminator();
        resultList = test.exterminate(OddNumbersExterminatorEmptyList);

        //Then
        Assertions.assertEquals(resultList, testList);
    }
}
