package Assignment2;

public class Q27 {

	public static void main(String[] args) {

      int [] a = { 2,7,7,8,9,11};
      
      if(isSortedArray(a)) {
    	  System.out.println("Array is sorted ");

      }
      else {
    	  System.out.println("Array is not sorted");
      }

	}
	 public static Boolean isSortedArray( int [] a) {
		 
		 for(int i=1;i<a.length;i++) {
			 
			 if(a[i]<a[i-1])
				 return false;
				 
		 }
		
		  return true;
	 }

}
