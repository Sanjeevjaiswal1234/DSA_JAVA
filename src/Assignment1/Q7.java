//Print Average of all elements from array.
package Assignment1;

public class Q7 {

	public static void main(String[] args) {
		int  [] nums = {10 ,289,3425,45,678,567,10,860,999};
	      double  sum=0;
		  for(int i=0;i<nums.length;i++) {
			  sum += nums[i];
  
		  }
		  double avg = sum/nums.length;
		  System.out.println("Sum :" +sum);
		  System.out.print("Avg :" +avg);

	}

}
