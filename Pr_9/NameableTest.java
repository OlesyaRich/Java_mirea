package Pr_9;

public class NameableTest {
    public static void main(String[] args){
        Nameable earth = new Planet("Earth", 6371);
        System.out.println(earth.getName());
        Nameable car = new Cars("Opel", 2001);
        System.out.println(car.getName());
    }
}
