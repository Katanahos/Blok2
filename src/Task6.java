import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] mass = new double[size];
        mass[0] = scanner.nextDouble(); // первый член последовательности
        double change = scanner.nextDouble(); //простой пример изменения ряда
        double sum = mass[0];

        for (int i = 1; i < mass.length; i++) {
            mass[i] = mass[i-1] + change;
        }
        try {
            sum = mass[1] + mass[2];
            for (int i = 3; i < mass.length; i++) {
                boolean prost = true;
                for (int j = 2; j < i - 1; j++) {
                    if (i % j == 0) {
                        prost = false;
                    }
                }
                if(prost)
                    sum+=mass[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Малый массив");
        }
        finally {
            System.out.println(sum);
        }
    }
}

