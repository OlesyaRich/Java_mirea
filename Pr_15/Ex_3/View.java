package Pr_15.Ex_3;
import javax.swing.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public View() {
        textField = new JTextField(10);
        button = new JButton("Square");
        label = new JLabel("Result: ");

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        panel.add(label);

        this.setContentPane(panel);
        this.pack();
        this.setTitle("MVC Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int getValue() {
        return Integer.parseInt(textField.getText());
    }

    public void setResult(int result) {
        label.setText("Result: " + result);
    }

    public void addSquareListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}