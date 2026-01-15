package Assignment2;

public class Q29 {

	public static void main(String[] args) {
		int [] a = {0 ,1,1,0,0,1,0,0};
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println("=============");
		shiftZero(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	public static void shiftZero(int [] a) {
		int zero = 0;
		for(int x : a) {
			if(x==0)
				zero++;
		}
		for(int i =0;i<a.length;i++) {
			if(i<zero)
				a[i] =0;
			else 
				a[i] =1;
		}
	}

}
