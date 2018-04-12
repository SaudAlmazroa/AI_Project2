package ai_project2;

import java.util.ArrayList;

public class Node {
    Node parent;
    Board board;
    int score;

    public Node(Node parent, Board currentBoard) {
        this.board = currentBoard;
        this.parent = parent;
        score = 0;
    }
    
}