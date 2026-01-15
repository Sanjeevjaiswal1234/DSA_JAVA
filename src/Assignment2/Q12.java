package Assignment2;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = { 10, 20 ,30 ,40 ,50 ,60 ,70};
		int x= 0;
		int y = a.length/2;
		int u = a.length-1;
		int v = (a.length/2)+1;
		reverseFirstHalfArray(a , x , y);
		reverseSecondHalfArray( a , v , u);
		for(int i=0 ; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
	}
	public static void reverseFirstHalfArray(int [] a ,int x , int y) {
		int start = 0 ; int end = y;
		while (start<end ) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++; end--;
		}
	}
	public static void reverseSecondHalfArray(int [] a ,int v , int u) {
		int start = v ; int end = u;
		while (start<end ) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++; end--;
		}
	}
	
}
