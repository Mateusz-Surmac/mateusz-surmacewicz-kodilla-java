package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator testCalculator = new Calculator(7,5);

        int addResult = testCalculator.add(testCalculator.getX(), testCalculator.getY());
        int subtractResult = testCalculator.subtract(testCalculator.getX(), testCalculator.getY());

        if (addResult == 12) {
            System.out.println("Dodawanie działa poprawnie");
        } else if (addResult != 12) {
            System.out.println("Dodawanie nie działa poprawnie");
        }

        if (subtractResult == 2) {
            System.out.println("Odejmowanie działa poprawnie");
        } else if (subtractResult != 2) {
            System.out.println("Odejmowanie nie działa poprawnie");
        }
    }
}