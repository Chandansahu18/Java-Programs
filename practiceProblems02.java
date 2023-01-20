import java.util.*;

public class practiceProblems02 {
 
    public static void main(String args[])
    {
        //Problem 01
//      Scanner obj = new Scanner(System.in);
//      System.out.println("Enter any number from given set to get the Month [1,2,3,4,5,6,7,8,9,10,11,12]: ");
//      int month = obj.nextInt();

//      switch(month){
//         case 1:
//         System.out.println("Month is January.");
//         break;
//         case 2:
//         System.out.println("Month is February");
//         break;
//         case 3:
//         System.out.println("Month is March.");
//         break;
//         case 4:
//         System.out.println("Month is April.");
//         break;
//         case 5:
//         System.out.println("Month is June");
//         break;
//         case 6:
//         System.out.println("Month is June");
//         break;
//         case 7:
//         System.out.println("Month is July");
//         break;
//         case 8:
//         System.out.println("Month is August");
//         break;
//         case 9:
//         System.out.println("Month is September");
//         break;
//         case 10:
//         System.out.println("Month is October");
//         break;
//         case 11:
//         System.out.println("Month is November");
//         break;
//         case 12:
//         System.out.println("Month is December");
//         break;
//         default: 
//         System.out.println("Invalid input");
//     }

          //Problem 2
          Scanner obj = new Scanner(System.in);
          System.out.println("\t\t\t\t\t\t\tSimple Calculator");
          System.out.print("Enter the First number: ");
          int num1 = obj.nextInt();
          System.out.print("Enter the Second number: ");
          int num2 = obj.nextInt();
          int add = num1 + num2;
          int sub = num1 - num2;
          int mul = num1 * num2;
          int div = num1 / num2;
          int mod = num1 % num2;
          
          System.out.println("Press the number from given set to perform operation [1--> Addition | 2--> Subtraction | 3--> Multiplication | 4--> Division | 5--> Modulus]: ");
          int event = obj.nextInt();

          switch(event)
          {
            case 1:
            System.out.println("Given output [Addition]: ");
            System.out.println(add);
            break;
            case 2:
            System.out.println("Given output [Subtraction]: ");
            System.out.println(sub);
            break;
            case 3:
            System.out.println("Given output [Multiplication]: ");
            System.out.println(mul);
            break;
            case 4:
            System.out.println("Given output [Division]: ");
            System.out.println(div);
            break;
            case 5:
            System.out.println("Given output [Modulus]: ");
            System.out.println(mod);
            break;
            default:
            System.out.println("Invalid input");
        }


   }
    
}
