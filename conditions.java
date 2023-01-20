import java.util.*;

public class conditions {

    public static void main(String args[])
 {
            //Problem 1
    //      try (Scanner obj = new Scanner(System.in)) 
    //     {
    //         System.out.println("Enter your age to check whether you are eligible to go for Nightout?: ");
    //          int age = obj.nextInt();
    //          if(age < 18)
    //          {
    //            System.out.println("You are not Eligible :(");

    //          }
    //          else{
    //             System.out.println("You are eligible to go for Nightout :)");
    //          }
    //     }

 

            //Problem 2
            // Scanner obj = new Scanner(System.in);
            // System.out.println("Enter a number to check whether it is even or not: ");
            // int num = obj.nextInt();
            // if(num%2 == 0)
            // {
            //     System.out.println("Yes given number is Even!");
            // }
            // else{
            //     System.out.println("Sorry! given number is odd.");
            // }
              

            // Problem 3
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the first number: ");
            // int num1 = sc.nextInt();
            // System.out.println("Enter the Second number: ");
            // int num2 = sc.nextInt();

            // if(num1>num2)
            // {
            //     System.out.println("First number is greater than second.");

            // }
            // else if(num1 == num2)
            // {
            //     System.out.println("First number is equal to second number.");
            // }
            // else {
            //     System.out.println("First number is less than Second number.");
            // }


            //Problem 4 
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the number from given set [1,2,3]: ");
            int num = obj.nextInt();

            switch(num){
                case 1:
                System.out.println("Hello");
                break;
                case 2: 
                System.out.println("Namaste");
                break;
                case 3:
                System.out.println("Bonjour");
                break;
                default :
                System.out.println("Invalid Input");
            }

        }    
}

