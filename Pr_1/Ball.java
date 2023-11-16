package Pr_1;

public class Ball {
    private String type;
    private int diameter;
    public Ball(String n, int a){
        type = n;
        diameter = a;
    }
    public Ball(String n){
        type = n;
        diameter = 0;
    }
    public Ball(){
        type = "None";
        diameter = 0;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public int getDiameter() {
        return diameter;
    }
    public String toString(){
        return this.type+", diameter "+this.diameter;
    }
}
