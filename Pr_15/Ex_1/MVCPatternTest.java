package Pr_15.Ex_1;

public class MVCPatternTest {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("John");
        controller.setStudentRollNo("005");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("001");
        return student;
    }
}
