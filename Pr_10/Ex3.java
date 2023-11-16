package Pr_10;
import java.util.Scanner;

public class Ex3 {
    public static void recursion(int a, int b) {
        if (a == b) {
            System.out.print(a);
            return;
        }
        if (a < b) {
            System.out.print(a + " ");
            recursion(a+1, b);
        } else {
            System.out.print(a + " ");
            recursion(a-1, b);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        int a = input.nextInt();
        int b = input.nextInt();

        recursion(a, b);
    }
}
