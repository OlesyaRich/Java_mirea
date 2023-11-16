package Pr_5.Ex_2_3;

public class Square extends Rectangle {
    public Square(){
        this.filled = false;
        this.color = "blue";
        width = 1;
        length = 1;
    }
    public Square(double side){
        this.filled = false;
        this.color = "blue";
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width; }
    public void setSide(double side) {
        this.width = side; }
    public void setWidth(double width) {
        this.width = width; }
    public void setLength(double length) {
        this.length = length; }
    public String toString() {
        return "Shape: square, side: "+this.width+", color: "+this.color;
    }
}
