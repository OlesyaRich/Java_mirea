package Pr_12;
import java.util.*;

public class DrunkardGame_DoubleList {
    public static void main(String[] args) {
        DoubleList player1 = new DoubleList();
        DoubleList player2 = new DoubleList();

        // Карты игроков (верхняя - первая)
        int[] deck1 = {1, 3, 5, 7, 9};
        int[] deck2 = {2, 4, 6, 8, 0};
        for (int i = 0; i < 5; i++) {
            player1.addFirst(deck1[i]);
            player2.addFirst(deck2[i]);
        }

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int card1 = player1.removeLast();
            int card2 = player2.removeLast();
            if ((card1 > card2 || (card1 == 0 && card2 == 9)) && (card1 != 9 || card2 != 0) ) {
                player1.addFirst(card1);
                player1.addFirst(card2);
            } else {
                player2.addFirst(card1);
                player2.addFirst(card2);
            }
            moves++;
        }

        if (moves == 106) {
            System.out.println("botva");
        } else if (player2.isEmpty()) {
            System.out.println("first " + moves);
        } else {
            System.out.println("second " + moves);
        }
    }
}
