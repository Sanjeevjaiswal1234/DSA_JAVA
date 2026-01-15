package Assignment2;

public class Q54 {
	public static void main(String[] args) {
		//int [] a = { 1,2,2,1,5,7,1,7};
		int [] a = { 8,8,5,7,8,7,10,8,8,5,10 ,11,8,7,7,7,7};
		
	int res = 	printSmalleElementInSameFrequency(a);
	System.out.println("element is :"+res);

	}
	public static int  printSmalleElementInSameFrequency(int [] a) {
//	 int freq =1;
//	 int elem = a[0];
//	   int n = a.length-1;
//	   for(int i =0; i<=n;i++) {
//		   int count =1;
//		   for( int j =i+1;j<=n;j++) {
//			   if(a[i] == a[j]) {
//				   count++;
//			   a[j] = a[n];
//					   n--;
//			           j--;
//			   }
//		   }
//		   if(count>freq) {
//			   freq=count;
//			   elem =a[i];
//		   
//		   } else if (count == freq && a[i] < elem) {
//			    // if same frequency but smaller element, update
//			    elem = a[i];
//			}
//		  
//	   }
//	   System.out.println(elem+" Frequency is : "+freq);
//	 return elem; 
		
		int max=a[0]; 
		 int min =a[0];
		 for(int x :a) {
			 if(x>max) 
				 max =x;
				 if(x<min)
					 min =x;
			 
		 }
		
	         int elem = a[0];
		 int [] freq  = new int [max-min+1];
		 for(int i =0;i<a.length;i++) {
			 
			 freq[a[i]-min]++;
		 }
		 int maxFreq=freq[0];
		 for(int i =0;i<freq.length;i++) {
			 if(freq[i]>maxFreq) {
            maxFreq= freq[i];
			 elem= i+min;
		 }
		 
	
	} 
		 return elem;
	}
}  
