import java.util.*;

// package Lecture of 7th June;

public class arrayIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] array = new int[4];
        // array[0] = 69;
        // array[1] = 70;
        // array[2] = 71;
        // array[3] = 72;

        // for (int i = 0; i <= 3; i++) {
        // System.out.println((i + 1) + " ---> " + array[i]);
        // }

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " number of the array");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to remove");
        int occ = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] != occ) {
                System.out.println(arr[i]);
            }
        }

    }
}
