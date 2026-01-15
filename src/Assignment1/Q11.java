package Assignment1;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {10 ,13,34,45,67,57,10,86,99};
	      int sum=0;
		  for(int i=0;i<nums.length;i++) {
			  if(nums[i]%3==0)
			   sum += nums[i];
			  
		  }
		  System.out.println("Sum :" +sum);
	}

}
