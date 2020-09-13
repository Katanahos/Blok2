import java.util.Scanner;

public class Task13 {
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

        int k = scanner.nextInt();
        int p = scanner.nextInt();

        for (int i = 0; i < second; i++) {
            System.out.println(matr[k][i]);
        }

        for (int i = 0; i < first; i++) {
            System.out.println(matr[i][p]);
        }
    }
}
