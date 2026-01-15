//For the given array of Strings, print and count
//all the Strings which has even number of
//characters.
package Assignment2;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String [] str = { "sanjeev", "uwxyz" ,"Mukesh","martin" ,"john"};
         printAndCountEvenSizedString(str);
	}
	public static void printAndCountEvenSizedString(String [] str) {
		int count =  0;
		for(String x: str) {
			if(x.length()%2 == 0) {
				System.out.println(x);
				count++;
			}
					
		}
		System.out.println("Total such string are :"+count);
	}

}
