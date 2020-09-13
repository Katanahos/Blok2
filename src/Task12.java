import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        double[][] matr = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matr[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(matr[i][i]);
        }
    }
}
