package Pr_8;
import java.awt.*;

public class Square extends Shape{
    public Square(Color color, int x, int y, int width){
        this.setColor(color);
        this.setX(x);
        this.setY(y);
        this.setWidth(width);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getWidth());
    }
}
