/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board(ArrayList<Square> squares) {
        this.squares = squares;
    }

    public Square getSquare(Square oldLoc, int fvTol) {
        Square nextLoc = null;
        for (int i = 0; i < squares.size(); i++) {
            if (oldLoc.equals(squares.get(i))) {
                nextLoc = squares.get( (i+fvTol) % squares.size());
            }
        }
        return nextLoc;
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }
}
