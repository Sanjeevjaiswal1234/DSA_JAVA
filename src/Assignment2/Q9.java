package Assignment2;

public class Q9 {

	public static void main(String[] args) {
	    int[] a = {6,1,1,1,7,7,7,1,1,1,1};
	    int k =7;
	       int res = getMostConsucativeN(a ,k);
	       System.out.println("Get MostConsucative k is :" +res);
		}
		public static int getMostConsucativeN(int [ ] a ,int k) {
			int finalcount =0;
			int tempcount = 0;
			for( int x : a) {
				if(x==k) {
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


