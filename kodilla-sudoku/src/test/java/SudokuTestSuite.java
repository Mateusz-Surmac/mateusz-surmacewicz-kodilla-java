import com.kodilla.sudoku.SudokuBoard;
import org.junit.jupiter.api.Test;

public class SudokuTestSuite {
    @Test
    void testPrintBoard() {
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.makeBoard();
        System.out.println(sudokuBoard);
    }
}
