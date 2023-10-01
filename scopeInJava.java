
public class scopeInJava{

    //Class level scope | Can be used by any method or block inside the class.
    int a = 10;
    int b = 20;

    public void demo(){
        //Method level scope | can be used inside a method. 
        int num1 = 10;
        int num2 = 30;
        System.out.println("Class numbers are: "+a+" and "+b);
        System.out.println("Demo method numbers are: "+num1+" and "+num2);
      
    }

    {
        //Block level scope | can only be used inside a block only.
        int x = 3;
        int y = 5;
        System.out.println("Block numbers are: "+x+" and "+y);

    }
public static void main(String[] args) {
    
    scopeInJava obj = new scopeInJava();
    obj.demo();

    
}

}