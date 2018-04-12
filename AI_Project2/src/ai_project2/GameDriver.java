/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_project2;

/**
 *
 * @author hp
 */
public class GameDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Board board = new Board();
        System.out.println(board);
        System.out.println(new Piece(new Coordinate(0, 1), false, true));
    }
    
}
