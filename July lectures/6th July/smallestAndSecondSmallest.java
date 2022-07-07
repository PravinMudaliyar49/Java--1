import java.util.*;

public class smallestAndSecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;

        for (int i = 1; i <= num; i++) {
            int input = sc.nextInt();

            if (input < smallest) {
                secSmallest = smallest;
                smallest = input;
            } else if (input < secSmallest) {
                secSmallest = input;
            }

        }

        System.out.println(smallest);
        System.out.println(secSmallest);

        sc.close();
    }
}
