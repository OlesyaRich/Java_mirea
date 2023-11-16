package Pr_2;
import java.util.Arrays;
import java.util.Random;

public class Exercises {

    public void summ(int mass[]){
        int sum = 0;
        for(int i=0;i<10;i++) {
            sum += mass[i];
        }
        System.out.println("Сумма с помощью цикла for: " + sum + " ");

        int i = 0;
        sum = 0;
        while(i!= 10) {
            sum += mass[i];
            i++;
        }
        System.out.println("Сумма с помощью цикла while: " + sum + " ");

        i = 0;
        sum = 0;
        do{
            sum += mass[i];
            i++;
        }while(i!= 10);
        System.out.println("Сумма с помощью цикла do while: " + sum + " ");
    }

    public void garm(){
        float sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += (float) 1 /i;
            System.out.println("Число " + i + " гармонического ряда: " + sum);
        }
    }

    public void randMass(){
        int[] arr = new int[10];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    public int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
