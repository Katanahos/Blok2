import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0;
        double[] mass = new double[size];
        mass[0] = scanner.nextDouble(); // первый член последовательности
        double Z = scanner.nextDouble();
        double change = scanner.nextDouble(); //простой пример изменения ряда

        for (int i = 1; i < mass.length; i++) {
            mass[i] = (mass[i-1]) + change;
        }

        for (int i = 0; i < mass.length; i++) {
            if(mass[i]<Z){
                mass[i] = Z;
                count++;
            }
        }
        System.out.println(count);
    }
}
