package Assignment2;
import java.util.Arrays;
public class Q72 {

	public static void main(String[] args) {
		int []a = { 12, 32, 9, 8,6,50, 45, 32,65,34};
		selectionSort( a);
		System.out.println();
		System.out.println(Arrays.toString(a));

	}
	   public static void  selectionSort(int [] a) {
		   int n = a.length-1;
		   for(int i =0;i<=n;i++) {
			   int min = a[i];
			   int index = i;
			   for(int j =i+1;j<a.length;j++) {
				   if(a[j]<min) {
					   min = a[j];
					   index = j;
				   }
			   }
			   a[index] = a[i];
			   a[i] =min;
		   }
	   }

}
