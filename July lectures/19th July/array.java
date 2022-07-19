import java.util.*;

public class array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 5, 10, 2, 6 };
        int target = 5;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];

            if (val == target) {
                System.out.println(i);
                break;
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];

            if (val == target) {
                count++;
            }
        }

        System.out.println(count);

    }
}