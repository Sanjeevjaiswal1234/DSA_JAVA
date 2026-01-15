//print and count all three-digit numbers from array.
package Assignment1;

public class Q5 {

	public static void main(String[] args) {
		  int[] nums = {10 ,289,3425,45,678,567,10,860,999};
	       int count = 0;
		  for(int i=0;i<nums.length;i++) {
			  if(nums[i]>99 && nums[i]<1000) {
				  System.out.print(nums[i]+" ");
			  count++;
			  }
		  }
		  System.out.println("\nAll three digit NUmber : "+count);
		  
		          
	}

}
