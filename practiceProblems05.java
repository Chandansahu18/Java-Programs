public class practiceProblems05 {

    public static void main(String[] args) {
        
             //Problem 01
             //This will print hollow Rhombus
      //         int n = 5;
      //         for(int i=1;i<=n;i++){
      //        //spaces
      //         for(int j=1;j<=n-i;j++){
      //          System.out.print(" ");}

      //       //stars
      //       for(int j=1;j<=n;j++){  
      //            if(i==1 || i==5 || j==1 || j==5){
      //          System.out.print("*");}
      //        else{
      //         System.out.print(" ");}
      //       }
      //     System.out.println();
      // }


             //Problem 02
             //This will print hollow butterfly
             //Upper Part
            //  for(int i= 1;i<=4;i++){
            //   //stars first part
            //   for(int j = 1;j<=i;j++){
            //     if(i==1 || i==2 || j==1 || j==3 || j==4){
            //     System.out.print("*");}
            //     else{
            //       System.out.print(" ");
            //     }
            //   }
            //   //spaces
            //   for(int j=1;j<=2*(4-i);j++){
            //     System.out.print(" ");
            //   }
            //   //stars second part
            //   for(int j = 1;j<=i;j++){
            //     System.out.print("*");
            //   }
            //   System.out.println();
            //  }

            //  //Lower Part
            //  for(int i= 4;i>=1;i--){
            //   //stars first part
            //   for(int j = 1;j<=i;j++){
            //     System.out.print("*");
            //   }
            //   //spaces
            //   for(int j=1;j<=2*(4-i);j++){
            //     System.out.print(" ");
            //   }
            //   //stars second part
            //   for(int j = 1;j<=i;j++){
            //     System.out.print("*");
            //   }
            //   System.out.println();
            //  }

              //Problem 03
              //This will print Half Pyramid
              // for(int i=1;i<=5;i++){
              //   //Space
              //   for(int j=1;j<=5-i;j++){
              //     System.out.print(" ");
              //   }
              //   //Pyramid
              //   for(int j=1;j<=i;j++){
              //     System.out.print(j+" ");
              //   }
                
              //   System.out.println();
              // }

              //Problem 04
              //This will print inverted half pyramid
              for(int i=4;i>=1;i--){
                //Space
                for(int j=1;j<=4-i;j++){
                  System.out.print(" ");
                }
                //inverted half pyramid
                for(int j=1;j<=i;j++){
                  System.out.print(i+" ");
                }
                System.out.println();
              }

}
}

  