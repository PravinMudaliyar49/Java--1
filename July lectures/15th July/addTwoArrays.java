import java.util.*;

public class addTwoArrays {
    public static void main(String[] args) {
        // int[] a = { 1, 2 };
        // int[] b = { 1, 2, 3, 4 };
        // int[] a = { 1, 2 };
        // int[] b = { 1, 2, 3, 4 };
        int[] a = { 9, 9, 9 };
        int[] b = { 9, 9, 9 };

        // int size = 0;

        // if (a.length >= b.length) {
        // size = a.length;
        // } else {
        // size = b.length;
        // }

        if (a.length > b.length) {
            int[] temp = b;
            b = a;
            a = temp;
        }

        int[] result = new int[b.length];

        int ind1 = a.length - 1;
        int ind2 = b.length - 1;

        int carry = 0;

        for (int i = result.length - 1; i >= 0; i--) {
            int val1 = 0;
            int val2 = b[ind2];

            if (ind1 >= 0) {
                val1 = a[ind1];
            }

            int sum = val1 + val2 + carry;

            carry = sum / 10;
            int lastDig = sum % 10;

            result[i] = lastDig;
            ind1--;
            ind2--;
        }

        if(carry > 0) {
            int[] temp = new int[result.length + 1];
            temp[0] = carry;

            for(int i = 1; i < temp.length; i++) {
                temp[i] = result[i - 1];
            }
            
            result = temp;
        }
        
        System.out.println(Arrays.toString(result));

    }
}