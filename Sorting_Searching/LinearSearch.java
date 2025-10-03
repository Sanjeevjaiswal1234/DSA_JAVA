 import java.util.Scanner;
class LinearSearch{
     
               public static void main(String [] args){
                  int [] a={ 12,21, 4, 15,31 ,9,11, 16};
                    for(int x:a){
                      System.out.print(x+" ");
                    }
                    System.out.println("");
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Enter the key value");
                    int key=sc.nextInt();
             int res= LinearSearch( a,key);
             System.out.println(key+" position is : "+res);
                   
          }
             public static int LinearSearch(int []a , int key){
                   int n =a.length-1;
                   
                   for(int i=0;i<=n;i++){
                   if(a[i]==key)
                    return i;
                  }
           return -1;
             }
                   
 }
