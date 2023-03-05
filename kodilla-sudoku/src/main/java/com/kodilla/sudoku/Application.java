package com.kodilla.sudoku;

public class Application {
    public static void main(String[] args) {
        System.out.println("Weclome to sudoku game!");
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
