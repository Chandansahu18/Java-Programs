import java.util.*;

public class practiceProblems03 {

    public static void main(String[] args) {
      
        //Problem 1
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter any number to get the sum of natural numbers: ");
    //     int num = sc.nextInt();
    //     if(num == 0)
    //     {
    //         System.out.println("Invalid input");
    //     }
    //     else{
    //     System.out.println("Sum of "+num+" natural numbers is: ");
    //     int sum = 0;
    //     for( int i = 1;i<=num;i++)
    //     {
    //         sum = sum+i;
    //     }
    //     System.out.println(sum);
    //    }

       //Problem 2
    //    Scanner obj = new Scanner(System.in);
    //    System.out.print("Enter a number to get the required Table: ");
    //    int num = obj.nextInt();
    //    System.out.println("Table of "+num+" is: ");
    //    for(int i = 1;i<=10;i++){
    //    int result = num*i;
    //    System.out.println(result);
    //    }
        
       //Problem 3
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter a number: ");
    //    int num = sc.nextInt();
    //    System.out.println("Even numbers till "+num);
    //    for(int i = 0;i<num;i+=2)
    //    // i+=2 --> i = i+2 It shows that the increment will be done 2 at each iterations. 
    //    {
    //     System.out.print(i+" ");
    //    }

       //Problem 4
    //    for(; ;)// In this condition the Loop will be executed infinite times
    //    {
    //     System.out.println("I am Iron Man!");
    //    }
         
       //Problem 5
    //    int task;
    //  do{
    //       Scanner sc = new Scanner(System.in);
    //       System.out.print("Enter the option from given set to perform task [0 --> End task | 1 --> Proceed task]: ");
    //        task = sc.nextInt();
    //       if(task == 1){System.out.println("Enter your total marks [out of 100]: ");
    //       int marks = sc.nextInt();
    //       if(marks >= 90){
    //       System.out.println("Excellent, You have Performed well.");
    //       } else if(marks<=89 && marks>=60){
    //       System.out.println("Good, You still performed well");  
    //       }
    //       else{
    //        System.out.println("This also good because marks don't matter but efforts does.");
    //       }}
       
    //     }while(task != 0);

        //Problem 06
        int check;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the option to perform task [0 --> End task | 1 --> Proceed task]: ");
            check = sc.nextInt();
            if(check == 1){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if(num%2 == 0){
                System.out.println("Given number is prime number.");
            }else{
                System.out.println("Given number is not a prime number.");
            }}
        }while(check == 1);
      
    }
    
}
