import java.util.*;
public class arrayInJava_revisionPractice {

    public void arrIndex(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == search){
               System.out.println("Element is found at index: "+i);
               found = true;
            }
        }
        if(!found)
        System.out.println("-1");
    }

//    public void arrMax(){
//     int Max = 0;
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the size of array: ");
//     int size = sc.nextInt();
//     int[] arr = new int[size];
//     System.out.print("Enter the elements  in the array: ");
//     for(int i=0;i<arr.length;i++){
//         arr[i] = sc.nextInt(); //Taking input 
//     } 
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]>Max){
//          Max = arr[i];
//         }
//     }
//         System.out.println();
//         System.out.println("Max element is: "+Max);
//     }

   

    // public void arrSum(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size in the array: ");
    //     int size = sc.nextInt();
    //     int[] arr = new int[size];
    //     int arrSum = 0;
    //     System.out.print("Enter the elements in the array: ");
    //     for(int i=0;i<arr.length;i++){
    //         arr[i] = sc.nextInt();//taking input
    //     }
    //     System.out.print("Array elements are: ");
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //         arrSum += arr[i]; 
    //     }
    //     System.out.println();
    //     System.out.println("Sum of elements are: "+arrSum);

    // }
    // public void multiDemensionArray(){

    //  Scanner sc  = new Scanner(System.in);
    //  System.out.println("Enter the size of 2-Demensional array");
    //  System.out.print("Enter rows: ");
    //  int row = sc.nextInt();
    //  System.out.print("Enter columns: ");
    //  int column = sc.nextInt();
    //  int arr[][] = new int[row][column];
    //  System.out.print("Enter elements: ");
    //  for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[i].length;j++){
    //          arr[i][j] = sc.nextInt(); //Taking input in Rows & Columns
    //     }
    //     System.out.println();
    // }
    
    // System.out.println("Elements in the 2-Demensional array are: ");
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[i].length;j++){
    //         System.out.print(arr[i][j]+" "); // output
    //     }
    //     System.out.println();
    // }

    
    // }
    // public void oneDemensionArray(){

    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of one demension array: ");
    //     int size = sc.nextInt();
    //     int[] arr = new int[size];
    //     System.out.println("Enter the elements in the array: ");
    //     for(int i=0;i<size;i++){
    //         arr [i] = sc.nextInt(); //Taking input in the array
    //     }
    //     System.out.println("Array is: ");
    //     for(int i=0;i<size;i++){
    //         System.out.print(arr[i]+" "); //Output the value of array 
    //     }
    // }
    public static void main(String[] args) {
        
        arrayInJava_revisionPractice object = new arrayInJava_revisionPractice();
        //object.oneDemensionArray();
        //object.multiDemensionArray();
        //object.arrSum();
        //object.arrMax();
        object.arrIndex();
    }
}
