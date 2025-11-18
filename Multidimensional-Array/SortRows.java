import java.util.Scanner;
class SortRows{
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
             System.out.println("==========After sort the rows=========");
              sortRows( a);
             printElement( a);


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
             public static void sortRows(int [][] a){
             for(int i=0;i<a.length;i++){
             bubbleSort(a[i]);
         }
      }
             public static void bubbleSort(int [] a){
                int n=a.length-1;
                  for(int i=0;i<n;i++){
                    for(int j=0;j<n-i;j++){
                         if(a[j]>a[j+1]){
                        int temp=a[j];
                         a[j] = a[j+1];
                         a[j+1] = temp;
                  }                           
               }
             }
          }   
}
