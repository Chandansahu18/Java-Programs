import java.util.*;

public class bitManipulationInJava {
    
    public static void main(String[] args) {
        
        //Get Bit Operation
        // Scanner sc = new Scanner(System.in);
        // int n  = 5;
        // System.out.println("Given number is: "+n);
        // System.out.println("Enter the position of bit to check whether it is 1 or 0: ");
        // int pos = sc.nextInt();
        // int bitMask = 1<<pos; //bitMask is the condition for manipulation of bits.
        // if((bitMask & n) == 0){
        //     System.out.println("Bit is 0 at given position of number.");
        // }else{
        //     System.out.println("Bit is 1 at given position of number.");
        // }

        //Set Bit operation
        // Scanner sc = new Scanner(System.in);
        // int n = 5;
        // System.out.println("Enter the position of bit to be set it to 1: ");
        // int pos = sc.nextInt();
        // int bitMask = 1<<pos;
        // int newNumber = bitMask | n;//This will set the output bit to 1.
        // System.out.println(newNumber);

        //Clear Bit Operation
        // Scanner sc = new Scanner(System.in);
        // int n = 5;
        // System.out.println("Enter the position of bit to be set it to 0: ");
        // int pos = sc.nextInt();
        // int bitMask = 1<<pos;
        // int newNumber = ~(bitMask) & n;//This will set the output bit to 0.
        // System.out.println(newNumber);
         
        //Update Bit Operation
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.println("Enter the position of bit to be updated: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int oneOutput = bitMask | n;//This will update & make the particular bit to 1.
        int zeroOutput = ~(bitMask) & n;//This will update the bit at a particular position and make it to 0.
        System.out.println(oneOutput);
        System.out.println(zeroOutput);
        
    
    }
}
