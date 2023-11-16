package Pr_5.Ex_4_5;

public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public String toString(){
        return "x: " + this.x + ", y: " + this.y + ", xSpeed:" + this.xSpeed + ", ySpeed:" + this.ySpeed;
    }
    public void moveUp(){};
    public void moveDown(){};
    public void moveLeft(){};
    public void moveRight(){};
}
