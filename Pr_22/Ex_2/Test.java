package Pr_22.Ex_2;

public class Test {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();

        Chair victorianChair = factory.createVictorianChair(121);
        System.out.println(((VictorianChair)victorianChair).getAge());

        Chair magicChair = factory.createMagicChair();
        ((MagicChair)magicChair).doMagic();

        Chair functionalChair = factory.createFunctionalChair();
        System.out.println(((FunctionalChair)functionalChair).sum(12,5));

        Client client = new Client();
        client.setChair(magicChair);
        client.sit();
    }
}
