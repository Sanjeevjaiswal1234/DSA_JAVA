package Assignment2;
import java.util.Arrays;

public class Q75 {

	public static void main(String[] args) {
	  int [] a = {20 , 30 , 50};
	  int []  b = { 2,4,6,8,10};
	  int [] array = mergeZigZagArray(a , b);
	  System.out.println(Arrays.toString(array));


	}
	public static int [] mergeZigZagArray(int []a ,int [] b) {
   	 int [] merge = new int [a.length + b.length];
   	 int i =0; int j =0; int ind=0;
   	 for(int k =0;k<merge.length;k++) {
   		 while(i<a.length && j<b.length) {
//   			 if(ind%2==0)
   				 merge[ind++] = a[i++];
//   			 else 
   				 merge[ind++] = b[j++];
   		 }
   		 while(i<a.length)
   			 merge[ind++] = a[i++];
   		 while(j<b.length)
   			 merge[ind++] = b[j++];
   		 
   	 }
   	 return merge;
    }
    

}
