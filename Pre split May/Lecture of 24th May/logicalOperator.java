// package Lecture of 24th May;

public class logicalOperator {
    public static void main(String[] args) {
        // int num1 = 10;
        // int num2 = 20;
        // int num3 = 5;

        // if (num1 > num2) {
        // if (num1 > num3) {
        // System.out.println("Number 1 is the greatest");
        // }
        // } else if (num2 > num3) {
        // System.out.println("Number 2 is the greatest.");
        // } else {
        // System.out.println("Number 3 is the greatest.");
        // }

        // if (num1 > num2 && num1 > num3) {
        // System.out.println("Number 1 is the greatest");
        // } else if (num2 > num3) {
        // System.out.println("Number 2 is the greatest.");
        // } else {
        // System.out.println("Number 3 is the greatest.");
        // }

        String name = "Piyush";
        int age = 19;

        if (age < 18) {
            if (name.equals("Rohan")) {
                System.out.println("Take licence");
            } else {
                System.out.println("No licence");
            }
        } else {
            System.out.println("Take licence");
        }

        if (age > 18 || name.equals("Rohan")) {
            System.out.println("Take licence");
        } else {
            System.out.println("No licence");
        }

        if (age > 18 && name.equals("Rohan")) {
            System.out.println("Take licence");
        } else {
            System.out.println("No licence");
        }

    }
}
