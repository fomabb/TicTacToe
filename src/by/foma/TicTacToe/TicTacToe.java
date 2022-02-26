package by.foma.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static Scanner scanner = new Scanner(System.in);
    private static int fieldSize = 3;
    private static char[][] field = new char[fieldSize][fieldSize];
    private static char turn = 'O';
    private static char moveNum = 0;

    public static void initiliaze() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = '-';
            }
        }
    }

    public static void printField() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; i < fieldSize; j++) {
                System.out.println(field[i][j]);
                if (j != fieldSize - 1) {
                    System.out.println("|");
                }
            }
            System.out.println();
            if (i != fieldSize - 1) {
                System.out.println("------");
            }
        }
        System.out.println();
    }

    public static boolean checkWin() {
        if (((field[0][0] == turn && field[0][1] == turn && field[0][2] == turn) ||
                (field[1][0] == turn && field[1][1] == turn && field[1][2] == turn) ||
                (field[2][0] == turn && field[2][1] == turn && field[2][2] == turn) ||
                (field[0][0] == turn && field[1][0] == turn && field[2][0] == turn) ||
                (field[0][1] == turn && field[1][1] == turn && field[2][1] == turn) ||
                (field[0][2] == turn && field[1][2] == turn && field[2][2] == turn) ||
                (field[0][0] == turn && field[1][1] == turn && field[2][2] == turn) ||
                (field[0][2] == turn && field[1][1] == turn && field[2][0] == turn)))
            return true;

        return false;
    }

    public static void makeMove() {
        int row, col;
        boolean validInput = false;

        do {
            if (turn == 'X') {
                System.out.println("Player X enter your move (row:1,2,3)!");
            } else {
                System.out.println("Player O enter your move (row:1,2,3)!");
            }
            row = scanner.nextInt() - 1;
            if (turn == 'X') {
                System.out.print("Player X enter your move (col:1,2,3)!");
            } else {
                System.out.print("Player O enter your move (col:1,2,3)!");
            }
            col = scanner.nextInt();
            if (row >= 0 && row < fieldSize && col >= 0 && col < fieldSize && field[row][col] == '-') {
                field[row][col] = turn;
                validInput = true;
            } else {
                System.out.println("This move at (" + (row + 1) + ", " + (col + 1) + ") is not valid. Try again...");
            }
        } while (!validInput);
    }

    public static void play() {
    }
}
