import java.util.Scanner;

// package Lecture of 23rd May;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            isLeapYear = true;

            if (year % 100 == 0) {
                isLeapYear = false;

                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
        }

        if (isLeapYear == true) {
            System.out.println("The given year is a leap year.");
        } else {
            System.out.println("The given year is not a leap year.");
        }
    }
}
