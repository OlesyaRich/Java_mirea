package Pr_13;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String Text = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter("Pr_13_1.txt");
            writer.write(Text);
            writer.close();
            System.out.println("Успешно записано в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка!");
            e.printStackTrace();
        }
    }
}