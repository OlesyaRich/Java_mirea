package Pr_6.Ex_3;

public class Sofa extends Furniture {
    private int seatsCount;

    public Sofa(String name, int price, int seatsCount) {
        super(name, price);
        this.seatsCount = seatsCount;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    @Override
    public void info() {
        System.out.println("Sofa: " + getName() + ", price: " + getPrice() + ", seats count: " + seatsCount);
    }
}
