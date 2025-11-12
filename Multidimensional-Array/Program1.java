import java.util.Scanner;
class Program1{
              
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
               System.out.println("====All the array Elements are Below====");
               printElement(a);
    }
             public static void printElement(int [] [] a){
             int rows = a.length;
             int columns = a[0].length;

             for(int i =0;i<rows;i++){
                for(int j=0;j<columns;j++){
                System.out.print(a[i][j]+ "\t");
  
              }  
            System.out.println(); 
        } 
      }

}
