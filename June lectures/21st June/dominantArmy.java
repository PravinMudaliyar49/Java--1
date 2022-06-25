import java.util.Scanner;

public class dominantArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Na = sc.nextInt();
        int Nb = sc.nextInt();
        int Nc = sc.nextInt();

        if (Na > Nb + Nc || Nb > Na + Nc || Nc > Na + Nb) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
