package Pr_9;

public class PriceableTest {
    public static void main(String[] args){
        Car bmw = new Car("BMW", "X5", 50000);
        System.out.println(bmw.getPrice());
        Priceable opel = new Car("Opel", "Zafira", 95000);
        System.out.println(opel.getPrice());
    }
}
