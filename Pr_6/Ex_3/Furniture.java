package Pr_6.Ex_3;

public abstract class Furniture {
    private String name;
    private int price;

    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public abstract void info();
}
