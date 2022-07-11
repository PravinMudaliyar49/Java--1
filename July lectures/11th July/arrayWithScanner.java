import java.util.*;

public class arrayWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0; i < num; i++) {
            int val = sc.nextInt();
            arr[i] = val;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Element " + arr[i] + " is at " + i + " index.");
        }

        sc.close();
    }
}