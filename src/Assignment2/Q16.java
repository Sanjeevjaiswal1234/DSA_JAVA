package Assignment2;

public class Q16 {

	public static void main(String[] args) {
		int [] a = { 10, 20 ,30, 40 ,50 , 60, 70 };
		int k =3;
		for(int x : a) {
			System.out.print(x+ " ");
		}
		System.out.println("=========");
	 	a = remove(a,k);
		for(int x : a) {
			System.out.print(x+" ");
		}
		
		
		

	}
	
	public static int [] remove(int [] a , int k) {
		if(k<0 || k>=a.length) {
			System.out.println("index is outOfBoundOfException");
			return a;
		}
		int [] b = new int[a.length-1];
		for(int i=0;i<b.length;i++) {
			if(i<k)
				b[i] =a[i];
			else
				b[i] = a[i+1];
		}
		return b;
	}

}
