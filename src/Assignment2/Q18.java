package Assignment2;

public class Q18 {

	public static void main(String[] args) {
		
	int [] a = { 10 , 20 ,30 , 40 , 50 , 60 ,70};
	for(int i=0 ; i<=a.length-1; i++) {
		System.out.print(a[i]+ " ");
	}
	System.out.println();
	  rotateArray(a);
	  for(int i=0 ; i<=a.length-1; i++) {
			System.out.print(a[i]+ " ");
		}

	}
	//right rotation
	public static void rotateArray(int [] a) {
		int temp = a[a.length-1];
		for(int i=a.length-2;i>=0;i--) {
			a[i+1] = a[i];
			
		}
		a[0] = temp;
		

		
	}
	

}

