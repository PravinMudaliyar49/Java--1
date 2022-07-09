import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("~~~~~~~~~~~~~~~~~");

        System.out.println("Enter your first number:");
        double n1 = sc.nextDouble();
        System.out.println("~~~~~~~~~~~~~~~~~");

        System.out.println("Enter your second number:");
        double n2 = sc.nextDouble();
        System.out.println("~~~~~~~~~~~~~~~~~");

        System.out.println("Enter the operation you want to perform:");
        char ch = sc.next().charAt(0);
        System.out.println("~~~~~~~~~~~~~~~~~");

        double ans = 0;
        boolean correct = true;

        if (ch == '+') {
            ans = n1 + n2;
        } else if (ch == '-') {
            ans = n1 - n2;
        } else if (ch == '*') {
            ans = n1 * n2;
        } else if (ch == '/') {
            ans = n1 / n2;
        } else if (ch == '%') {
            ans = n1 % n2;
        } else {
            correct = false;
        }

        if (correct == true) {
            System.out.println("Hey " + name + ", your result is " + ans + ".");
        }else{
            System.out.println("Hey " + name + ", please enter a valid operator. Try again!!");
        }
        
        System.out.println("~~~~~~~~~~~~~~~~~");

    }
}