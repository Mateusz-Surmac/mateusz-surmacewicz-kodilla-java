package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    public List<SudokuElement> sudokuRow = new ArrayList<>();

    public List<SudokuElement> emptyRow() {
        for (int x = 0; x < 9; x++) {
            sudokuRow.add(new SudokuElement(SudokuElement.EMPTY));
        }
        return new ArrayList<>(sudokuRow);
    }
    public List<SudokuElement> getRows() {
        return sudokuRow;
    }

}
