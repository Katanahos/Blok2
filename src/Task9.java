import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        int count1 = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }

        for (int k : mass) {
            int count = 0;
            for (int i : mass) {
                if (k == i)
                    count++;
            }
            if (count > count1)
                count1 = count;
        }

        for (int i = 0; i < mass.length; i++) {
            int count = 0;
            for (int j = 0; j < mass.length; j++) {
                if (i == j)
                    count++;
            }
            if(count==count1)
                list.add(i);
        }

        Collections.sort(list);
        System.out.println(list.get(0));

    }
}
