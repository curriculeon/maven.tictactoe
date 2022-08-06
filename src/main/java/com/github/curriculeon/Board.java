package com.github.curriculeon;

import java.nio.charset.CharacterCodingException;

/**
 * @author leon on 6/22/18.
 */
public class Board {


    private final Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;

    }

    public Boolean isInFavorOf(Character character) {

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
        Character[] middleColumn = new Character[] {topMiddle, middleMiddle, bottomMiddle};
        Character[] rightColumn = new Character[] {topRight, middleRight, bottomRight};
        Character[] leftDiagonal = new Character[] {topLeft, middleMiddle, bottomRight};
        Character[] rightDiagonal = new Character[] {topRight, middleMiddle, bottomLeft};

        if (hasSameElement(character, topRow)){
            return true;}

        if (hasSameElement(character, middleRow)){
            return true;}

        if (hasSameElement(character, bottomRow)){
            return true;}

        if (hasSameElement(character, leftColumn)){
            return true;}

        if (hasSameElement(character, middleColumn)){
            return true;}

        if (hasSameElement(character, rightColumn)){
            return true;}

        if (hasSameElement(character, leftDiagonal)){
            return true;}

        if (hasSameElement(character, rightDiagonal)){
            return true;}
        return false;
    }
    public Boolean isInFavorOfX() {
        return isInFavorOf('X');
    }

    public Boolean isInFavorOfO() {

        return isInFavorOf('O');
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

