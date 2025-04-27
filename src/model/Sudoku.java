package model;

public class Sudoku {
    private int[][] board;
    private boolean[][] fixedCells;

    public Sudoku() {
        board = new int[9][9];
        fixedCells = new boolean[9][9];
        initializeBoard();
    }

    private void initializeBoard() {
        // Tabuleiro inicial (0 = célula vazia)
        int[][] initial = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = initial[i][j];
                if (board[i][j] != 0) {
                    fixedCells[i][j] = true;
                }
            }
        }
    }

    public boolean isMoveValid(int row, int col, int value) {
        if (fixedCells[row][col] || value < 1 || value > 9) {
            return false;
        }

        // Checar linha e coluna
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == value || board[i][col] == value) {
                return false;
            }
        }

        // Checar quadrante 3x3
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean makeMove(int row, int col, int value) {
        if (isMoveValid(row, col, value)) {
            board[row][col] = value;
            return true;
        }
        return false;
    }

    public boolean isComplete() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] getBoard() {
        return board;
    }

    public boolean isFixedCell(int row, int col) {
        return fixedCells[row][col];
    }
}
