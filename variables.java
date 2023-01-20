import java.util.*;


public class variables {
    
    // public static void main(String args[])
    // {
        //Example of use of variables and Datatypes.
    //     int a = 20;
    //     int b = 10;
    //     int result = (a*b)/(a-b);
    //     System.out.println(result);
    // }

    public static void main(String args[])
    {
        //Sum of two numbers using Scanner class and Try  block.
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter Second Number: ");
            int num2 = sc.nextInt();
            int result = num1 + num2;
            System.out.println(result);
        }
    }
}
