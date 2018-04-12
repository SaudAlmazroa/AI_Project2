package ai_project2;

public class Algorithm {
    
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
    
    public Move userNextMove(Board board){
        for(Piece p: board.white){
            
        }
    }
}