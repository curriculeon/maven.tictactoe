package com.github.curriculeon;

import java.nio.charset.CharacterCodingException;

/**
 * @author leon on 6/22/18.
 */
public class Board {


    private final Character[][] matrix;


    public Board(Character[][] matrix) {
        this.matrix = matrix;

        Character topLeft = this.matrix[0][0];
        Character topMiddle = this.matrix[0][1];
        Character topRight = this.matrix[0][2];
        Character middleLeft = this.matrix[1][0];
        Character middleMiddle = this.matrix[1][1];
        Character middleRight = this.matrix[1][2];
        Character bottomLeft = this.matrix[2][0];
        Character bottomMiddle = this.matrix[2][1];
        Character bottomRight = this.matrix[2][2];

        Character[] topRow = new Character[] {topLeft, topMiddle, topRight};
        Character[] middleRow = new Character[] {middleLeft, middleMiddle, middleRight};
        Character[] bottomRow = new Character[]{bottomLeft, bottomMiddle, bottomRight};
        Character[] leftColumn = new Character[] {topLeft, middleLeft, bottomLeft};
        Character[] middleColumn = new Character[] {middleLeft, middleMiddle, bottomMiddle};
        Character[] rightColumn = new Character[] {topRight, middleRight, bottomRight};
        Character[] leftDiagonal = new Character[] {topLeft, middleMiddle, bottomRight};
        Character[] rightDiagonal = new Character[] {topRight, middleMiddle, bottomLeft};
    }

    public Boolean isInFavorOfX() {
        Character topLeft = this.matrix[0][0];
        Character topMiddle = this.matrix[0][1];
        Character topRight = this.matrix[0][2];
        Character middleLeft = this.matrix[1][0];
        Character middleMiddle = this.matrix[1][1];
        Character middleRight = this.matrix[1][2];
        Character bottomLeft = this.matrix[2][0];
        Character bottomMiddle = this.matrix[2][1];
        Character bottomRight = this.matrix[2][2];

        Character[] topRow = new Character[] {topLeft, topMiddle, topRight};
        Character[] middleRow = new Character[] {middleLeft, middleMiddle, middleRight};
        Character[] bottomRow = new Character[]{bottomLeft, bottomMiddle, bottomRight};
        Character[] leftColumn = new Character[] {topLeft, middleLeft, bottomLeft};
        Character[] middleColumn = new Character[] {middleLeft, middleMiddle, bottomMiddle};
        Character[] rightColumn = new Character[] {topRight, middleRight, bottomRight};
        Character[] leftDiagonal = new Character[] {topLeft, middleMiddle, bottomRight};
        Character[] rightDiagonal = new Character[] {topRight, middleMiddle, bottomLeft};
        if (hasSameElement('X', topRow)){
            return true;}
        return false;
    }

    public Boolean isInFavorOfO() {
        Character topLeft = this.matrix[0][0];
        Character topMiddle = this.matrix[0][1];
        Character topRight = this.matrix[0][2];
        Character middleLeft = this.matrix[1][0];
        Character middleMiddle = this.matrix[1][1];
        Character middleRight = this.matrix[1][2];
        Character bottomLeft = this.matrix[2][0];
        Character bottomMiddle = this.matrix[2][1];
        Character bottomRight = this.matrix[2][2];

        Character[] topRow = new Character[] {topLeft, topMiddle, topRight};
        Character[] middleRow = new Character[] {middleLeft, middleMiddle, middleRight};
        Character[] bottomRow = new Character[]{bottomLeft, bottomMiddle, bottomRight};
        Character[] leftColumn = new Character[] {topLeft, middleLeft, bottomLeft};
        Character[] middleColumn = new Character[] {middleLeft, middleMiddle, bottomMiddle};
        Character[] rightColumn = new Character[] {topRight, middleRight, bottomRight};
        Character[] leftDiagonal = new Character[] {topLeft, middleMiddle, bottomRight};
        Character[] rightDiagonal = new Character[] {topRight, middleMiddle, bottomLeft};

        if (hasSameElement('O', topRow)){
            return true;}

        if (hasSameElement('O', middleRow)){
            return true;}

        if (hasSameElement('O', bottomRow)){
            return true;}

        if (hasSameElement('O', leftColumn)){
            return true;}

        if (hasSameElement('O', middleColumn)){
            return true;}

        if (hasSameElement('O', rightColumn)){
            return true;}
        return false;

    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
          return null;
    }

    public Boolean hasSameElement(char item, Character[] row){
        for (Character character : row) {
            if (item != character)
                return false;
        }
            return true;
        }
    }

