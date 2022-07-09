import java.util.Scanner;

public class licenseProgram2 {
    public static void main(String[] args) {

        //Always use .equals() to check 2 strings.

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.next();
        String location = sc.next();

        if (age > 18) {
            if (name.equals("Kunal")) {
                System.out.println("No license.");
            } else {
                System.out.println("Take license.");
            }
        } else if (age == 18) {
            if (location.equals("Mumbai")) {
                System.out.println("Take license.");
            } else {
                System.out.println("After 2 months.");
            }
        } else {
            if (name.equals("Rohan")) {
                System.out.println("Take license.");
            } else {
                System.out.println("No license.");
            }
        }

    }
}