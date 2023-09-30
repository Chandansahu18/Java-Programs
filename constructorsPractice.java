import java.lang.reflect.Constructor;
import java.util.*;

public class constructorsPractice {

    int num1;
    int num2;
    // constructorsPractice(){
    // System.out.println("Constructor Called");
    // }

    constructorsPractice(int a, int b){   
     num1 = a;
     num2 = b;
    }
    
    int sum(){
        int result = num1+num2;
        return result;
    }
    public static void main(String[] args) {
        constructorsPractice object = new constructorsPractice(5,7);
        Scanner obj = new Scanner(System.in);
        int output = object.sum();
        System.out.println("Sum of "+object.num1+" and "+object.num2+" is: "+output);
        
        

    }
}
