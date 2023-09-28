import java.util.*;

public class factorialNumbers {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact*=i;
            System.out.println("Factorial of "+i+" is: "+fact);
            
        }
        System.out.print("Factorial of given number is: "+fact);

    }
}
