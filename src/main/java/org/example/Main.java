/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>(Arrays.asList(
                new Player("Boss"), new Player("Art")
        ));
        MGame mGame = new MGame(2, players);
        mGame.playGame();

        for (Player player : players) {
            System.out.println(player.getPiece().getLocation().getName());
        }

    }
}
