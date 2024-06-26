/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class MGame {
    private int roundCount;
    private int round;
    private ArrayList<Player> players;
    private Board board;
    private ArrayList<Die> dies;

    public MGame(int n, ArrayList<Player> players) {
        if (players.size() < 2 || players.size() > 8) {
            System.err.println("Player should be 2-8 players.");
            throw new RuntimeException();
        }

        this.roundCount = 0;
        this.round = n;
        this.players = players;
        this.board = createBoard(40);
        this.dies = new ArrayList<>(Arrays.asList(new Die(), new Die()));
    }

    private Board createBoard(int pad) {
        ArrayList<Square> squares = new ArrayList<>();
        for (int i = 0; i < pad; i++) {
            squares.add(new Square("Square:" + i));
        }
        return new Board(squares);
    }

    public void playGame() {
        for (Player player : players) {
            Piece piece = new Piece(board.getSquares().get(0));
            player.setBoard(board);
            player.setDies(dies);
            player.setPiece(piece);
        }
        System.out.println("=====================================================================================");
        System.out.println("Game Start!");

        for (; roundCount < round; roundCount++) {
            System.out.println("=====================================================================================");
            System.out.println("*****************************");
            System.out.println("Round " + (roundCount+1) + "!");
            System.out.println("*****************************");
            playRound();
        }
        System.out.println("=====================================================================================");
    }

    private void playRound() {
        for (Player player : players) {
            System.out.println("#" + player.getName()+"'s turn.");
            int fvTot = player.takeTurn();
            Square oldLoc = player.getPiece().getLocation();
            Square newLoc = player.getBoard().getSquare(oldLoc, fvTot);
            player.getPiece().setLocation(newLoc);
            System.out.println("    Location: " + oldLoc.getName() + ".");
            System.out.println("    Rolling...");
            System.out.println("    Advance " + fvTot + " moves!.");
            System.out.println("    Location: " + newLoc.getName() + ".");
        }
    }
}
