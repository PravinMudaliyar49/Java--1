import java.util.*;

public class sumOfLast2Digs{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // int lastDigit = num % 10;

        // num = num / 10;

        // int secondLastDigit = num % 10;

        // System.out.println(lastDigit + secondLastDigit);

        int lastTwoDigit = num % 100;

        int secondLastDigit = lastTwoDigit / 10;
        int lastDigit = lastTwoDigit % 10;

        System.out.println(lastDigit + secondLastDigit);

    }
}