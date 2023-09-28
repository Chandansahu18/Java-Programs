import java.util.*;

public class breakandContinueKeyword{

    public static void main(String[] args){
        
        //we have to print stream of numbers until given limit except multiples of 3.
        // Use of continue keyword.
        
        // int num;
        // Scanner sc  = new Scanner(System.in);
        // System.out.println("Enter the limit: ");
        // int limit = sc.nextInt();
        // for(num=1; num<=limit; num++){
        //  if(num%3 == 0){
        //     continue;
        //  }
        //  System.out.println(num);

        // }

        //Use of break keyword.
        //Printing the first multiple of 5 & 7 using while loop and break keyword.
        //While loop is used when termination condition is not given otherwise we will use for loop.
        int num = 1;
        while(true){    // This loop will be executed everytime because condition will be true everytime.
            if((num%5 == 0) && (num%7 == 0)){
             System.out.print("First multiple of 5 & 7 is found: "+num);
             break; // to break the loop.  
            }
            num++;

        //Note: 1. In while loop, condition is provided so that we can check to execute the program or exit from it. And, condition is evaluated as true or false only so in this case condition will be true everytime.

        }
       
       
       
            
        
    }

}