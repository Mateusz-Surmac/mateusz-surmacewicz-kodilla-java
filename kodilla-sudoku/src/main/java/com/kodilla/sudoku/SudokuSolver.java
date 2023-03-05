package com.kodilla.sudoku;

public class SudokuSolver {
    private final SudokuBoard backtrack;

    public SudokuSolver(SudokuBoard sudokuBoard) throws CloneNotSupportedException {
        this.backtrack = sudokuBoard.deepCopy();
    }
    public SudokuBoard solveSudoku() throws CloneNotSupportedException {
        if (!solveBoard()) {
            throw new IllegalArgumentException("Sudoku is not possible to solve");
        }
        return backtrack.deepCopy();
    }
    private boolean solveBoard() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if(emptyField(x, y)) {
                    return solveField(x, y);
                }
            }
        }
        return true;
    }

    private boolean emptyField(int x, int y) {
        return backtrack.getSudokuBoard().get(x).getRows().get(y).getValue() == SudokuElement.EMPTY;
    }

    private boolean solveField(int x, int y) {
        for (int z = 1; z < 10; z++) {
            if(possibleFill(x, y, z)) {
                backtrack.getSudokuBoard().get(x).getRows().get(y).setValue(z);
                if (solveBoard()){
                    return true;
                }
                backtrack.getSudokuBoard().get(x).getRows().get(y).setValue(SudokuElement.EMPTY);
            }
        }
        return false;
    }

    private boolean possibleFill(int x, int y, int value) {
        return possibleInLine(x, y, value) && possibleInField(x, y, value);
    }

    private boolean possibleInField(int x, int y, int value) {
        int startX = x - x % 3;
        int startY = y - y % 3;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3;j++){
                if(backtrack.getSudokuBoard().get(startX+i).getRows().get(startY+j).getValue()==value) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean possibleInLine(int x, int y, int value) {
        for (int i = 0; i < 9; i++){
            if (backtrack.getSudokuBoard().get(i).getRows().get(y).getValue() == value ||
                    backtrack.getSudokuBoard().get(x).getRows().get(i).getValue() == value) {
                return false;
            }
        }
        return true;
    }
}
