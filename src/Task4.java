
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        int index1 = 0, index2 = 0;
        double changer;

        double[] mass = new double[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextDouble();
        }

        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
                index1 = i;
            }
            if (max < mass[i]) {
                max = mass[i];
                index2 = i;
            }
        }
        changer = mass[index1];
        mass[index1] = mass[index2];
        mass[index2] = changer;


    }
}
