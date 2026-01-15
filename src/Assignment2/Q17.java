package Assignment2;

public class Q17 {

	public static void main(String[] args) {
		int [] a = { 10, 20 ,30, 40 ,50 , 60, 70 };
		int k =3;
		int val = 35;
		for(int x : a) {
			System.out.print(x+ " ");
		}
		System.out.println("=========");
	 	a = insert(a,k, val);
		for(int x : a) {
			System.out.print(x+" ");
		}
		
	}
	public static int [] insert (int [] a ,int k, int val) {
		if(k<0 || k>=a.length) {
			System.out.println("Index is out of range");
			return a;
		}
		int [] b = new int[a.length+1];
		b[k] =val;
		for(int i=0; i<b.length; i++) {
			if(i<k)
				b[i] = a[i];
			else if (i>k)
				b[i] = a[i-1];
		}
		return b;
	}

}
