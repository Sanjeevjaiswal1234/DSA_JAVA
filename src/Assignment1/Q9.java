//Print sum of all even elements from array.
package Assignment1;

public class Q9 {

	public static void main(String[] args) {
		int [] nums = {10 ,13,34,45,67,57,10,86,99};
	      int sum=0;
		  for(int i=0;i<nums.length;i++) {
			  if(nums[i]%2==0)
			   sum += nums[i];
			  
		  }
		  System.out.println("Sum :" +sum);
           
	}

}
