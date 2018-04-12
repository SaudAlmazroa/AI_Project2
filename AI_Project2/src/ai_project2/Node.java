package ai_project2;

import java.util.ArrayList;

public class Node {
    Node parent;
    Board nodeBoard;
    int score;

    public Node(Board currentBoard) {
        this.nodeBoard = currentBoard;
        parent = null;
        score = eval(currentBoard);
    }
    
    public Node(Node parent, Board currentBoard) {
        this.nodeBoard = currentBoard;
        this.parent = parent;
        score = eval(currentBoard);
    }
    
    public int eval(Board nodeBoard){
        int currentScore = heuristicA(nodeBoard);
        
        return currentScore;
    }
    
    public int heuristicA(Board nodeBoard){
        return nodeBoard.black.size()-nodeBoard.white.size();
    }
    
    public int heuristicB(Board nodeBoard){
        
    }
}