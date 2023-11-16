package Pr_19;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Картофель\n" +
                "Морковь\n" +
                "Лук\n" +
                "Чеснок\n" +
                "Петрушка\n" +
                "Укроп\n" +
                "Яблоки/бананы\n" +
                "Лимон\n" +
                "Масло сливочное\n" +
                "Кефир\n" +
                "Сметана\n" +
                "Творог\n" +
                "Сыр";
        try {
            String path = "Pr_19_4.txt";
            FileWriter writer = new FileWriter(path);
            writer.write(text);
            writer.close();
            Ex_4 testCatalog = new Ex_4();
            testCatalog.Catalog(path);
        } catch (IOException e) {
            System.out.println("Ошибка!");
            e.printStackTrace();
        }
    }
}
