import java.util.Arrays;

public class implication {
    public static void main(String[] args) {

        // Part1:
        // int a = 10;
        // int b = a;
        // // b++;
        // a++;

        // System.out.println(a);
        // System.out.println(b);

        // Part 2:

        int[] arr = { 10, 20, 30 };
        // int[] temp = { 10, 20, 30 };

        int[] temp = Arrays.copyOfRange(arr, 0, arr.length);

        temp[1] = 10000;

        for (int i = 0; i < arr.length; i++) { // 10 20 30.
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < temp.length; i++) { // 10 10000 30.
            System.out.print(temp[i] + " ");
        }
    }
}
