public class pattern8 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            
            System.out.println("*\t");
            System.out.println();
        }

    }
}