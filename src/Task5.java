import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];
        int change = scanner.nextInt();
        mass[0] = scanner.nextInt();

        for (int i = 1; i < mass.length; i++) {
            mass[i] = (mass[i-1]) + change;
        }

        for (int i = 0; i < mass.length; i++) {
            if(mass[i]>i)
                System.out.print(mass[i]+" ");
        }
    }
}
