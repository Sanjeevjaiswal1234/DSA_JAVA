
package Assignment2;

public class Q4 {
	public static void main(String [] args ) {
	int [] a = { 2, 5 , 4 , 3, 6 };
	getResultantArray(a);
	}
	public static void getResultantArray(int [] a) {
		
	int sum = 0;
	for(int x : a) 
		 sum = sum +x;
	  
	for(int i =0 ; i<=a.length-1;i++) {
		int res = sum -a[i];
		System.out.println(res);
	    }
	
	}
	
}