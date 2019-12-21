package com.github.curriculeon;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character [][] board;

    public Board(Character[][] matrix) {
        board = matrix;
    }

    public String getWinner() {

        boolean win = false;
        boolean dRight, dLeft;
        dLeft = dRight = true;
        Character c, d;

        //row
        int dimension = 3;
        for (int i = 0; i < dimension; i++) {
            int j = 0;
            c = board[i][j];
            for (; j < dimension; j++) {
                if (c.equals(board[i][j]))
                    win = true;
                else {
                    win = false;
                    break;
                }
            }
            if (win) {
                if (c.equals('X') || c.equals('O'))
                    return c.toString();
            }
        }

        //column
        for (int i = 0; i < dimension; i++) {
            int j = 0;
            c = board[j][i];
            for (; j < dimension; j++) {
                if (c.equals(board[j][i]))
                    win = true;
                else {
                    win = false;
                    break;
                }
            }
            if (win) {
                if (c.equals('X') || c.equals('O'))
                    return c.toString();
            }
        }

        //diagonal

        c = board[0][0];
        d = board[0][dimension - 1];
        for (int i = 0; i < dimension; i++) {
            int j = 0;
            for (; j < dimension; j++) {
                if (i == j) {
                    if (!c.equals(board[i][j]))
                        dRight = false;
                }
                if ((i + j) == 2) {
                    if (!d.equals(board[i][j]))
                        dLeft = false;
                }
            }
        }
        if (dLeft)
            return d.toString();
        else if (dRight)
            return c.toString();
        else
            return "";
    }

    public Boolean isInFavorOfX() {
        return getWinner().equals("X");
    }

    public Boolean isInFavorOfO() {
        return getWinner().equals("O");
    }

    public Boolean isTie() {
        return getWinner().equals("");
    }
}
