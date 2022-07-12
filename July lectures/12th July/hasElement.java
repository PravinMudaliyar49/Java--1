import java.util.*;

public class hasElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int[] arr = { 10, 3, 4, 21, 34 };

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];

            if (val == target) {
                flag = true;
                System.out.println("True");
                break;
            }
        }

        if (flag == false) {
            System.out.println("False");
        }

        sc.close();
    }
}
