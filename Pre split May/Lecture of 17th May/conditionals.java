public class conditionals {
    public static void main(String[] args) {
        // int age = 18;

        // if (age > 18) {
        // System.out.println("Take licence");
        // } else if (age == 18) {
        // System.out.println("Licence after 2 months");
        // } else {
        // System.out.println("No licence");
        // }

        int num = 18;

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        if (num > 0) {
            System.out.println("Positive");
        } else if (num == 0) {
            System.out.println("Neutral");
        } else {
            System.out.println("Negative");
        }

    }
}