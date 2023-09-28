import java.util.*;

public class sumOfseries {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        int answer = 0;
        for(int i=0;i<=range;i++){
            if(i%2 == 0){
             
                answer -= i;
            }else{
                answer += i;
            }
        }
        System.out.print("Sum of series is: "+answer);
    }
}
