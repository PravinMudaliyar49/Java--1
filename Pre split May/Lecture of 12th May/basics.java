public class basics {
    public static void main(String[] args) {
        int ages;        //Declaration.
        ages = 21;       //Initialization.
        
        ages = 22;       //Re-initialization.
        
        System.out.println("Raj is of age:" + ages);     //concatenation.
        
        // System.out.println(age);

        
        

        //Operators:
        
        //1. Arithmetic operators:
        
        int age = 21;
        
        int ageAfter10Years = age + 10;
        int ageBefore10Years = age - 10;
        int futureAge = age * 10;
        
        System.out.println("Age after 10 years will be " + ageAfter10Years + ".");
        System.out.println("Age before 10 years was " + ageBefore10Years + '.');
        System.out.println("Age in future might be " + futureAge + '.');
        
        int number = 20;
        int halfTheNumber = number / 2;
        System.out.println(halfTheNumber);


        //Mistake:
        
        // int age1 = age1 + 10;
        // System.out.println(age1);




        int num1 = 15 / 7;
        System.out.println(num1);            //quotient.
        
        int num2 = 15 % 7;
        System.out.println(num2);            //remainder.



        System.out.println("Hello");
        
        int num3 = 0 / 10;
        System.out.println(num3);
        
        int num4 = 10 / 0;
        System.out.println(num4);


        //This isn't called re-initialization:
        int x1 = 10;
        
        // int x = 20;
        
        System.out.println(x1);



        int x = 100;
        
        x += 10;        // x = x + 10;
        
        x -= 10;        // x = x - 10;
        
        x *= 10;        // x = x * 10;
        
        x /= 10;        // x = x / 10;
        
        x %= 10;        // x = x % 10;
        
        System.out.println(x);



        int x4 = 20;
        int y4 = 20;
        
        //Simple equal (=) vs Relational equal (==).
        boolean z = x4 == y4;
        
        System.out.println(z);



        // //Mistake:
        
        // int x == 10;        //Compilation error.


        int x5 = 20;
        int y5 = 20;
        
        boolean z5 = x5 != y5;
        
        System.out.println(z5);







        int x6 = 20;
        int y6 = 10;
        
        boolean z6 = x6 <= y6;
        
        System.out.println(z6);


    }
}
