package Pr_6.Ex_2;

class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Bulldog " + getName() + " is barking.");
    }
}
