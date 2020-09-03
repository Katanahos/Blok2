import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] mass = new double[size];
        double change = scanner.nextDouble();
        mass[0] = scanner.nextDouble();
        double max = Double.MIN_VALUE;

        for (int i = 1; i < mass.length; i++) {
            mass[i] = mass[i - 1] + change;
        }

        for (int i = 0; i < mass.length; i++) {
            if (max < (mass[i]) + (mass[mass.length - 1] + ((mass.length-i) * change))) {
                max = (mass[i]) + (mass[mass.length - 1] + ((mass.length-i) * change));
            }
        }
        System.out.println(max);
    }
}
