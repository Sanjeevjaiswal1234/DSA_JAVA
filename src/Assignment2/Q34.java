package Assignment2;

public class Q34 {

	public static void main(String[] args) {
		int [] a = { 101, 21 , 451, 765, 86, 141, 24, 17 ,45,37};
		int total=printAndCountPalindromNumber( a);
		System.out.println("The total palindrom number in the array is :"+total);
	}
	public static int printAndCountPalindromNumber(int [] a) {
		int count =0;
		 for(int x : a) {
			 
			 if(isPalindrom(x)) {
				 System.out.print(x+" ");
				 count++;
			 }
			
			 
		 }
		 System.out.println();
		 return count++;
	}
	    public static Boolean isPalindrom(int x) {
	    	int orig = x;
	        int rev = 0;
	        while(x>0) {
	         int rem = x%10;
	         rev = 10*rev + rem;
	         x/=10;
	        }
	        return orig==rev;
	    }
	

}
