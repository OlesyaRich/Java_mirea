package Pr_4;

public class HumanTest {
    public static void main(String[] args) {
        Human Mike = new Human(5, 2, 7, 1);
        System.out.println("Рук: " + Mike.getHands());
        System.out.println("Голов: " + Mike.getHead());

        Leg leg = new Leg(3);
        System.out.println("Пальцев: " + leg.getFingers());
        Head head = new Head(4,0,5,2);
        System.out.println("Глаз: " + head.getEyes());
        System.out.println("Ртов: " + head.getMouth());
        System.out.println("Ушей: " + head.getEars());
        System.out.println("Носов: " + head.getNose());
    }
}
