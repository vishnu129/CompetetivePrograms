import java.util.Scanner;
/*
 * You are required to enter a word that consists of  and 
 *  that denote the number of Zs and Os respectively. 
 * For example, words such as zzoooo and zzzoooooo 
 * are similar to word zoo but not the words such as zzooo and zzzooooo.
 */
public class ZooLetters {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 String s= sc.next().toLowerCase();
		 int f=0,g=0;
		
		 System.out.println(s);
		 char[] str = s.toCharArray();
		 
		 for(char c:str)
		 {
			 if(c=='z')
			 {
				 f++;
			 }
		 }
		 for(char c:str)
		 {
			 if(c=='o')
			 {
				 g++;
			 }
		 }
		 
		 if(f==g/2) System.out.println("True");
		 else System.out.println("False");
			 
	}

}
