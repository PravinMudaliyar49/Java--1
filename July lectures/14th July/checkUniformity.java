import java.util.*;

public class checkUniformity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                System.out.println("False");
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("True");
        }

        sc.close();
    }
}