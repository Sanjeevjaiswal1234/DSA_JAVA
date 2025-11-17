import java.util.Scanner;
class ReverseMatrix{
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
               System.out.println("=====Before reverse The array========");
                printElement(a);

                 reverseRows(a);
               System.out.println("=====After reverse The array========");

                 printElement(a);
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

            public static void reverseRows(int [][] a){
             int rows = a.length;
             for(int i=0;i<a.length;i++){
                 int [] row = a[i];
                        reverse(row);
          }
      }
           public static void reverse(int []a){ 
             
               int start=0;  int end=a.length-1;
                while(start<end){
                  int temp = a[start];
                  a[start]=a[end];
                  a[end] = temp;
                  start++;
                  end--;
          }
       }
}
