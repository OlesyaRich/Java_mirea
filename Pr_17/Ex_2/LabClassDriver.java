package Pr_17.Ex_2;
import java.util.Scanner;
public class LabClassDriver {
    private static Scanner scanner = new Scanner(System.in);
    private static LabClass labClass = new LabClass();

    public static void main(String[] args) {
        LabClassUI ui = new LabClassUI();
        boolean exit = false;
        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("01. Print students");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Sort students by average grade");
            System.out.println("4. Search for a student by name");
            System.out.println("5. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    ui.printStudents();
                    break;
                case 1:
                    ui.addStudent();
                    break;
                case 2:
                    ui.removeStudent();
                    break;
                case 3:
                    ui.sortStudents();
                    break;
                case 4:
                    ui.searchStudent();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }


}