import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int startStar = 1;
        int endStar = num;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == startStar || j == endStar) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            startStar++;
            endStar--;

            System.out.println();
        }

        sc.close();
    }
}