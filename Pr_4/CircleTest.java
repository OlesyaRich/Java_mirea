package Pr_4;

public class CircleTest {
    public static void main(String[] args) {
        Circle a = new Circle(5);
        System.out.println("Диаметр: " + a.getDiameter());
        System.out.println("Периметр: " + a.getPerimeter());
        System.out.println("Площадь: " + a.getSquare());

        a.setDiameter(50.0);
        System.out.println("Радиус: " + a.getRadius());
        System.out.println("Периметр: " + a.getPerimeter());
        System.out.println("Площадь: " + a.getSquare());
    }
}
