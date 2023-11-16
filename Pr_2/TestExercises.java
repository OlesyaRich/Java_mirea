package Pr_2;

public class TestExercises {
    public static void main(String[] args) {
        int[]mass = new int[]{1,2,3,4,5,6,7,8,9,10};
        Exercises a = new Exercises();

        a.summ(mass);
        System.out.println("Аргументы: ");
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        a.garm();
        a.randMass();
        System.out.println("Факториал числа 5: " + a.factorial(5));
    }
}
