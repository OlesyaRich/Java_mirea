package Pr_6.Ex_3;

public class Chair extends Furniture {
    private int legsCount;

    public Chair(String name, int price, int legsCount) {
        super(name, price);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public void info() {
        System.out.println("Chair: " + getName() + ", price: " + getPrice() + ", legs count: " + legsCount);
    }
}
