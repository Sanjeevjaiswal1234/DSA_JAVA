package Assignment2;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] a = { 10 ,20 , 30 , 40 , 30 , 20 , 10};
          
          if(isPalindromicArray(a))
        	  System.out.println("Palindromic Array");
          else
        	  
        	  System.out.println("Not a Palindromic Array");
	}
	public  static Boolean isPalindromicArray(int [] a) {
		int start = 0 ; int end = a.length-1;
		while(start<end) {
			if(a[start]!=a[end]) 
				return false;
			start ++; end--;
					
		}
      return true;
	}

}
