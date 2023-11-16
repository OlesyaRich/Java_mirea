package Pr_5.Ex_2_3;

public abstract class Shape {
    protected boolean filled;
    protected String color;

    public Shape(){};
    public Shape(String color, boolean filled){};

    public String getColor(){
        return this.color;
    };
    public void setColor(String color){
        this.color = color;
    };
    public boolean isFilled(){
        return this.filled;
    };
    public void setFilled(boolean filled){
        this.filled = filled;
    };

    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}
