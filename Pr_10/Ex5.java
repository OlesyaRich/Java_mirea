package Pr_10;

import java.util.Scanner;

public class Ex5 {
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = input.nextInt();

        System.out.print(sumDigits(a));
    }
}
