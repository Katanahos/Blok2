import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int j : A) {
            if (j % K == 0) {
                sum += j;
            }
        }
        System.out.println(sum);

        // write your code here
    }
}
