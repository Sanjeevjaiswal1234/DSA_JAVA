package Assignment2;

public class Q53 {
	public static void main(String[] args) {
		//int [] a = { 1,2,2,1,5,7,1,7};
		int [] a = { 8,8,5,7,8,7,10,8,5,8,10 ,11,7,7,7,7};
		
		printElementAndFrequencyWhoMax(a);

		}
		public static void printElementAndFrequencyWhoMax(int [] a) {
		 int freq =1;
		 int elem = a[0];
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
			   if(count>freq) {
				   freq=count;
				   elem =a[i];

			   } 
			  
		   }
		   System.out.println("Highest Frequency is   "+elem+ " "
			   		+ "and frequency is :"+freq);
		  
		} 
}
