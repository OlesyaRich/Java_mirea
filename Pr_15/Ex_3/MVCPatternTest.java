package Pr_15.Ex_3;

public class MVCPatternTest {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        view.setVisible(true);
    }
}
