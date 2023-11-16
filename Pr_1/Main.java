package Pr_1;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7); d2.setAge(7);
        System.out.println(d1);
        d1.intoHumanAge();
        System.out.println(d2);
        d2.setName("Rich");
        System.out.println(d2.getName());
        d2.intoHumanAge();
        System.out.println();

        Ball b1 = new Ball("Volleyball", 20);
        Ball b2 = new Ball("Football");
        System.out.println(b1);
        System.out.println(b2.getDiameter());
        System.out.println();

        Book book1 = new Book("Pushkin", "Eugeniy Onegin");
        Book book2 = new Book("Sobachie serdtse");
        Book book3 = new Book();
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
