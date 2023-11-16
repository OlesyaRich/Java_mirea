package Pr_12;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DrunkardGame_Interactive {
    public static void main(String[] args) {
        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();

        // Карты игроков (верхняя - первая)
        int[] deck1 = {1, 3, 5, 7, 9};
        int[] deck2 = {2, 4, 6, 8, 0};
        for (int i = 0; i < 5; i++) {
            player1.offerLast(deck1[i]);
            player2.offerLast(deck2[i]);
        }

        System.out.println("Карты 1 игрока: " + player1 + "\nКарты 2 игрока: " + player2 + "\n");

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            Scanner input = new Scanner(System.in);
            boolean c1= false, c2 = false;
            int card1 = -1;
            int card2 = -1;

            while (!c1) {
                System.out.println("Выбор карты 1 игроком: ");
                card1 = input.nextInt();
                if (player1.removeFirstOccurrence(card1)) {
                    c1 = true;
                } else System.out.println("Такой карты у вас нет! Повторите выбор. \n");
            }
            while (!c2) {
                System.out.println("Выбор карты 2 игроком: ");
                card2 = input.nextInt();
                if (player2.removeFirstOccurrence(card2)) {
                    c2 = true;
                } else System.out.println("Такой карты у вас нет! Повторите выбор. \n");
            }

            if ((card1 > card2 || (card1 == 0 && card2 == 9)) && (card1 != 9 || card2 != 0) ) {
                player1.offerLast(card1);
                player1.offerLast(card2);
            } else {
                player2.offerLast(card1);
                player2.offerLast(card2);
            }
            moves++;

            System.out.println("Карты 1 игрока: " + player1 + "\nКарты 2 игрока: " + player2 + "\n");
        }

        if (moves == 106) {
            System.out.println("Ничья!");
        } else if (player2.isEmpty()) {
            System.out.println("Первый игрок победил! Сделано ходов: " + moves);
        } else {
            System.out.println("Второй игрок победил! Сделано ходов: " + moves);
        }
    }
}
