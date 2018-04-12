package ai_project2;

import java.util.ArrayList;

public class Node {
    Node parent;
    Board board;
    int score;

    public Node(Node parent, Board currentBoard) {
        this.board = currentBoard;
        this.parent = parent;
        score = eval(currentBoard);
    }
    
    public int eval(Board board){
        int currentScore = heuristicA(board);
        currentScore += heuristicB(board);
        return currentScore;
    }
    
    public int heuristicA(Board board){
        return board.black.size()-board.white.size();
    }
    
    public int heuristicB(Board board){
        return board.numberOfKings(true)-board.numberOfKings(false);
    }
}