public class dummy {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 15;

        for (int i = n1; i <= n2; i++) {
            if (i == n3) {
                continue;
            }

            System.out.println(i);
        }
    }
}
