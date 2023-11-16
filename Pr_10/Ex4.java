package Pr_10;
import java.util.Scanner;

public class Ex4 {
    public static int countNumbers(int len, int sum, int k, int s) {
        if(len == k) {
            if (sum == s) return 1;
            else return 0;
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for(int i = c; i < 10; i++) {
            res += countNumbers(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        int k = input.nextInt();
        int s = input.nextInt();

        System.out.print(countNumbers(0,0, k, s));
    }
}
