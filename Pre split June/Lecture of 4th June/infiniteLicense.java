import java.util.*;

public class infiniteLicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String name = sc.next();
            int age = sc.nextInt();

            if (age < 18 && name.equals("Kunal")) {
                continue;
            } else if (name.equals("Kunal")) {
                System.out.println("We stopped providing license.");
                break;
            } else if (age < 18) {
                System.out.println("No license");
            } else {
                System.out.println("Take license");
            }
        }
    }
}