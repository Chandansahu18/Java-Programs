import java.util.*;

public class miscPracticeProblem {

    public static void main(String[] args){

        //We will find a raised to power b. where a and b are numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter Second number: ");
        int secondNum = sc.nextInt();
        int result = 1;
        for(int i=secondNum;i>0;i--){
            result *= firstNum; // result = result * firstNum;
        }
        System.out.print(firstNum+" raised to power "+secondNum+" is: "+result);

    }
}
