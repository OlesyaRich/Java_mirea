package Pr_12;
import java.util.LinkedList;
import java.util.Queue;

public class DrunkardGame_Queue {
    public static void main(String[] args) {
        Queue<Integer> player1 = new LinkedList<>();
        Queue<Integer> player2 = new LinkedList<>();

        // Карты игроков (верхняя - первая)
        int[] deck1 = {1, 3, 5, 7, 9};
        int[] deck2 = {2, 4, 6, 8, 0};
        for (int i = 0; i < 5; i++) {
            player1.offer(deck1[i]);
            player2.offer(deck2[i]);
        }

        //System.out.println(player1 + "\n" + player2 + "\n");

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int card1 = player1.poll();
            int card2 = player2.poll();
            if ((card1 > card2 || (card1 == 0 && card2 == 9)) && (card1 != 9 || card2 != 0) ) {
                player1.offer(card1);
                player1.offer(card2);
            } else {
                player2.offer(card1);
                player2.offer(card2);
            }
            moves++;

            //System.out.println(card1 + " " + card2);
            //System.out.println(player1 + "\n" + player2 + "\n");
            //System.out.println("Press Any Key To Continue...");
            //new java.util.Scanner(System.in).nextLine();
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
