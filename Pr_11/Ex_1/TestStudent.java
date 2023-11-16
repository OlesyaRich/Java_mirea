package Pr_11.Ex_1;
import Pr_11.Student;
import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student("John", "Doe", 789),
                new Student("Jane", "Doe", 123),
                new Student("Bob", "Smith", 456)
        };

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(students));

        insertionSort(students);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(students));
    }

    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getIDNumber() > key.getIDNumber()) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
