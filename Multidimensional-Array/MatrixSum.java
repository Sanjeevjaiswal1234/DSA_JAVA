import java.util.Scanner;
class MatrixSum{
                 public static void main(String [] args ){
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the no of rows :");
                 int rows = sc.nextInt();
                 System.out.println("Enter the no of Columns :");
                 int columns = sc.nextInt();
          
                 int [][] a = new int[rows][columns];
                 int [][] b = new int[rows][columns];
           
                 System.out.println("============Enter the element for First matrix==========");

                 for(int i=0;i<rows;i++){
                 for(int j =0;j<columns;j++){
                 System.out.print("Enter The Element at ("+i+" ,"+j+") :");
                         a[i][j] = sc.nextInt();
            }
        }
               System.out.println("==============First Matrix==============");
                     printElement(a);

              System.out.println("============Enter the element for second matrix==========");
              for(int i=0;i<rows;i++){
              for(int j =0;j<columns;j++){
              System.out.print("Enter The Element at ("+i+" ,"+j+") :");
                         b[i][j] = sc.nextInt();
            }
        }
            
             System.out.println("==============Second Matrix==============");

             printElement(b);
              
                 int [][]res =   sum(a,b);
             System.out.println("==============Sum of two Matrix==============");

                printElement(res);
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
             public static int [] [] sum(int [][]a,int[][] b){
                 int row1=a.length,col1=a[0].length;
                 int row2=b.length,col2=b[0].length;
                 if(row1!=row2 || col1!=col2){
                System.out.println("Sum is not Possible");
               return new int[0][0];
           }
                 int [] [] c = new int[row1][row2];
                 for(int i =0;i<row1;i++){
                   for(int j=0; j<col1;j++){
                  c[i][j] = a[i][j]+b[i][j];
              }
          }
             return c;
      }
}
