import java.util.Scanner;

public class exceptionHandling {
      
    public static void main(String[] args) {
        
        //This will take input from the user anmd print Arithmetic Exception.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 1st number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter 2nd number: ");
        // int num2 = sc.nextInt();
        
        // try{
        //     int result = num1/num2;            
        // }catch(Exception e){
        //     System.out.print(e);
        // }

        // System.out.println("Division of both numbers is: "+num1/num2);
    
        
        //This example will demonstrate multiple catch blocks
    //     try{
    //         int[] arr= new int[5];
    //         arr[0] = 1; 
    //         arr[1] = 1; 
    //         arr[2] = 1; 
    //         arr[3] = 1; 
    //         arr[4] = 1; 
    //         arr[5] = 1; 
    //         arr[6] = 1; 
    // }catch(ArrayIndexOutOfBoundsException e){
    //     System.out.println("Index out of Bounds Exception.");
    // }
    // catch(ArithmeticException e){
    //     System.out.println("Arithmetic Exception.");
    // }

       //This will demonstrate nested try-catch blocks.
    //    try{
    //        int[] arr = new int[4];
    //        arr[0] = 1;
    //        arr[1] = 2;
    //        arr[2] = 3;
    //        arr[3] = 4;
    //        arr[5] = 5;
    //        try{
    //         int a = 1;
    //         int b = 0; 
    //         int c = a/b;
    //        }catch(ArithmeticException e){
    //         System.out.println(e);
    //        }
    //    }catch(ArrayIndexOutOfBoundsException e){
    //     System.out.println(e);
    // }
    //  System.out.println("Normal flow of code.");

    
     //This will demonstrate finally block
    //  try{
    //     int a =5;
    //     int b = 0;
    //     int c = a/b;
    //  }catch(ArithmeticException e){
    //     System.out.println(e);
    //  }finally{
    //     System.out.println("Finally will be executed no matter any exception will occur.");
    //  }
    //  System.out.println("Rest of the code.");

    //This will demonstrate use of throw keyword in conditional statements
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    if(num<18){
    throw new ArithmeticException("Entered number is less than 18.");
    //Syntax: throw new exception_class("error message");  
    
    }else{
        System.out.println("Number is greater than 18.");
    }
    }
}
