import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] mass = new double[size];
        double change = scanner.nextDouble();
        mass[0] = scanner.nextDouble();
        double min = Double.MAX_VALUE;

        ArrayList<Double> list = new ArrayList<>();

        for (int i = 1; i < mass.length; i++) {
            mass[i] = mass[i - 1] + change;
        }

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min)
                min = mass[i];
        }

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != min)
                list.add(mass[i]);
        }

        for (double x : list)
            System.out.println(x);
    }
}
