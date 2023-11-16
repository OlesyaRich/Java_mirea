package Pr_6.Ex_1;

class Plate extends Dish {
    private int diameter;

    public Plate(String material, String color, int diameter) {
        super(material, color);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void use() {
        System.out.println("Using a plate to eat food.");
    }
}
