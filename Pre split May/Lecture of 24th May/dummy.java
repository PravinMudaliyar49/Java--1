public class dummy {
    public static void main(String[] args) {
        int age = 19;
        String name = "Rohan";

        if (age < 18) {
            if (name.equals("Rohan")) {
                System.out.println("Take licence.");
            } else {
                System.out.println("No licence.");
            }
        } else {
            System.out.println("Take licence.");
        }

        if (age > 18 || name.equals("Rohan")) {
            System.out.println("Take licence.");
        } else {
            System.out.println("Take licence.");
        }
    }
}