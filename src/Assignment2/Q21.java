package Assignment2;

public class Q21 {

	public static void main(String[] args) {
		int [] a = { 10 , 20 ,30 , 40 , 50 , 60 ,70};
		for(int i=0 ; i<=a.length-1; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		  leftArray(a);
		  for(int i=0 ; i<=a.length-1; i++) {
				System.out.print(a[i]+ " ");
			}

		}
	//left rotation 
		public static void leftArray(int [] a) {
			int temp = a[0];
			for(int i=1;i<a.length;i++) {
				a[i-1] = a[i];
				
			}
			a[a.length-1] = temp;
			

			
		}
		

	}


