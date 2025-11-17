import java.util.Scanner;

class TransposeMatrix{
             public static void main(String [] args ){
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the no of rows :");
                 int rows = sc.nextInt();
                 System.out.println("Enter the no of Columns :");
                 int columns = sc.nextInt();
          
                 int [] [] a = new int[rows][columns];
           
         
          for(int i=0;i<rows;i++){
              for(int j =0;j<columns;j++){
              System.out.print("Enter The Element at ("+i+" ,"+j+") :");
                         a[i][j] = sc.nextInt();
            }
        }
               System.out.println("====Before Transpose the Array====");
               printElement(a);
               System.out.println("====After Transpose the Array====");

               int [] [] b=  transpose(a);
               printElement(b);
     }
             public static void printElement(int [] [] a){
             int rows = a.length;
             int columns = a[0].length;

             for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                System.out.print(a[i][j]+ "\t");
              }  
            System.out.println(); 
        } 
     }

             public static int[][] transpose(int [] [] a){
       
              int rows = a.length;
              int column = a[0].length;
              int [] [] b = new int [column][rows];

                 for(int i=0;i<rows;i++){
                    for(int j=0;j<column;j++){
                     b[j][i] = a[i][j];
                 }
             }
          
           return b;
        }
}
