package Assignment2;

public class Q50 {

	public static void main(String[] args) {
		//int [] a = { 1,2,2,1,5,7,1,7};
		int [] a = { 8,8,5,7,8,7,10,8,8,5,10 ,11};
		
		printMoreThanOneElement(a);

		}
		public static void printMoreThanOneElement(int [] a) {
		
		   int n = a.length-1;
		   for(int i =0; i<=n;i++) {
			   int count =1;
			   for( int j =i+1;j<=n;j++) {
				   if(a[i] == a[j]) {
					   count++;
				   a[j] = a[n];
						   n--;
				           j--;
				   }
			   }
			   if(count > 1)
			   System.out.println(a[i]+" ");
			   
		   }
		   System.out.println("That number are more than one Element");
		} 

}
