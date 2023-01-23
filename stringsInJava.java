import java.util.*;

public class stringsInJava {

    public static void main(String[] args) {
      //String declaration
      // String name = "Chandan";
      // System.out.println("Name: "+name);
      
       //String Concatenation
    //   String name1 = "Chandan";
    //   String name2 = "Sahu";
    //   String Concat = name1+" "+name2;
    //   System.out.println("Full name: "+Concat); 
       
       //String input & print the result
    //    Scanner sc = new Scanner(System.in);
    //    //This will take input from the user and print the string
    //    System.out.print("Enter the name: ");
    //    String name = sc.next(); //This will take only first word "Chandan"as input not the complete sentence.
    //    System.out.print("Name is: "+name);  
       

           //String input from user & print result & its length as ouput.
        //   Scanner sc  = new Scanner (System.in);
        //   System.out.print("Enter the name: ");  
        //   String name = sc.nextLine(); //This will take the entire senetence as input.
        //   System.out.print("Name is: "+name);
        //   int length = name.length();
        //   System.out.println();
        //   System.out.println("Length of string is: "+length);
        
        //This will take input from user and return total index of String.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the string: ");
        // String name = sc.nextLine();
        // System.out.print("Entered string: "+name);
        // System.out.println();
        // int length = name.length();          
        // System.out.print("Length of string: "+length);
        // System.out.println();
        // //This will print index values of string
        // for(int i=0;i<length;i++){
        //     System.out.print(name.charAt(i)+" ");//This will print characters of string index wise.
        // }

        //This will take input from the user and compare both the strings and give output.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter First string: ");
        // String name1 = sc.nextLine();
        // System.out.print("Enter Second string: ");
        // String name2 = sc.nextLine();
        // //stringVariable1.compareTo(stringVariable2) == 0 --> Strings are equal
        // //stringVariable1.compareTo(stringVariable2)  > 0 --> String1 is greater than string2 
        // //stringVariable1.compareTo(stringVariable2)  < 0 --> String1 is smaller than string2

        // if(name1.compareTo(name2) == 0){
        //   System.out.println("Strings are equal.");
        // }else{
        //     System.out.println("Strings are not equal.");
        // }

        //This will take input string from the user and print the substring.
      //   Scanner sc = new Scanner(System.in);
      //   System.out.println("Enter the string:");
      //   String string = sc.nextLine();
      //   String substring = string.substring(5);
      //   System.out.println("Substring: "+substring);
         
       //parseInt() & toString() methods
      //  String string = "123";
      //  int var = Integer.parseInt(string);
      //  System.out.println(var);

      //  int integer = 1234;
      //  String str = Integer.toString(integer);
      //  System.out.println(str);

      //This will take input from the user and print the total number of vowels in the string.
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        String newString = "";
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='e'|| string.charAt(i)=='a' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u'){
                newString += string.charAt(i);
            }
        }
        System.out.print(newString.length());
    }
}
      
