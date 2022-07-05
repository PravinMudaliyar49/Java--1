import java.util.*;

public class candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int limakTurn = 1;
        int bobTurn = 2;

        while(true) {
            if(A < limakTurn) {
                System.out.println("Bob wins");
                break;
            }
            
            if(B < bobTurn) {
                System.out.println("Limak wins");
                break;
            }

            A -= limakTurn;
            B -= bobTurn;

            limakTurn += 2;
            bobTurn += 2;
        }

    }
}
