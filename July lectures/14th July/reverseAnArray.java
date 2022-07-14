import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        // 50 40 30 20 10

        // I solution:

        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.print(arr[i] + " ");
        // }

        // II solution:

        // int[] res = new int[arr.length];

        // int j = 0;
        // for (int i = arr.length - 1; i >= 0; i--) {
        // res[j] = arr[i];
        // j++;
        // }

        // for(int i = 0 ; i < res.length; i++) {
        // arr[i] = res[i];
        // }

        // System.out.println(Arrays.toString(arr));

        // III solution:

        // int startInd = 0;
        // int endInd = arr.length - 1;

        // while (startInd < endInd) {
        //     int temp = arr[startInd];
        //     arr[startInd] = arr[endInd];
        //     arr[endInd] = temp;

        //     startInd++;
        //     endInd--;
        // }

        for(int startInd = 0, endInd = arr.length - 1; startInd < endInd; startInd++, endInd--) {
            int temp = arr[startInd];
            arr[startInd] = arr[endInd];
            arr[endInd] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
