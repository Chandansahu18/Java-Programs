import java.util.*;

public class arraysInJava {

    public static void main(String[] args) {
        
        //This is a basic example of array
        // int arr[] = new int[3];
        // arr[0] = 3;
        // arr[1] = 5;
        // arr[2] = 6;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        
        //This is another basic example of an array
        // int arr[] = {1,2,3};
        // for(int i=0;i<3;i++){
        // System.out.println(arr[i]);
        // }
        
        //This array will take input from the user and print the values.
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of array: ");
    //     int size = sc.nextInt();
    //     int arr[] = new int[size];
    //     for(int i=0;i<size;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println("Elements in the array are: ");
    //     for(int i=0;i<size;i++){
    //         System.out.println(arr[i]);
    //     }

          //This array will take input from the user and find the value at a particular index.
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the size of array: ");
          int size = sc.nextInt();
          int arr[] = new int[size];
          System.out.print("Enter the elements of array: ");
          //input values in the array
          for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
          }
          System.out.println("Elements of the array are: ");
          //output values of array
          for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
          }
          System.out.println();
          System.out.print("Enter the element to be searched: ");
          int search = sc.nextInt();
          //traverse the array
          for(int i=0;i<size;i++){
            if(search == arr[i]){
              System.out.println("Element is found at index: "+i);
            }
          }
          

     }
    

}
