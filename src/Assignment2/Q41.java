package Assignment2;

public class Q41 {

	public static void main(String[] args) {
		int [] a= { 80, 80, 43,50 , 38, 63, 58, 80};
		printBiggestAndSecondBiggest( a);
		
	}
	public static void printBiggestAndSecondBiggest(int [] a) {
		int biggest = Integer.MIN_VALUE;
		int secondbiggest = Integer.MIN_VALUE;
		for(int x :a) {
			if(x>biggest) {
				secondbiggest = biggest;
				biggest =x;
			}
			else if(x>secondbiggest && x!=biggest)
				secondbiggest = x;
		}
		System.out.println("Biggest is : "+biggest);
		System.out.println("Secondbiggest is : "+secondbiggest);


	}

}
