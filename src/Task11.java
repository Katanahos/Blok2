import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        double[][] matr = new double[first][second];

        for (int i = 0; i < first; i++) {
            for (int j = 0; j < second; j++) {
                matr[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < first; i += 2) {
            if (matr[0][i] > matr[second - 1][i]) {
                for (int j = 0; j < first; j++) {
                    System.out.println(matr[j][i]);
                }
            }

        }

    }
}
