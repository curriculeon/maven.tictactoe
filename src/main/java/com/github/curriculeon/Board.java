package com.github.curriculeon;

import java.util.ArrayList;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public static Character[][] matrixBoard = new Character[3][3];

    public Board(Character[][] matrix) {
        matrixBoard = matrix;
    }

    public Boolean isInFavorOfX() {
        if (checkRowForWin('X') || checkColumnForWin('X') || checkDiagonalForWin('X')){
            return true;
        }
        return false;
    }

    private boolean checkDiagonalForWin(char ch) {
        if ((matrixBoard[0][0].equals(ch) && matrixBoard[1][1].equals(ch) && matrixBoard[2][2].equals(ch)) ||
                (matrixBoard[0][2].equals(ch) && matrixBoard[1][1].equals(ch) && matrixBoard[2][0].equals(ch))){
            return true;
        }
        return false;
    }

    private boolean checkColumnForWin(char ch) {
        for (int i = 0; i < matrixBoard[0].length; i++){
            if (matrixBoard[0][i].equals(ch) && matrixBoard[1][i].equals(ch) && matrixBoard[2][i].equals(ch)){
                return true;
            }
        }
        return false;
    }

    private boolean checkRowForWin(char ch) {
        for (int i = 0; i < matrixBoard.length; i++){
            if (matrixBoard[i][0].equals(ch) && matrixBoard[i][1].equals(ch) && matrixBoard[i][2].equals(ch)) {
                return true;
            }
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if (checkRowForWin('O') || checkColumnForWin('O') || checkDiagonalForWin('O')){
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if ((isInFavorOfO() || isInFavorOfX())) {
            return false;
        }
        return true;
    }

    public String getWinner() {
        if (isInFavorOfX()){
            return "X";
        } else if (isInFavorOfO()){
            return "O";
        }
        return "";
    }

}
