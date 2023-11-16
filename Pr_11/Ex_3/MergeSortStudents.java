package Pr_11.Ex_3;
import Pr_11.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortStudents {
    public static void main(String[] args) {
        Student[] students1 = {
                new Student("John", "Doe", 123),
                new Student("Jane", "Doe", 456),
                new Student("Bob", "Smith", 789)
        };

        Student[] students2 = {
                new Student("Alice", "Jones", 246),
                new Student("Tom", "Brown", 579),
                new Student("Sue", "Lee", 802)
        };

        System.out.println("Before merging:");
        System.out.println(Arrays.toString(students1));
        System.out.println(Arrays.toString(students2));

        Student[] mergedStudents = merge(students1, students2);

        System.out.println("After merging:");
        System.out.println(Arrays.toString(mergedStudents));
    }

    public static Student[] merge(Student[] arr1, Student[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i = 0, j = 0, k = 0;
        Student[] mergedArr = new Student[len1 + len2];
        while (i < len1 && j < len2) {
            if (arr1[i].getIDNumber() < arr2[j].getIDNumber()) {
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < len1) {
            mergedArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < len2) {
            mergedArr[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArr;
    }
}