import java.util.*;

public class largestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int largest = 0;
        int secondLargest = 0;

        for (int i = 1; i <= num; i++) {
            int val = sc.nextInt();

            if (val > largest) {
                secondLargest = largest;
                largest = val;
            } else if (val > secondLargest) {
                secondLargest = val;
            }

        }

        System.out.println(largest + " " + secondLargest);

    }
}
