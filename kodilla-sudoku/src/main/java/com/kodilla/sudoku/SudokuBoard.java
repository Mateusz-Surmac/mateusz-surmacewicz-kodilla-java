package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype {
    public final int minValue = 0;
    public final int maxValue = 8;
    public List<SudokuRow> sudokuBoard = new ArrayList<>();

    public void makeBoard() {
        for (int x = 0; x < 9; x++) {
            sudokuBoard.add(new SudokuRow());
        }
        for (SudokuRow row : sudokuBoard) {
            row.emptyRow();
        }
    }
    public void getValuesIntoBoard(int row, int column, int value) {
        sudokuBoard.get(row).getRows().set(column, new SudokuElement(value));
    }
@Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---------------------------------------");
        result.append("\n");
        for (int i = minValue; i <= maxValue; i++) {
            result.append(" | ");
            for (int j = minValue; j <= maxValue; j++) {
                if (sudokuBoard.get(i).getRows().get(j).getValue() == -1) {
                    result.append(" ");
                } else {
                  result.append((sudokuBoard.get(i).getRows().get(j).getValue()));
              }
               result.append(" | ");
            }
            result.append("\n");
            result.append("---------------------------------------");
            result.append("\n");
        }
        return result.toString();
    }

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard backtrack = (SudokuBoard) super.clone();
        backtrack.sudokuBoard = new ArrayList<>();
        for (SudokuRow row: sudokuBoard){
            SudokuRow backtrackRow = new SudokuRow();
            for (SudokuElement element : row.getRows()) {
                backtrackRow.getRows().add(element);
            }
            backtrack.getSudokuBoard().add(backtrackRow);
        }
        return backtrack;
    }
}
