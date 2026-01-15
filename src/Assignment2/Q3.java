/*
 * For the given array of Strings, print the largest
   String.
 */
package Assignment2;

public class Q3 {

	public static void main(String[] args) {
		String [] str = {"fdfdfd" , "deedw" ,"ewew" ,"ewe" ,"ddsdssfdfe" ,"errttr"};
        
		String longest = getLargestString(str);
		System.out.println("Largest String is :" +longest);
	}
	public static String getLargestString(String [] str) {
		
		String Largest = str[0];
		for(String s : str) {
			if(s.length()> Largest.length()) {
				Largest = s;
			}
		}
		
		
		return Largest;
	}

}
