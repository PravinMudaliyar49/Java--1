import java.util.Arrays;

public class subtract2Arrays {
    public static void main(String[] args) {
        // int[] a1 = { 5, 4, 3 };
        // int[] a2 = { 1, 2, 3 };

        // int[] a1 = { 7, 7 };
        // int[] a2 = { 9, 9, 9 };

        // int[] a1 = { 8, 6, 7 };
        // int[] a2 = { 8, 6, 9 };

        // int[] a1 = { 8, 9, 9 };
        // int[] a2 = { 8, 6, 9 };

        // int[] a1 = {9, 2, 1};
        // int[] a2 = {8, 6, 7};

        int[] a1 = {1, 5, 1};
        int[] a2 = {9, 7};

        if (a2.length > a1.length) {
            int[] temp = a1;
            a1 = a2;
            a2 = temp;
        } else if (a1.length == a2.length) {
            boolean a2IsGreater = false;

            for (int i = 0; i < a1.length; i++) {
                if(a1[i] != a2[i]) {
                    if(a2[i] > a1[i]) {
                        a2IsGreater = true;
                    }

                    break;
                }
            }

            if (a2IsGreater == true) {
                int[] temp = a1;
                a1 = a2;
                a2 = temp;
            }

        }

        int[] res = new int[a1.length];

        int ind1 = a1.length - 1; // 2
        int ind2 = a2.length - 1; // 1

        int carry = 0;

        for (int i = res.length - 1; i >= 0; i--) {
            int val1 = a1[ind1];
            int val2 = 0;

            if (ind2 >= 0) {
                val2 = a2[ind2];
            }

            if(carry == 1) {
                val1 = val1 - 1;
                carry = 0;
            }

            if(val1 < val2) {
                val1 = val1 + 10;
                carry = 1;
            }

            res[i] = val1 - val2;

            ind1--;
            ind2--;
        }

        if (res[0] == 0) {
            int ind3 = 0;

            while (res[ind3] == 0) {
                ind3++;
            }

            int[] temp = new int[res.length - ind3];

            for (int i = 0; i < temp.length; i++) {
                temp[i] = res[ind3];
                ind3++;
            }

            res = temp;
        }

        System.out.println(Arrays.toString(res));
    }
}