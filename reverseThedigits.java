import java.util.*;

public class reverseThedigits {

    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int input  = sc.nextInt();
        int original_input = input;
        int answer=0;
        while(input>0){
            answer = answer * 10 + input%10;
            input /= 10;
        }
        System.out.println("Reverse of given "+original_input+" is: "+answer);
    }
}
