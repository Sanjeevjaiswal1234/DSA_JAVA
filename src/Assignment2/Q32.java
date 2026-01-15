package Assignment2;

public class Q32 {

	public static void main(String[] args) {
		int [] a = { 23, 2 , 4, 7, 8, 11, 24, 17 ,45,37};
		int res = printAndCountPrimeNumber(a);
		System.out.println("Total prime number are there :"+res);
	}
	public static int   printAndCountPrimeNumber(int [] a) {
		
			  int count = 0;  
			  for(int x:a) {
				  
                   if(isPrime(x)) {
                	   System.out.print(x+ " ");
                	   count++;
                   }            
		}
			  	System.out.println(" ");
	      return  count ;
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
