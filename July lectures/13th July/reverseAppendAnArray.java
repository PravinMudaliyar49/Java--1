import java.util.Arrays;

public class reverseAppendAnArray {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 40, 50, 60, 70 };

        int[] arr3 = new int[arr1.length + arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            // System.out.print(arr1[i] + " ");
            arr3[index] = arr1[i];
            index++;
        }

        for (int i = arr2.length - 1; i >= 0; i--) {
            // System.out.print(arr2[i] + " ");
            arr3[index] = arr2[i];
            index++;
        }

        int index2 = arr2.length - 1;
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[index2];
                index2--;
            }
        }

        // for (int i = 0; i < arr3.length; i++) {
        // System.out.print(arr3[i] + " ");
        // }

        // Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }
}