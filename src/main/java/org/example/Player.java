/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

import java.util.ArrayList;

public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private ArrayList<Die> dies;

    public Player(String name) {
        this.name = name;
    }

    public int takeTurn() {
        int fvt = 0;
        for (Die die : dies) {
            die.roll();
            fvt += die.getFaceValue();
        }
        return fvt;
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public Board getBoard() {
        return board;
    }

    public ArrayList<Die> getDies() {
        return dies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setDies(ArrayList<Die> dies) {
        this.dies = dies;
    }
}
