import java.util.*;

// package Lecture of 15th May;

public class salaryCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int year = sc.nextInt();
        int salary = sc.nextInt();
        int increment = sc.nextInt();

        if (year >= 2022) {
            int rupee = salary * increment / 100;
            int diff = year - 2022;

            int increase = rupee * diff;

            int futureSal = salary + increase;

            System.out.println("Hey, " + name + ", your salary will be " + futureSal + " in the year " + year + ".");
        } else {
            System.out.println(202);
        }

        System.out.println("Salary calculated.");
        sc.close();
    }

}
