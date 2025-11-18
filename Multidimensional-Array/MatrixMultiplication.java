import java.util.Scanner;
class MatrixMultiplication{
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
              
                 int [][]res =   multiply(a,b);
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
             public static int [] [] multiply(int [][]a,int[][] b){
                 int row1=a.length,col1=a[0].length;
                 int row2=b.length,col2=b[0].length;
                 
                 if(col1!=row2){
                 System.out.println("Matrix Multiplication is not possible ");
                  
                 return new int[][]{};
          }
                 int [][] c= new int[row1][col2];
                 for(int i=0;i<row1;i++){
                 for(int j=0;j<col2;j++){
                 for(int k=0;k<col1;k++){
                 c[i][j] = c[i][j] + a[i][k]*b[k][j];
               }
             }
          }
              return c;
     }
}
