package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void printGrid(char[][] grid) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.printf("| %c %c %c |%n", grid[i][0], grid[i][1], grid[i][2]);
        }
        System.out.println("---------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] grid = new char[3][3];
        for (char[] chars : grid) {
            Arrays.fill(chars, ' ');
        }

        printGrid(grid);

        int userMoveRow;
        int userMoveColumn;
        int totalX = 0;
        int totalO = 0;
        boolean gameStateWin = true;
        boolean moveX = true;
        boolean moveO = false;
        boolean xxx = false;
        boolean ooo = false;

        while (gameStateWin) {
            while (moveX) {
                userMoveRow = scanner.nextInt();
                userMoveColumn = scanner.nextInt();

                if (userMoveRow < 1 || userMoveRow > 3 || userMoveColumn < 1 || userMoveColumn > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (grid[userMoveRow - 1][userMoveColumn - 1] == 'X'
                        || grid[userMoveRow - 1][userMoveColumn - 1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (grid[userMoveRow - 1][userMoveColumn - 1] == ' ') {
                    grid[userMoveRow - 1][userMoveColumn - 1] = 'X';
                    printGrid(grid);
                    totalX++;
                    moveX = false;
                    moveO = true;
                } else {
                    System.out.println("You should enter numbers!");
                }

                for (int i = 0; i < 3; i++) {
                    int row = 0;
                    int clm = 0;
                    int mDiag = 0;
                    int aDiag = 0;

                    for (int j = 0; j < 3; j++) {
                        row += grid[i][j];
                        clm += grid[j][i];
                        mDiag += grid[j][j];
                        aDiag += grid[j][2 - j];
                    }

                    // ASCII value for X is 88 (X+X+X is 264)
                    // ASCII value for O is 79 (O+O+O is 237)
                    xxx = xxx || row == 264 || clm == 264 || mDiag == 264 || aDiag == 264;
                    ooo = ooo || row == 237 || clm == 237 || mDiag == 237 || aDiag == 237;
                }

                if (Math.abs(totalX - totalO) > 1 || xxx && ooo) {
                    System.out.println("Impossible");
                    gameStateWin = false;
                    break;
                } else if (xxx) {
                    System.out.println("X wins");
                    gameStateWin = false;
                    break;
                } else if (ooo) {
                    System.out.println("O wins");
                    gameStateWin = false;
                    break;
                } else if (totalX + totalO == 9) {
                    System.out.println("Draw");
                    gameStateWin = false;
                    break;
                } else {
                    System.out.println();
                }
            }
            while (moveO) {
                userMoveRow = scanner.nextInt();
                userMoveColumn = scanner.nextInt();

                if (userMoveRow < 1 || userMoveRow > 3 || userMoveColumn < 1 || userMoveColumn > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (grid[userMoveRow - 1][userMoveColumn - 1] == 'X'
                        || grid[userMoveRow - 1][userMoveColumn - 1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else if (grid[userMoveRow - 1][userMoveColumn - 1] == ' ') {
                    grid[userMoveRow - 1][userMoveColumn - 1] = 'O';
                    printGrid(grid);
                    totalO++;
                    moveO = false;
                    moveX = true;
                } else {
                    System.out.println("You should enter numbers!");
                }

                for (int i = 0; i < 3; i++) {
                    int row = 0;
                    int clm = 0;
                    int mDiag = 0;
                    int aDiag = 0;

                    for (int j = 0; j < 3; j++) {
                        row += grid[i][j];
                        clm += grid[j][i];
                        mDiag += grid[j][j];
                        aDiag += grid[j][2 - j];
                    }

                    // ASCII value for X is 88 (X+X+X is 264)
                    // ASCII value for O is 79 (O+O+O is 237)
                    xxx = xxx || row == 264 || clm == 264 || mDiag == 264 || aDiag == 264;
                    ooo = ooo || row == 237 || clm == 237 || mDiag == 237 || aDiag == 237;
                }

                if (Math.abs(totalX - totalO) > 1 || xxx && ooo) {
                    System.out.println("Impossible");
                    gameStateWin = false;
                    break;
                } else if (xxx) {
                    System.out.println("X wins");
                    gameStateWin = false;
                    break;
                } else if (ooo) {
                    System.out.println("O wins");
                    gameStateWin = false;
                    break;
                } else if (totalX + totalO == 9) {
                    System.out.println("Draw");
                    gameStateWin = false;
                    break;
                } else {
                    System.out.println();
                }
            }
        }
    }
}


