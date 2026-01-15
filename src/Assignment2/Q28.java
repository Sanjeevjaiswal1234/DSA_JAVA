package Assignment2;

public class Q28 {

	public static void main(String[] args) {
		int [] a= { 7 ,0, 2, 6, 0, 4};
		for(int x :a) {
			System.out.print(x+" ");
		}
		System.out.println();
		shiftZero(a);
		for(int x :a) {
			System.out.print(x+" ");
		}
		
	}
	public static void shiftZero(int [] a) {
		for(int i =0, j=0; j<a.length;j++) {
			if(a[j]!=0) {
				if(i!=j) {
					a[i] = a[j];
					a[j] =0;
				}
				i++;
			}
		}
	}

}
