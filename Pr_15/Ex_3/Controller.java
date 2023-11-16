package Pr_15.Ex_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.addSquareListener(new SquareListener());
    }

    class SquareListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int value = view.getValue();
            model.setValue(value);
            int result = model.getValue() * model.getValue();
            view.setResult(result);
        }
    }
}