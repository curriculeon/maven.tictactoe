package com.github.curriculeon;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] matrix;
    char result;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
        this.result = runGame();
    }



    public char runGame(){
        char[] arr = {'X','O'};
        for (char v:  arr){
            // row
            if(this.matrix[0][0] == v &
               this.matrix[1][0] == v &
               this.matrix[2][0] == v  ){return v;}

            else if(this.matrix[0][1] == v &
                    this.matrix[1][1] == v &
                    this.matrix[2][1] == v  ){return v;}

            else if(this.matrix[0][2] == v &
                    this.matrix[1][2] == v &
                    this.matrix[2][2] == v  ){return v;}
            //col
            else if(this.matrix[0][0] == v &
                    this.matrix[0][1] == v &
                    this.matrix[0][2] == v  ){return v;}

            else if(this.matrix[1][0] == v &
                    this.matrix[1][1] == v &
                    this.matrix[1][2] == v  ){return v;}

            else if(this.matrix[2][0] == v &
                    this.matrix[2][1] == v &
                    this.matrix[2][2] == v  ){return v;}
            //diag
            else if(this.matrix[0][0] == v &
                    this.matrix[1][1] == v &
                    this.matrix[2][2] == v  ){return v;}

            else if(this.matrix[2][0] == v &
                    this.matrix[1][1] == v &
                    this.matrix[0][2] == v  ){return v;}
        }

        return ' ';
    }
    public Boolean isInFavorOfX() {
        return  result == 'X';
    }

    public Boolean isInFavorOfO() {
        return result == 'O';
    }

    public Boolean isTie() {
        return result == ' ';
    }

    public String getWinner() {
        return String.valueOf( result);
    }

}
