package com.kodilla.testing.calculator;

public class Calculator {
    int x;
    int y;
    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int add(int x, int y) {
        return (x + y);
    }
    public int subtract(int x, int y) {
            return (x-y);
        }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
