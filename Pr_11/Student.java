package Pr_11;

public class Student {
    public String name;
    public String surname;
    public int number;

    public Student(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public int getIDNumber(){
        return number;
    }
    public String toString(){
        return "\nID: " + this.number + " Name: " + this.name + " " + this.surname;
    }
}
