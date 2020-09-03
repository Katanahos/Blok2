import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] mass = new double[size];
        double change = scanner.nextDouble();

        for (int i = 1; i < mass.length; i++) {
            mass[i] = mass[i-1] + change;
        }

        for (int i = 0; i < mass.length; i++) {

        }
    }
}
