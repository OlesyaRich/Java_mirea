package Pr_17.Ex_2;
import java.util.Scanner;

public class LabClassUI {
    private static Scanner scanner = new Scanner(System.in);
    private static LabClass labClass = new LabClass();

    public static void addStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student average grade:");
        double averageGrade = scanner.nextDouble();
        scanner.nextLine();
        Student student = new Student(name, averageGrade);
        labClass.addStudent(student);
        System.out.println("Student added successfully");
    }

    public static void removeStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        try {
            labClass.removeStudent(name);
            System.out.println("Student removed successfully");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sortStudents() {
        labClass.sortStudentsByAverageGrade();
        System.out.println("Students sorted by average grade");
        for (Student student : labClass.getStudents()) {
            System.out.println(student);
        }
    }

    public static void searchStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        try {
            Student student = labClass.findStudentByName(name);
            System.out.println(student);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printStudents() {
        System.out.println(labClass.getStudents());
    }
}