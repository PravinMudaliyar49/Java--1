// package June lectures.19th June;

public class introToNestedLoops {
    public static void main(String[] args) {
        int n = 10;
        int m = 5;

        // for (int i = 1; i <= n; i++) {
        // System.out.print(i + " ");
        // }

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ==> ");
            
            for (int j = 1; j <= m; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }

    }
}
