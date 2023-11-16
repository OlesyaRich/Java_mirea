package Pr_1;

public class Book {
    private String author;
    private String name;
    public Book(String a, String n){
        name = n;
        author = a;
    }
    public Book(String n){
        author = "None";
        name = n;
    }
    public Book(){
        author = "None";
        name = "None";
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public String toString(){
        return this.author+", "+this.name;
    }
}
