package com.kodilla.sudoku;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SudokuGame {
    private final SudokuBoard sudokuBoard = new SudokuBoard();
    private final EnterValues enterValues = new EnterValues();

    public boolean resolveSudoku() {
        sudokuBoard.makeBoard();
        enterValues();
        solveSudoku();
        boolean nextSudoku = nextSudokuToSolve();
        return !(nextSudoku);
    }
    private void enterValues() {
        System.out.println(sudokuBoard);
        List<String> enteredValues = enterValues.enterValues();
        for (String value : enteredValues) {
            sudokuBoard.getValuesIntoBoard(Character.getNumericValue(value.charAt(0)),
                    Character.getNumericValue(value.charAt(1)),Character.getNumericValue(value.charAt(2)));
        }
        System.out.println(sudokuBoard);

    }
    private void solveSudoku() {
        try {
            SudokuSolver sudokuSolver = new SudokuSolver(sudokuBoard);
            SudokuBoard solvedSudoku = sudokuSolver.solveSudoku();
            System.out.println(solvedSudoku);
        } catch (CloneNotSupportedException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

    }
    private boolean nextSudokuToSolve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want use app again? y - yes, n - no");
        String oneMore = scanner.next();
        while (!oneMore.equals("y") &&(!oneMore.equals("n"))) {
            System.out.println("Wrong value! y - yes, n - no");
            oneMore = scanner.next();
        }
        return oneMore.equals("y");
    }
}
