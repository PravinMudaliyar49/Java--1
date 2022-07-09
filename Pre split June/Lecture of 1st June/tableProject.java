import java.util.*;

public class tableProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the table's number you want to see:");
        int n = sc.nextInt();

        System.out.println("Enter the limit:");
        int m = sc.nextInt();

        System.out.println("Enter number you want to avoid:");
        int z = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            if (i == z + 1) {
                break;
            }

            int mul = n * i;
            System.out.println(n + " * " + i + " = " + mul);
        }
    }
}
