
class sumOfDigs {
    public static void main(String[] args) {
        int num = 62895;

        int sum = 0;

        while (num != 0) {
            int lastDig = num % 10;
            sum = sum + lastDig;
            num /= 10;
        }

        // for (; num != 0; num = num / 10) {
        //     int lastDig = num % 10;
        //     sum = sum + lastDig;
        // }

        System.out.println(sum);

    }
}
