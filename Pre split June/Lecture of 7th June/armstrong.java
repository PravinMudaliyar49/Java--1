import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748

        Scanner sc = new Scanner(System.in);

        while (true) {

            int num = sc.nextInt();

            int digitsCount = 0;

            int temp1 = num;
            int temp2 = num;

            // Digits count:
            while (temp1 != 0) {
                digitsCount++;
                temp1 = temp1 / 10;
            }

            int sum = 0;

            // Actual code:
            while (temp2 != 0) {
                int lastDig = temp2 % 10;

                int raisedTo = 1;

                for (int i = 1; i <= digitsCount; i++) {
                    raisedTo = raisedTo * lastDig;
                }

                // cube = lastDig * lastDig * lastDig;

                sum = sum + raisedTo;

                temp2 = temp2 / 10;
            }

            // 1 + 1296 + 81 + 256

            if (sum == num) {
                System.out.println("It is an armstrong number.");
            } else {
                System.out.println("It is not an armstrong number.");
            }
        }

    }
}
