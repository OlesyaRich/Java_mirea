package Pr_15.Ex_2;

public class MVCPatternTest {
    public static void main(String[] args) {
        Employee model = new Employee();
        model.setName("John");
        model.setSalary(50000);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Jane");
        controller.setEmployeeSalary(60000);

        controller.updateView();
    }
}
