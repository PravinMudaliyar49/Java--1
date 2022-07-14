public class swapRevise {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap:");
        System.out.println(a + " " + b);
        
        int temp = b;
        b = a;
        a = temp;
        
        System.out.println("After swap:");
        System.out.println(a + " " + b);
    }
}
