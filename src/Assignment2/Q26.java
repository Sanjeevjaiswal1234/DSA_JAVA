package Assignment2;

public class Q26 {
	
	public static void main(String[] args) {
		
		int [] a = {2, 3, 10, 11, 12};
		
		if(isStrictlyIncreasing(a)) {
			System.out.println("Strictly increasing");

		}
		else
			System.out.println("Not Strictly increasing");

	}
	
	public static boolean isStrictlyIncreasing(int []a ) {
		
		
		for(int i=1;i<a.length;i++) {
			
			if(!(a[i]>a[i-1]))
				return false;
		}
			
		return true;
	}

}
