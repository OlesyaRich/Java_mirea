package Pr_6.Ex_1;

public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Ceramic", "White", 20);
        System.out.println("Material: " + plate.getMaterial());
        System.out.println("Color: " + plate.getColor());
        System.out.println("Diameter: " + plate.getDiameter());
        plate.use();

        Cup cup = new Cup("Glass", "Clear", 250);
        System.out.println("Material: " + cup.getMaterial());
        System.out.println("Color: " + cup.getColor());
        System.out.println("Volume: " + cup.getVolume());
        cup.use();
    }
}
