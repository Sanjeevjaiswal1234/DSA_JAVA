package Assignment2;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = { 10 ,20 ,30 ,40 ,50 ,60 , 70 };
        int x= 1;
        int y= 5;
       swapTwoIndex(a , x , y);
      
      for(int i =0 ; i<=a.length-1; i++) {
    	 System.out.print(a[i]+ " ") ;
      }
	}
	public static void swapTwoIndex(int []  a , int x ,int y) {
		int temp = a[x];
		 a[1] = a[5];
		 a[5] = temp;
	
	}

}
