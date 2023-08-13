import java.util.*;

public class fibonacciNumberGuessing {
    public static void main(String[] args) {
        int i,num;
        int output = 0; 
        System.out.print("Enter a number (Range of Fibonacci Number):");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        for(i=0;i<num;i++)
        {
            output = i+num; 
        }
        System.out.println(num+"th"+" Fibonacci number is: "+output);
       
 }
}
