
public class passByvalueinJava {

    static void demoMethod(int a, int b){
        a = 45;
        b = 67;
        System.out.println("demoMethod Called.");
        System.out.println(a+" : "+b);
    }
    public static void main(String[] args) {
        
        int num1 = 4;
        int num2 = 6;
        demoMethod(num1, num2);
        System.out.println(num1+" : "+num2);
    }
}
