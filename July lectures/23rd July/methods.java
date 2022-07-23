public class methods {

    // public static int squareOfANumber(int x) {
    //     int squared = x * x;
    //     return squared;
    // }

    // public static String greet(String name) {
    //     String greeting = "Hello " + name;
    //     return greeting;
    // }

    public static void main(String[] args) {
        // int z = 10;
        // int returnSquare = squareOfANumber(z);
        // System.out.println(returnSquare);

        // String greeting = greet("Random");
        // System.out.println(greeting);

        int[] arr = {10, 20, 30, 40};
        displayTheArray(arr);
        //wpoefwoefpewefojfwej
        displayTheArray(arr);

    }

    public static void displayTheArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}