import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }

        for (int i = 0; i < mass.length; i++) {
            if(mass[i]>i)
                System.out.print(mass[i]+" ");
        }
    }
}
