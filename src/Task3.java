import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] mass = new double[N];
        int count0 = 0, countplus = 0, countminus = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }

        for (double v : mass) {
            if (v > 0)
                countplus++;
            else if (v < 0)
                countminus++;
            else count0++;
        }
        System.out.println("Положительных "+countplus);
        System.out.println("Отрицательных "+countminus);
        System.out.println("Нулей "+count0);
    }
}
