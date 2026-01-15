package Assignment2;

public class Q59 {
	public static void main(String [] args) {
	int [] a = { 12,3,4,5,6,7,8,9,9};
	
	    if(isUniqueElement(a))
	    	System.out.println("All the Elements in array are unique");
	    else
	    	System.out.println("False");
	    	
	}
	public static Boolean isUniqueElement(int [] a) {
	
	   int n = a.length-1;
	   for(int i =0; i<=n;i++) {
		   int count =1;
		   for( int j =i+1;j<=n;j++) {
			   if(a[i] == a[j]) {
				   count++;
			   a[j] = a[n];
					   n--;
			           j--;
			   }
		   }
		   if(count>1)
		   return false;
	   }
	   return true;
	} 
}
