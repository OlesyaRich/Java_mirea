package Pr_8;
import java.awt.*;

public class Circle extends Shape{
    public Circle(Color color, int x, int y, int width, int height){
        this.setColor(color);
        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }
}
