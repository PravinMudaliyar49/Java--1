import java.util.*;

public class tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // int a = 0;
        // int b = 1;
        // int c = 1;
        // int tribonacci = 0;

        // for (int i = 1; i <= num - 3; i++) {
        //     tribonacci = a + b + c;
        //     a = b;
        //     b = c;
        //     c = tribonacci;
        // }
        
        // System.out.println(tribonacci);

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= num - 3; i++) {
            int tribonacci = a + b + c;
            a = b;
            b = c;
            c = tribonacci;

            if(i == num - 3) {
                System.out.println(tribonacci);
            }
        }
        
    }
}
