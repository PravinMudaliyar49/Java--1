public class fibonacci {
    public static void main(String[] args) {
        int n = 10; // ans ==> 34.

        int firstNumber = 0;
        int secondNumber = 1;
        int fibonacci = 0;

        // System.out.println(firstNumber);
        // System.out.println(secondNumber);

        for (int i = 1; i <= n - 2; i++) {
            fibonacci = firstNumber + secondNumber;
            // System.out.println(fibonacci);

            firstNumber = secondNumber;
            secondNumber = fibonacci;
        }

        System.out.println(fibonacci);
    }
}