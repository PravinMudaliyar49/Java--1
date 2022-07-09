// package Lecture of 26th May;

public class secondLargest {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 50;
        int n3 = 5;

        if (n1 > n2 && n1 < n3 || n1 > n3 && n1 < n2) {
            System.out.println("Number 1 is the second largest.");
        } else if (n2 > n1 && n2 < n3 || n2 > n3 && n2 < n1) {
            System.out.println("Number 2 is the second largest.");
        } else {
            System.out.println("Number 3 is the second largest.");
        }
    }
}
