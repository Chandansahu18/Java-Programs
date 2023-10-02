  Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the size of columns: ");
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];
        System.out.println("Enter the values of rows and columns in the array: ");
        
        //input values in the array
        for(int i=0;i<rows;i++){
              for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
              }
              System.out.println();  
        }
        System.out.println("Values entered in the array are: ");
        
        //output values in the array
        for(int i=0;i<rows;i++){
             for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
             }
             System.out.println();
        }
