package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterValues {
    private final Scanner scanner= new Scanner(System.in);

    public List<String> enterValues() {
        List<String> valuesToEnter = new ArrayList<>();
        while (true) {
            consoleMessage();
            String values = scanner.nextLine();
            checkValues(values);
            if (values.equals("SUDOKU")){break;}
            valuesToEnter.add(values);
        }
        return valuesToEnter;
    }

    private void consoleMessage() {
        System.out.println("""
                Enter values without space, example: 123 
                1- Row, 2 - Column, 3 - Value 
                If you want to finish entering, enter the SUDOKU""");
    }
    private String checkValues(String values) {
        while (!values.matches("-?[0-8]{3}")) {
            if (values.equals("SUDOKU")) {break;}
            System.out.println("Wrong value! Enter 3 numbers from 0 to 8");
            values = scanner.nextLine();

        }
        return values;
    }

}
