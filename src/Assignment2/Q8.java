package Assignment2;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {6,1,1,1,7,7,1,1,1,1};
       int res = getMostConsucativeOnes(a);
       System.out.println("Get MostConsucative ones is :" +res);
	}
	public static int getMostConsucativeOnes(int [ ] a) {
		int finalcount =0;
		int tempcount = 0;
		for( int x : a) {
			if(x==1) {
				tempcount++;
				if(tempcount>finalcount) 
					finalcount = tempcount;	
			}
			else
				tempcount =0;
		}
		return finalcount;
	}

}
