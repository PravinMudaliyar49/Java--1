import java.util.*;

public class inputAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("User, please enter your age:");
        int currAge = sc.nextInt();

        System.out.println("User, enter a future year and your name:");
        int year = sc.nextInt();

        String name = sc.nextLine();

        int differenceInYear = year - 2022;

        int futureAge = currAge + differenceInYear;
        
        System.out.println("Hey," + name + "...... " + "your age will be " + futureAge + " in " + year + ".");
    }
}
