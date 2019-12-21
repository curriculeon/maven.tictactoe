package com.github.curriculeon;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private final int dimension = 3;
    private Character winner;
    private Character [][] board = new Character[dimension][dimension];

    public Board(Character[][] matrix) {
        board = matrix;
    }

    public void setup() {
        // Given
        this.board = (new Character[][]{
                {'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
        });
    }

    public String getWinner()
    {

        boolean win = false;
        Character c = 'd';

        //row
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
            if (win){
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

        //diagonal right

        for (int i = 0; i < dimension; i++) {
            int j = 0;
            c = board[i][j];
            for (; j < dimension; j++) {
                if (i == j) {
                    if (c.equals(board[i][j]))
                        win = true;
                    else {
                        win = false;
                        return "";
                    }
                }
            }
        }
        if (win) {
            if (c.equals('X') || c.equals('O'))
                return c.toString();
        }

        //diagonal left

        c = board[0][dimension];
        for (int i = 0; i < dimension; i++) {
            int j = 0;

            for (; j < dimension; j++) {
                if ((i + j) == 2) {
                    if (c.equals(board[i][j]))
                        win = true;
                    else {
                        win = false;
                        return "";
                    }
                }
            }
        }
        if (win) {
            if (c.equals('X') || c.equals('O'))
                return c.toString();
        }
        return c.toString();
    }

    public Boolean isInFavorOfX() {
        if (getWinner().equals("X"))
            return true;
        else
            return false;
    }

    public Boolean isInFavorOfO() {
        if (getWinner().equals('O'))
            return true;
        else
            return false;
    }

    public Boolean isTie() {
        if (getWinner().equals(""))
            return true;
        else
            return false;
    }

   /* public static void main(String[] args)
    {
        Board board = new Board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
        });

        System.out.println(board.getWinner());
    }*/

}
