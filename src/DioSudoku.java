import model.Sudoku;
import view.SudokuView;

import java.util.Scanner;

public class DioSudoku {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        SudokuView view = new SudokuView();
        Scanner scanner = new Scanner(System.in);

        while (!sudoku.isComplete()) {
            view.printBoard(sudoku);

            System.out.print("Digite a linha (0-8): ");
            int row = scanner.nextInt();
            System.out.print("Digite a coluna (0-8): ");
            int col = scanner.nextInt();
            System.out.print("Digite o valor (1-9): ");
            int value = scanner.nextInt();

            if (!sudoku.makeMove(row, col, value)) {
                view.printInvalidMove();
            }
        }

        view.printBoard(sudoku);
        view.printVictory();
        scanner.close();
    }
}
