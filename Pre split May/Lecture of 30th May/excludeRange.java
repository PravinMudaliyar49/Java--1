import java.util.*;

public class excludeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        //WITHOUT LOGICAL OPERATOR:
        for (int i = n1; i <= n2; i++) {
            if (i < n3) {
                System.out.println(i);
            }
            
            if (i > n4) {
                System.out.println(i);
            }
        }
        
        //WITH LOGICAL OPERATOR:
        for (int i = n1; i <= n2; i++) {
            if (i < n3 || i > n4) {
                System.out.println(i);
            }
        }

        //WHAT NOT TO DO:
        for (int i = n1; i <= n2; i++) {
            if (i < n3 && i > n4) {
                System.out.println(i);
            }
        }

    }
}
