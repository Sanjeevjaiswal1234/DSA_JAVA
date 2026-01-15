//count all even elements from array.
package Assignment1;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n = {17,20 ,35 ,40,50};
		 int count = 0;
	      for(int i=0;i<n.length;i++) {
	    	  
	    	  if(n[i]%2==0) {
	    	  count++;   
	      }
	    	  
	   }
	      System.out.println("Total even Element :"+count);
  }
}