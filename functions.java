import java.util.*;

public class functions{

    // //Type 1
    // public static void sum(int num1, int num2){
    //     System.out.println(num1+num2);
    //     return;
    // }

    //Type 2 
    // public static int sum(int num1,int num2){
    //          int result = num1+num2;
    //         return result;    }  

    // public static int multiply(int num1, int num2){
           
    //    int product = num1*num2;
    //    return product;   
    // }

    public static void factorial(int num){
        
        if(num == 0){
            System.out.println("Invalid number.");
        }else{
            int Factorial = 1;
        for(int i=num;i>=1;i--){
            Factorial =  Factorial*i; 
        } 
        System.out.println(Factorial);
        }
    }
    public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
                //  System.out.println("Enter First Number: ");
                //  int num1 = sc.nextInt();
                //  System.out.println("Enter second number: ");
                //  int num2 = sc.nextInt();
                  
                 //sum(num1,num2);
                 //int Result = sum(num1,num2);
                // System.out.println(Result);
                // int Result = multiply(num1,num2);
                // System.out.println(Result);

                System.out.println("Enter a number to find its Factorial: ");
                int num = sc.nextInt();
                System.out.println("Factorial of given number is: ");
                factorial(num);
                

    }
}