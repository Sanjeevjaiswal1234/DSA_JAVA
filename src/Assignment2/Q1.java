/**
 * Q:1
Print biggest element , smallest
elements and their difference from the
given array.
 */
package Assignment2;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10 ,20 ,30 , 40, 50,60,80 };
		getDifferenceBiggestAndSmallest( a);
	}
	
	public static void getDifferenceBiggestAndSmallest(int [] a) {
		int big = a[0];
		int small = a[0];
		for(int p :a) {
			if(p>big)
				big=p;
			if(p<small)
				small =p;
			
		}
		System.out.println("Biggest number is :"+big);
		System.out.println("smallest number is :"+small);
		System.out.println("Difference of biggest and smallest  is :"+(big-small));
		
		
		
	}

}

