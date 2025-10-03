              // Implementation without Recursion!
import java.util.Scanner;
class BinarySearch{
         public static void main(String [] args){
                int [] a={10,20,30,40,50,60,70,80};
                for(int x:a){
                System.out.print(x+" ");
                }
                System.out.println("");

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the key value");
                int key=sc.nextInt();
            int res = binarySearch(a,key);
            System.out.println(key+" position is :"+res);
         } 
                public static int binarySearch(int []a , int key){
                
                int low =0; int high=a.length-1;
                while(low<=high){
                int mid = low + high-low/2;
                
                  if(a[mid]==key)
                  return mid;
                  else if(a[mid]>key)
                   high=mid-1;
                  else if(a[mid]<key)
                  low= mid+1;
                }
              return -1;
             }
}
