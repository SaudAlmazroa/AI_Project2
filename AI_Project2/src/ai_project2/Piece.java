package ai_project2;

import java.util.ArrayList;

public class Piece {

    Coordinate coordinate; //row, column
    boolean isKing;
    boolean color; //false is white, true is black
    boolean isEmpty = false;

    public Piece() {
        coordinate = new Coordinate(-1, -1);
        isKing = false;
        color = false;
        isEmpty = true;
    }

    public Piece(Coordinate coordinate, boolean isKing, boolean color) {
        this.coordinate = coordinate;
        this.isKing = isKing;
        this.color = color;

    }

    public ArrayList<Move> getMoves() {
        return null;
    }
    
    
    public String toString() {
        String str = "";

        if (isEmpty) {
            return str+=" ";
        }

        if (color) {
            str = str.concat("B");

        } else {
            str = str.concat("W");
        }
        if (isKing) {
            str = str.concat("K");
        }

        return str;
    }
}
