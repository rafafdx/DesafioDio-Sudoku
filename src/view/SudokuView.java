package view;

import model.Sudoku;

public class SudokuView {

    public void printBoard(Sudoku sudoku) {
        int[][] board = sudoku.getBoard();
        System.out.println("\n===== Sudoku =====");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                int value = board[i][j];
                System.out.print(value == 0 ? ". " : value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printInvalidMove() {
        System.out.println("Jogada inválida! Tente novamente.");
    }

    public void printVictory() {
        System.out.println("Parabéns! Você completou o Sudoku!");
    }
}
