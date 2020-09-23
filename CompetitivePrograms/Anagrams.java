import java.util.Scanner;

public class Anagrams 
{
	/*
	 * Given two strings, a and b , 
	 * that may or may not be of the same length,
	 *  determine the minimum number of character deletions required to make a and b anagrams.
	 *  Any characters can be deleted from either of the strings.
	 *  means delete char from strings that are not in both
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t>0) 
		{

		String a = sc.next().toLowerCase();

		String b = sc.next().toLowerCase();

		 

		int[] index = new int[256];

		for(int j = 0;j<a.length();j++) {

		index[a.charAt(j)]++;

		} 
		for(int j = 0;j<b.length();j++) {

		index[b.charAt(j)]--;

		} 
		int sum = 0;

		for(int j=0;j<index.length;j++) {

		sum+= Math.abs(index[j]);

		} System.out.println(sum);

		t--;
		
		}
	 }
	        
	}



