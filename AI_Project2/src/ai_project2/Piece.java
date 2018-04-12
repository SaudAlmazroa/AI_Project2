package ai_project2;

import java.util.ArrayList;

public class Piece {
    Coordinate coordinate; //x, y
    boolean isKing;
    boolean color; //0 is white, 1 is black

    public Piece(Coordinate coordinate, boolean isKing, boolean color) {
        this.coordinate = coordinate;
        this.isKing = isKing;
        this.color = color;
    }    
    
    
    public ArrayList<Move> getMoves(){
        
    }
}