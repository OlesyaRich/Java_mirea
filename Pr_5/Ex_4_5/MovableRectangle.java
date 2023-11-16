package Pr_5.Ex_4_5;

public class MovableRectangle extends MovablePoint{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        //this.x = x;
        //this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "x: " + this.x + ", y: " + this.y + ", xSpeed:" + this.xSpeed + ", ySpeed:" + this.ySpeed;
    }
    public void moveUp(){};
    public void moveDown(){};
    public void moveLeft(){};
    public void moveRight(){};
}
