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
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i;
        for(i=0;i<size;i++);{
            arr[i] = sc.nextInt();
        }
        for(i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }

}
