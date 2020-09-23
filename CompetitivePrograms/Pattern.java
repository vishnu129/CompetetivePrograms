import java.util.Scanner;

public class Pattern {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- >0)
		{
			int no = sc.nextInt();
			for(int i=0; i<no; i++)
			{	
					for(int k=0; k<=i; k++) System.out.print("*");
					for(int k=no-1; k>i; k--) System.out.print("#");	
					for(int k=no-1; k>i; k--) System.out.print("#");	
					for(int k=0; k<=i; k++) System.out.print("*");
				System.out.println();
			}
			System.out.println();
		}
	sc.close();
	}

}
