import java.util.*;

public class kRotate {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int k = 3; // Output: 60 70 80 10 20 30 40 50.

        k = k % arr.length;

        if(k < 0) {
            k = k + arr.length;
        }

        int a = 0;
        int b = arr.length - k - 1;

        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }

        int c = arr.length - k;
        int d = arr.length - 1;

        while (c < d) {
            int temp = arr[c];
            arr[c] = arr[d];
            arr[d] = temp;

            c++;
            d--;
        }

        int x = 0;
        int y = arr.length - 1;

        while (x < y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;

            x++;
            y--;
        }

        System.out.println(Arrays.toString(arr));

    }
}