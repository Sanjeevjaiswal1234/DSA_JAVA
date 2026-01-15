package Assignment2;

public class Q19 {
    public static void main (String [] args ) {
    	int [] a = {1, 2, 3, 4, 5, 6, 7};
    	int k =3;
    	for(int i=0 ; i<=a.length-1; i++) {
			System.out.print(a[i]+ " ");
		}
    	System.out.println();
    	rightRotate(a,k);
    	for(int i=0 ; i<=a.length-1; i++) {
			System.out.print(a[i]+ " ");
		}
    }
    public static void rightRotate(int [] a, int k) {
    	k = k%a.length;
    	if(k==0)
    	return ;
    	reverse(a , 0, a.length-1);
    	reverse(a , 0, k-1);
    	reverse(a , k, a.length-1);
    	
    }
    public static void reverse(int [] a , int start ,int end) {
        while(start<end) {
        	int temp = a[start];
        	a[start] =a[end];
        	a[end] =temp;
        	start++; end--;
        }
        
    }
}
