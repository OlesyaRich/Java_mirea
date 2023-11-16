package Pr_6.Ex_1;

class Cup extends Dish {
    private int volume;

    public Cup(String material, String color, int volume) {
        super(material, color);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void use() {
        System.out.println("Using a cup to drink a beverage.");
    }
}
