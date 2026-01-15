package Assignment2;

public class Q31 {

	  public static void main(String[] args) {
      int [] a = {1,2 ,3,4,5,6,7,8,9};
      int [] b = {1,2,3,4,5,6,5,8,9};
      if(isSame(a , b ))
	  System.out.println("Both array are same");
      else
	  System.out.println("Not baby");
	  
	}
	public static Boolean isSame(int [] a , int[] b ) {
		int i ;
		int j ;
		for( i =0 ,j=0 ; i<=a.length-1 && j<=b.length-1 ;i++,j++) {
			if(a[i]!= b[j])
			return false;
							
		}
		return  true ;
		
	}

}
