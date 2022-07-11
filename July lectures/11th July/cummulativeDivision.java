public class cummulativeDivision {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 4 };

        int div = arr[0];

        for (int i = 1; i < arr.length; i++) {
            div /= arr[i];
        }

        System.out.println(div);
    }
}
