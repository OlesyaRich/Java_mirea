package Pr_6.Ex_2;

class LabradorRetriever extends Dog {
    public LabradorRetriever(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Labrador Retriever " + getName() + " is barking.");
    }
}
