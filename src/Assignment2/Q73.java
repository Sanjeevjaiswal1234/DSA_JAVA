package Assignment2;


public class Q73 {

	public static void main(String[] args) {
		    int  [] a = { 12, 9, 21, 7, 11, 10, 23};
		    System.out.println("Before Sorting");

		    for( int x : a) 
		    	    System.out.print(x+" ");
		   System.out.println();

		    InsertionSort( a);
		    System.out.println("After Sorting");
		          
		    for( int x : a) 
	    	    System.out.print(x+" ");
		    

		    
	       }
	      public static void InsertionSort(int [] a) {
	    	  for(int i =1;i<a.length;i++) {
	    		  int key =a[i];
	    		  int j =i-1;
	    		  while(j>=0 && a[j]>key) {
	    			  a[j+1] =a[j];
	    			  j--;
	    		  }
	    		  a[j+1] =key;
	    	  }
	    	  

}
}
