import java.util.Arrays;

public class addTwoArrays {
    public static void main(String[] args) {
        int[] a = {9, 9, 9, 9};
        int[] b = {9, 9, 9};

        if(b.length > a.length) {
            int[] temp = a;
            a = b;
            b = temp;
        }

        int[] res = new int[a.length];

        int carry = 0;

        int ind1 = a.length - 1;
        int ind2 = b.length - 1;

        for(int i = res.length - 1; i >= 0; i--) {
            int val1 = a[ind1];
            int val2 = ind2 >= 0 ? b[ind2] : 0;

            int sum = val1 + val2;

            carry = sum / 10;
            res[i] = sum % 10;

            ind1--;
            ind2--;
        }
        
        
        if(carry > 0) {
            int[] temp = new int[res.length + 1];
            
            for(int i = 1; i < temp.length; i++) {
                temp[i] = res[i - 1];
            }
            
            temp[0] = carry;
            res = temp;
        }
        
        
        System.out.println(Arrays.toString(res));
    }
}
