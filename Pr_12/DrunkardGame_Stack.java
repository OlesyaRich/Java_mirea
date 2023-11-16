package Pr_12;

import java.util.Stack;

public class DrunkardGame_Stack {
    public static void main(String[] args) {
        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();

        // Карты игроков (верхняя - первая)
        int[] deck1 = {1, 3, 5, 7, 9};
        int[] deck2 = {2, 4, 6, 8, 0};
        for (int i = 0; i < 5; i++) {
            player1.push(deck1[i]);
            player2.push(deck2[i]);
        }

        //System.out.println(player1 + "\n" + player2 + "\n");

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int card1 = player1.remove(0);
            int card2 = player2.remove(0);
            if ((card1 > card2 || (card1 == 0 && card2 == 9)) && (card1 != 9 || card2 != 0) ) {
                player1.push(card1);
                player1.push(card2);
            } else {
                player2.push(card1);
                player2.push(card2);
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
