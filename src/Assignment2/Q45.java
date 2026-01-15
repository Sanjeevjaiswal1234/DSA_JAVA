package Assignment2;

public class Q45 {

	public static void main(String[] args) {
	//int [] a = { 1,2,2,1,5,7,1,7};
	int [] a = { 8,8,5,7,8,7,10,8,8};
	
	printFrequency(a);

	}
	public static void printFrequency(int [] a) {
	
	   int n = a.length-1;
	   for(int i =0; i<=n;i++) {
		   int count =1;
		   for( int j =i+1;j<=n;j++) {
			   if(a[i] ==a[j]) {
				   count++;
			   a[j] = a[n];
					   n--;
			           j--;
			   }
		   }
       System.out.println(a[i]+ " is :" +count+" Times ");
	   }
	   
		// now another method  n complexity
		// frequency print in array 
//		 int max=a[0]; 
//		 int min =a[0];
//		 for(int x :a) {
//			 if(x>max) 
//				 max =x;
//				 if(x<min)
//					 min =x;
//			 
//		 }
//		 
//			 int [] freq  = new int [max-min+1];
//			 for(int i =0;i<a.length;i++) {
//				 
//				 freq[a[i]-min]++;
//			 }
//			 for(int i =0;i<freq.length;i++) {
//				 if(freq[i]>0)
//	System.out.println((i+min)+" is "+freq[i]+" times");
//					 
//			 };
//			 
			                       
		 
	} 

}
