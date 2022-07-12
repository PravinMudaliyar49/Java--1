import java.util.*;

public class firstIndexAndFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int firstIndex = -1;
        int frequency = 0;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                firstIndex = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                frequency++;
            }
        }

        System.out.println(firstIndex);
        System.out.println(frequency);

        sc.close();
    }
}
