public class advancePatterns_in_Java {
    
    public static void main(String[] args) {
        
        //Practice 01
        //Upper half
        // for(int i = 1; i<=4; i++){
        //     //first part
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     //for spaces
        //     for(int j = 1;j<=2*(4-i);j++){
        //      System.out.print(" ");
        //     }

        //     //second part
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //Lower half
        // for(int i = 4; i>=1; i--){
        //     //first part
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     //for spaces
        //     for(int j = 1;j<=2*(4-i);j++){
        //      System.out.print(" ");
        //     }

        //     //second part
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Practice 02
        // for(int i = 1;i<=5;i++){
        //     for(int j = 1;j<=5-i;j++){
        //        System.out.print(" ");
        //      }
        //      for(int j = 1;j<=5;j++){
        //        System.out.print("*");
        //      }
        //      System.out.println();
        //   }

          //Practice 03
        //   for(int i = 1; i<=5; i++){
        //     for(int j = 1;j<=5-i;j++){
        //       System.out.print(" ");
        //     }
        //        //This loop will print values of row number equal to row number times.
        //        for(int j = 1;j<=i;j++){
        //            System.out.print(i+" ");
        //        }
        //        System.out.println();
        //    }
            
           //Practice 04
              //This will print a palindrome triangle
    //  for(int i = 1; i<=5;i++){
    //      for(int j = 1;j<=5-i;j++){
    //          System.out.print(" ");
    //      }
    //     //first part
    //     for(int j = i;j>=1;j--){
    //         System.out.print(j);
    //     }

    //     //Second part
    //     for(int j = 2;j<=i;j++){
    //       System.out.print(j);
    //   }    
    //     System.out.println();
    //  }

    
        //Problem 05
       //Upper part
       for(int i=1;i<=4;i++){
        //spaces
        for(int j=1;j<=4-i;j++){
          System.out.print(" ");
        }
  
        for(int j=1;j<=2*i-1;j++){
          System.out.print("*");
        }
        System.out.println();
      }
      //Lower part
      for(int i=4;i>=1;i--){
        //spaces
        for(int j=1;j<=4-i;j++){
          System.out.print(" ");
        }
        
        for(int j=1;j<=2*i-1;j++){
          System.out.print("*");
        }
        System.out.println();
      }
  
    }
}
