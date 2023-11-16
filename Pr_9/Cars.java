package Pr_9;

public class Cars implements Nameable {
    private String brand;
    private int year;

    public Cars(String name, int year) {
        this.brand = name;
        this.year = year;
    }

    public String getName() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}