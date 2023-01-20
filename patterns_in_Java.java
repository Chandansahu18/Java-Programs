public class patterns_in_Java{

    public static void main(String[] args) {
        
        //Practice 01
        // for(int i = 1; i<=5;i++){
        //     for(int j = 1;j<=5;j++){
        //         System.out.print("*");//This will print * till the end of condition,i.e, j<=5.
        //     }
        //     System.out.println("*");//This will print an extra * after execution of inner loop 
        // }

        //Practice 02
        // for(int i = 1; i<=6;i++){
        //     for(int j = 1; j<=5;j++){
        //         if(i == 1 || j == 1 || i == 6 || j == 5){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Practice 03
        // for(int i = 1; i<=5; i++){
        //    for(int j = 1; j<=i; j++){
        //     System.out.print("*");
        //    }
        //    System.out.println();

        // }
        
        //Practice 04
        // for(int i = 5;i>=1;i--){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Practice 05
        // for(int i = 1;i<=5;i++){
        //     for(int j = 1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Practice 06
        // for(int i =1; i<=5;i++){
        //     for(int j = 1; j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //Practice 07
        //  for(int i = 5; i>=1;i--){
        //     for(int j = 1; j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //  }
        //Practice 08
        // int num = 1;
        // for(int i = 1;i<=5;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        //Practice 09
        for(int i = 1;i<=5;i++){
            for(int j = 1; j<=i;j++){
                int sum = i+j;//Checking the value of index by adding rows and column position in the matrix.
                //if value of index is even then it will print 1 else 0.
                if(sum%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }



    }
}

