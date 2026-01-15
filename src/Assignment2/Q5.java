package Assignment2;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = { 2, 5 , 4 , 3, 6 };
       getResultantArray(a);
	}
	public static void getResultantArray(int [] a) {
		
		int product  = 1;
		for(int x : a) 
			 product  = product * x;
		  
		for(int i =0 ; i<=a.length-1;i++) {
		int	res = product/a[i];
			System.out.println(res);
		    }
		
		}
}
