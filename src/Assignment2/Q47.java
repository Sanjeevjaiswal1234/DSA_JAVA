package Assignment2;

import java.util.Arrays;


public class Q47 {
	public static void main(String[] args) {
		//int [] a = { 1,2,2,1,5,7,1,7};
		int [] a = { 8,8,5,7,8,7,10,8,8};
		
		int[] res = removeDuplicateArray(a);
		 System.out.println(Arrays.toString(res));  
		
		}
	public static int [] removeDuplicateArray(int [] a) {
		
			 
		int n = a.length-1;
	   for(int i =0; i<=n;i++) {
//			   
			   for( int j =i+1;j<=n;j++) {
				   if(a[i] ==a[j]) {
					  				  
					   a[j] = a[n];
					   n--;
			           j--;
			   }			   }
      
    	     
		   }
		   int [] b = new int[n+1];
	       for(int i =0;i<=n;i++) {
	    	   b[i] =a[i];
			 
       }     
	
	return b;	
		
		
	} 
		/*
		int max=a[0]; 
		 int min =a[0];
		 for(int x :a) {
			 if(x>max) 
				 max =x;
				 if(x<min)
					 min =x;
			 
		 }

		 int [] freq  = new int [max-min+1];
		 for(int i =0;i<a.length;i++) {
			 
			 freq[a[i]-min]++;
		 }
		 for(int i =0;i<freq.length;i++) {
			 if(freq[i]>0)
             System.out.print((i+min)+" ");
		 }
		 return freq;
	}
	*/
	}

