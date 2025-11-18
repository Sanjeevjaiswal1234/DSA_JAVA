import java.util.Scanner;
class SortColumn{
                   public static void main(String [] args){
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
             System.out.println("==========Before sort the rows=========");
             printElement( a);
             int [][]c = transpose(a);
             System.out.println("==========After transpose=========");
             printElement(c);
             
            
             sortColumn( c);
             System.out.println("========== sort the rows=========");
             printElement( c);
             int [] [] d=transpose(c);
             System.out.println("==========Final result sort column from again the transpose matrix=========");
             printElement( d);
 


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

             public static void sortColumn(int [][] c){
             for(int i=0;i<c.length;i++){
             bubbleSort(c[i]);
         }
      }
            
             public static void bubbleSort(int [] c){
                int n=c.length-1;
                  for(int i=0;i<n;i++){
                    for(int j=0;j<n-i;j++){
                         if(c[j]>c[j+1]){
                        int temp=c[j];
                         c[j] = c[j+1];
                         c[j+1] = temp;
                  }                           
               }
             }
          }   
}
