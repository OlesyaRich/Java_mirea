package Pr_17.Ex_2;

public class Student {
    private String name;
    private double averageGrade;

    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }
    public String getName() {
        return name;
    }
    public double getAverageGrade() {
        return averageGrade;
    }
    @Override
    public String toString() {
        return name + " (" + averageGrade + ")";
    }

}
