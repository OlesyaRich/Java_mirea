package Pr_6.Ex_2;

public class DogTest {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog("Max", 3);
        System.out.println("Name: " + bulldog.getName());
        System.out.println("Age: " + bulldog.getAge());
        bulldog.bark();

        LabradorRetriever labradorRetriever = new LabradorRetriever("Buddy", 5);
        System.out.println("Name: " + labradorRetriever.getName());
        System.out.println("Age: " + labradorRetriever.getAge());
        labradorRetriever.bark();
    }
}
