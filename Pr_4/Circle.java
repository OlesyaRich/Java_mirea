package Pr_4;

public class Circle {
    protected double radius;
    protected double diameter;
    protected double square;
    protected double perimeter;
    public Circle(double radius){
        this.radius = radius;
        this.diameter = 2*radius;
    }

    public double getRadius() {
        return radius; }
    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = 2*radius;}

    public double getDiameter() {
        return diameter; }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
        this.radius = diameter/2;}

    public double getSquare() {
        square = 3.1415926535 * radius * radius;
        return square; }
    public double getPerimeter() {
        perimeter = 2 * 3.1415926535 * radius;
        return perimeter; }
}
