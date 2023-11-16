package Pr_13;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter("Pr_13_1.txt", true);
            writer.write("\n" + text);
            writer.close();
            System.out.println("Успешно записано в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка!");
            e.printStackTrace();
        }
    }
}
