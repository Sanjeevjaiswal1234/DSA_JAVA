package Assignment2;
import java.util.Arrays;
public class Q71 {
     public static void main(String[] args) {
		 int [] a = {  12, 23, 8, 21, 14, 9 , 12 , 15 };
		  bubbleSort(a);
		  System.out.println(Arrays.toString(a));
	}
     public static  void  bubbleSort(int [] a) {
    	     int n = a.length-1;
    	     for(int i =0;i<n;i++) {
    	    	 int count =0;
    	    	 for(int j =0;j<n-i;j++) {
    	    		 if(a[j]>a[j+1]) {
    	    			 int temp = a[j];
    	    			 a[j] =a[j+1];
    	    			 a[j+1] =temp;
    	    			 count=1;
    	    		 }
    	    	 }
    	    	 if(count==0)
    	    		 return;
    	     }
     }
}
