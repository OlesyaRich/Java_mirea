package Pr_16;
import java.util.Scanner;

//Задание 5
/*public class ThrowsDemo {
    public static void getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.print("Your key is " + (Integer.parseInt(key) * 514542 / 13216) % 1000);
        }
        catch ( NullPointerException e ) {
            System.out.println("Your key is null");
        }
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        String key = null;
        // String key = myScanner.next();
        getDetails(key);
    }
}*/

//Задание 6
/*public class ThrowsDemo {
    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch ( Exception a ) {
            System.out.println("Exception!");
        }
    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter something ");
        String key = myScanner.next();
        printMessage(key);
    }
}*/

//Задание 7
/*public class ThrowsDemo {
    public static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public static void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch (Exception e){
            throw e;
        }
    }
    private static String getDetails(String key) {
        if (key == "") {
            try {
                throw new Exception("key set to empty string");
            } catch (Exception e) {
                System.out.println(e + " catched");
            }
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        getKey();
    }
}*/

//Задание 8
/*public class ThrowsDemo {
    public static void getKey() {
        while (true) {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                continue;
            }
        }
    }
    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }
    private static String getDetails(String key) throws Exception {
        if (key.compareTo("") == 0) {
            throw new Exception("key set to empty string");
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        getKey();
    }
}*/