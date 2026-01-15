package Assignment2;

public class Q33 {

	public static void main(String[] args) {
	int [] a = { 23, 2 , 4, 7, 8, 11, 24, 17 ,45,37};
             int totalsum = getSumOfPrimeNumber(a);
             System.out.println("Total sum of prime number is :" +totalsum);
	}
	public static int getSumOfPrimeNumber(int [] a) {
		
		  int sum = 0;  
		  for(int x:a) {
			  
             if(isPrime(x)) {
          	   System.out.print(x+ " ");
          	   sum = sum +x;
             }         
	   }
		  System.out.println();
		  return sum;
	}
	public static Boolean isPrime(int n) {
		int count =0;
		if(n<2)
			return false;
		if(n%2==0)
			return false ;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false ;
		}
		return true;
	}

}
