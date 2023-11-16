package Pr_11.Ex_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA> {
    private String name;
    private int id;
    private double gpa;

    public SortingStudentsByGPA(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(SortingStudentsByGPA o) {
        if (this.gpa < o.gpa) {
            return 1;
        } else if (this.gpa > o.gpa) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<SortingStudentsByGPA> students = new ArrayList<>();
        students.add(new SortingStudentsByGPA("John", 1, 3.5));
        students.add(new SortingStudentsByGPA("Mary", 2, 3.2));
        students.add(new SortingStudentsByGPA("Bob", 3, 3.8));
        students.add(new SortingStudentsByGPA("Alice", 4, 3.7));

        System.out.println("Before sorting:");
        for (SortingStudentsByGPA student : students) {
            System.out.println(student.getName() + " " + student.getGpa());
        }

        Collections.sort(students);

        System.out.println("\nAfter sorting:");
        for (SortingStudentsByGPA student : students) {
            System.out.println(student.getName() + " " + student.getGpa());
        }
    }
}