import java.util.*;

public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        int max = 0;

        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > max) {
                max = arr[i];
            }
        }        

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j--) {
                if (arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}