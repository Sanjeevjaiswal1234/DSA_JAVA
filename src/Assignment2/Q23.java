package Assignment2;

public class Q23 {

	public static void main(String[] args) {
		
		int []a  =  {7, 4,3, 2, 5, 1, 0};
		
		int num=findMissingElement(a);
		System.out.println("the missing number is :"+num);	

	}
         public static int findMissingElement(int[] a) {
        	 
        	 int n = a.length;
        	 
        	 int res = n*(n+1)/2;
        	 
        	 int sum=0;
        	for(int x:a) {
        		sum =sum+x;
        		
        	}
        	 
        	 return res -sum;
         }
}
