import java.util.*;

public class methodOverloading{
    
    
    public int area(int a, int b){
        return a*b;
    }
    public double area(int a){
        return 3.14d*a*a;
    }
    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.println("Area of Rectangle: "+obj.area(a,b));
        System.out.println("Area of Circle: "+obj.area(a));
        
    }
}