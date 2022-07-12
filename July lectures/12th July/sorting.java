import java.util.*;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before sorting --> ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        
        Arrays.sort(arr);
        
        System.out.print("After sorting --> ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
