public class sumOfLast2Digs{
    public static void main(String[] args) {
        int num = 586723;        //ans : 5

        int lastDigit = num % 10;

        int lastTwoDigits = num % 100;

        int secondLastDigit = lastTwoDigits / 10;

        System.out.println(lastDigit + secondLastDigit);

    }
}