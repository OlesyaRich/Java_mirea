package Pr_9;

public class Planet implements Nameable {
    private String name;
    private double radius;

    public Planet(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }
}
