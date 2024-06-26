/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("=====================================================================================");
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Ready to Play? Who will you be today?");
            ArrayList<Player> players = new ArrayList<>();
            boolean notDone = true;
            int n = 1;
            while (notDone) {
                System.out.print("Player " + n + "'s name (leave it blank to get start): ");
                String name = scanner.nextLine();
                if (name.isBlank()) {break;}
                players.add(new Player(name));
                n++;
            }

            System.out.print("How many rounds are we feelin' today?: ");
            int round = scanner.nextInt();
            MGame mGame = null;
            try {
                mGame  = new MGame(round, players);
                mGame.playGame();
                break;
            } catch (RuntimeException e) {
                System.err.println("Game is restarting..");
            }
        }

    }
}
