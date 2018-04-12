/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_project2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hp
 */
public class Board {

    Piece[][] board; // for printing
    ArrayList<Piece> white =new ArrayList<Piece>();
    ArrayList<Piece> black =new ArrayList<Piece>();;

    public Board() { //initial Board
        board = new Piece[8][8];
        //Fill the board with empty pieces
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Piece();
            }
        }

        //Black
        board[0][1] = new Piece(new Coordinate(0, 1), false, true);
        board[0][3] = new Piece(new Coordinate(0, 3), false, true);
        board[0][5] = new Piece(new Coordinate(0, 5), false, true);
        board[0][7] = new Piece(new Coordinate(0, 7), false, true);

        board[1][0] = new Piece(new Coordinate(1, 0), false, true);
        board[1][2] = new Piece(new Coordinate(1, 2), false, true);
        board[1][4] = new Piece(new Coordinate(1, 4), false, true);
        board[1][6] = new Piece(new Coordinate(1, 6), false, true);

        board[2][1] = new Piece(new Coordinate(2, 1), false, true);
        board[2][3] = new Piece(new Coordinate(2, 3), false, true);
        board[2][5] = new Piece(new Coordinate(2, 5), false, true);
        board[2][7] = new Piece(new Coordinate(2, 7), false, true);

        //WHITE
        board[7][0] = new Piece(new Coordinate(7, 0), false, false);
        board[7][2] = new Piece(new Coordinate(7, 2), false, false);
        board[7][4] = new Piece(new Coordinate(7, 4), false, false);
        board[7][6] = new Piece(new Coordinate(7, 6), false, false);

        board[6][1] = new Piece(new Coordinate(6, 1), false, false);
        board[6][3] = new Piece(new Coordinate(6, 3), false, false);
        board[6][5] = new Piece(new Coordinate(6, 5), false, false);
        board[6][7] = new Piece(new Coordinate(6, 7), false, false);

        board[5][0] = new Piece(new Coordinate(5, 0), false, false);
        board[5][2] = new Piece(new Coordinate(5, 2), false, false);
        board[5][4] = new Piece(new Coordinate(5, 4), false, false);
        board[5][6] = new Piece(new Coordinate(5, 6), false, false);

        //Filling white and black lists from the board
        fillPlayerListsFromBoard();
        
        //System.out.println(white.toString()+"\n"+black.toString());
    }
       
    public void fillPlayerListsFromBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                Piece tmp = board[i][j];
                if (!tmp.isEmpty) {
                    if (tmp.color) {
                        black.add(tmp);
                    } else {
                        white.add(tmp);
                    }
                }
            }
        }
    }

    public String toString() {
        String str = Arrays.deepToString(board);

        return str.replace("[[", "").replace("], ", "\n").replace("]]", " ").replace("[", "").replace(", ", "|");
    }
}
