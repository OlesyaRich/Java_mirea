package Pr_18.Ex_45;

public class TestClass {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        integers[0] = 39; integers[1] = 17; integers[2] = 71; integers[3] = 42; integers[4] = 53;
        integers[5] = 45; integers[6] = 50; integers[7] = 148; integers[8] = 63; integers[9] = 42;
        Double od = 43.7;
        MinMax<Integer> minmax = new MinMax<>(integers);
        System.out.println(minmax.findMin());
        System.out.println(minmax.findMax());
        System.out.println(Calculator.multiply(56.3,48.9));
        Number[][] matrix01 = new Integer[2][2];
        Number[][] matrix02 = new Double[2][2];
        Number[][] matrix00 = new Double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix01[i][j] = integers[i*2+j];
                matrix02[i][j] = od;
                matrix00[i][j] = 0.0;
            }
        }
        Matrix matrix1 = new Matrix(matrix01);
        Matrix matrix2 = new Matrix(matrix02);
        Matrix matrix0 = new Matrix(matrix00);
        System.out.println();
        System.out.println(matrix1);
        System.out.println(matrix2);
        System.out.println(matrix0);
        System.out.println(matrix1.multiply(matrix2));
        System.out.println(matrix0.det());
    }
}
