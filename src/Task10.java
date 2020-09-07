import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        int x = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }

        for (int i = 0; i < mass.length; i++) {
            if (i > 0 & i % 2 == 1) {
                mass[i] = 0;
            }

            for (int j : mass) {
                System.out.println(j);
            }
        }
    }
}
