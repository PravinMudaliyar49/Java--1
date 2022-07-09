import java.util.*;

// package Lecture of 18th May;

public class relation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println("Num1 is greater than Num2");
            } else {
                System.out.println("Num1 is smaller than Num2");
            }
        } else {
            System.out.println("Number 1 and Number 2 are equal.");
        }

    }
}
