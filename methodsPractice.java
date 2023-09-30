import java.util.*;

public class methodsPractice {

    // public void sum(){
 
    //     Scanner obj = new Scanner(System.in);
    //     System.out.print("Enter First number: ");
    //     int num1 = obj.nextInt();
    //     System.out.print("Enter Second number: ");
    //     int num2 = obj.nextInt();
    //     int sum = num1+num2;
    //     System.out.println("Sum of both numbers is: "+sum);
    // }

    public int sum(int a, int b){

        int result = a+b;
        return result;
    }

    public static void main(String[] args) {
        
        methodsPractice obj = new methodsPractice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();    
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();    
        int out = obj.sum(a,b);
        System.out.println("Output sum is: "+out);
    }
}
