import java.util.*;

public class spanOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // for(int i = 0; i < num; i++) {
        // int ip = sc.nextInt();
        // arr[i] = ip;
        // }

        int[] arr = { -1, -6, 10, 3, 40, 0, 2, 1, 4, -10 };

        int maximum = arr[0];
        int minimum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int ip = arr[i];

            if (ip < minimum) {
                minimum = ip;
            } else if (ip > maximum) {
                maximum = ip;
            }
        }

        System.out.println(maximum - minimum);

        sc.close();
    }
}