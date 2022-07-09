import java.util.Scanner;

public class greatestAmongst3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("Num1 is greatest.");
            }else{
                System.out.println("Num3 is greatest.");
            }
        } else if (n2 > n3) {
            System.out.println("Num2 is greatest.");
        } else {
            System.out.println("Num3 is greatest.");
        }
    }
}