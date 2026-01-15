package Assignment2;

public class Q11 {

	public static void main(String[] args) {
		int [] a = { 10, 20 ,30 ,40 ,50 ,60 ,70};
		reverseArray(a);
		for(int i=0 ; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}

	}
	public static void reverseArray(int [] a) {
		int start = 0 ; int end = a.length-1;
		while (start<end ) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++; end--;
		}
	}

}
