package Pr_8;

import javax.swing.*;
import java.awt.*;

public class ImageDisplay extends JFrame {
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;

    public ImageDisplay(String imagePath) {
        setTitle("Image Display");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);

        JPanel panel = new JPanel();
        panel.add(imageLabel);

        add(panel);
    }

    public static void main(String[] args) {
        ImageDisplay display = new ImageDisplay("C:/Users/Lesya/Downloads/Syoma.jpg");
        display.setVisible(true);
    }
}
