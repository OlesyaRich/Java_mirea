package Pr_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame implements ActionListener {
    private JButton milanButton, madridButton;
    private JLabel resultLabel, lastScorerLabel, winnerLabel;
    private int milanScore, madridScore;

    public FootballMatch() {
        milanScore = 0;
        madridScore = 0;

        setTitle("Football Match: Milan vs Madrid");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.setBackground(new Color(255, 218, 185));

        milanButton = new JButton("AC Milan");
        milanButton.setBackground(new Color(255, 215, 0));
        milanButton.addActionListener(this);
        panel.add(milanButton);

        madridButton = new JButton("Real Madrid");
        madridButton.setBackground(new Color(255, 99, 71));
        madridButton.addActionListener(this);
        panel.add(madridButton);

        resultLabel = new JLabel("Result: " + milanScore + " X " + madridScore, SwingConstants.CENTER);
        panel.add(resultLabel);

        lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        panel.add(lastScorerLabel);

        winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);
        panel.setSize(400,200);
        panel.add(winnerLabel);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == milanButton) {
            milanScore++;
            resultLabel.setText("Result: " + milanScore + " X " + madridScore);
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else if (e.getSource() == madridButton) {
            madridScore++;
            resultLabel.setText("Result: " + milanScore + " X " + madridScore);
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        FootballMatch match = new FootballMatch();
        match.setVisible(true);
    }
}
