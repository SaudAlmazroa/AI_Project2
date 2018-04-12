package ai_project2;

import java.util.Objects;

public class Move {
    private Piece piece;
    private Coordinate nextMove;
    private Boolean canAttack;
    private Boolean canBecomeKing;

    public Move(Piece piece, Coordinate nextMove, Boolean canAttack, Boolean canBecomeKing) {
        this.piece = piece;
        this.nextMove = nextMove;
        this.canAttack = canAttack;
        this.canBecomeKing = canBecomeKing;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.piece);
        hash = 47 * hash + Objects.hashCode(this.nextMove);
        hash = 47 * hash + Objects.hashCode(this.canAttack);
        hash = 47 * hash + Objects.hashCode(this.canBecomeKing);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Move other = (Move) obj;
        if (!Objects.equals(this.piece, other.piece)) {
            return false;
        }
        if (!Objects.equals(this.nextMove, other.nextMove)) {
            return false;
        }
        if (!Objects.equals(this.canAttack, other.canAttack)) {
            return false;
        }
        if (!Objects.equals(this.canBecomeKing, other.canBecomeKing)) {
            return false;
        }
        return true;
    }

    public Piece getPiece() {
        return piece;
    }

    public Coordinate getNextMove() {
        return nextMove;
    }

    public Boolean getCanAttack() {
        return canAttack;
    }

    public Boolean getCanBecomeKing() {
        return canBecomeKing;
    }

    
    public final String toString() {
        return piece + " to " + getNextMove();

    }
}
