// Merge two array in to  single array

package Assignment2;

import java.util.Arrays;

public class Q74 {
     public static void main(String[] args) {
		 int [] a = { 1,3,5};
		 int [] b = { 2,4,6,8,10};
		 
		 int []  mergeArray = mergeTwoArray( a , b);
		 System.out.print(Arrays.toString(mergeArray));

		 
	}
     public static int [] mergeTwoArray(int []a ,int [] b) {
    	 int [] merge = new int [a.length + b.length];
    	 int i = 0; int j = 0;
    	 for(int k =0;k<merge.length;k++) {
    		 if(k<a.length)
    			 merge[k] = a[i++];
    		 else
    			 merge[k] = b[j++];
    		 
    	 }
    	 return merge;
     }
     
}
