import java.util.Scanner;

public class countDig {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number:");

            int num = sc.nextInt();
            int count = 0;

            // while (num != 0) {
            //     num = num / 10;
            //     count++;
            // }

            for (; num != 0; count++) {
                num = num / 10;
            }

            System.out.println(count);
        }

    }
}