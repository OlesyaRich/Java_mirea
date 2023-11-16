package Pr_16;
import java.util.Scanner;


public class Exeption1{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }

        //Задание 3
        /*catch ( Exception e ) {
            System.out.println("Exception!");
        }*/

        //Задание 2
        catch ( NumberFormatException a ) {
            System.out.println("Not integer!");
        }
        catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
        finally { //Задание 4
            System.out.println("End of program");
        }
    }
}
