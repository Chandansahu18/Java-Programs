import java.util.*;

public class practice_forloops {

    public static void main(String[] args){
       
        //Here we will count the number of digits in the provided input. Like: input = 1235 Number of digits = 4
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num = sc.nextInt();
        int countOfdigits = 0;
        int originalNum = num;
        while(num>0){
            num = num/10;
            countOfdigits++;
        }
        System.out.println("Number of Digits in "+originalNum+" is: "+countOfdigits);
       
    }
}
