/**WAJP to print and count all the elements of array
   which are bigger than average value.**/
package Assignment1;

public class Q8 {

	public static void main(String[] args) {
		
		int [] nums = {10 ,289,3425,45,678,567,10,860,999};
	      double  sum=0;
	      int count = 0;
	      
		  for(int i =0;i<nums.length;i++) {
			  sum += nums[i];
			  
	   }
		  System.out.println("Sum :"+sum);	   
		  double avg = sum/nums.length;
		  System.out.println("avg :"+avg);
		  for(int i=0; i<nums.length;i++) {
		  if( nums[i] > avg) {
			  System.out.print(nums[i]+ " ");
			  count++;
		    }
		  }
		  System.out.println("\n Total  element whose greater then avg value:" +count);
		  
		  
		  
	}

}
