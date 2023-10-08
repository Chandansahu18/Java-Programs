import java.util.*;

public class primeNumberChecker{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%2 == 1 && num%1 == 0){
            System.out.println("Entered Number is prime.");
        }else if(num == 2){
            System.out.print("Entered Number is prime.");
        }else{
            System.out.print("Entered Number is Composite.");

        }
    }
}