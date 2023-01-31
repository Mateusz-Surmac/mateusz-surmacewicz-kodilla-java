package com.kodilla.exception.test;

public class ExceptionHandling {
    public String probablyIWillThrowException() {
    SecondChallenge x = new SecondChallenge();

    try {
        x.probablyIWillThrowException(1.8, 1.5);
    } catch(Exception e) {
        System.out.println("Exception");
    } finally {
        System.out.println("Program finished!");
    }
        return null;
    }
}
