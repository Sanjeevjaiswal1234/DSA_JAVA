package Assignment2;

public class Q42 {

	public static void main(String[] args) {
		int [] a= { 80, 80, 43,50 , 38, 63, 58, 80};
		printsmallestAndSecondsmallest( a);

	}
	public static void printsmallestAndSecondsmallest(int [] a) {
		int smallest = a[0];
		int secondsmallest = a[0];
		for(int x :a) {
			if(x<smallest) {
				secondsmallest = smallest;
				smallest =x;
			}
			else if(x<secondsmallest && x!=smallest)
				secondsmallest = x;
		}
		System.out.println("Smallest Number is : "+smallest);
		System.out.println("Second_smallest Number is : "+secondsmallest);
	}

}
