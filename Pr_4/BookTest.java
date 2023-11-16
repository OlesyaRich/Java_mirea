package Pr_4;

public class BookTest {
    public static void main(String[] args) {
        Book a = new Book("А.С.Пушкин", "Сказка о рыбаке и рыбке", 1833);
        System.out.println("Автор: " + a.getAuthor());
        System.out.println("Название: " + a.getName());
        System.out.println("Год: " + a.getYear());
    }
}
