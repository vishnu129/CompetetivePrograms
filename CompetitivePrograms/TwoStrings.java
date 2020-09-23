import java.util.Scanner;

public class TwoStrings 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
		
		int sum;
 		for(int i=0; i<n; i++)
		{
			String s1=sc.next().toLowerCase();
			String s2=sc.next().toLowerCase();
		    sum=0;
            int [] arr1 = new int[26];
		    int [] arr2 = new int[26];
			char[] str1 = s1.toCharArray();
			char[] str2 = s2.toCharArray();
			
			for(int j=0; j<str1.length; j++)
			{
				arr1[str1[j]-97]++;
				arr2[str2[j]-97]++;
			}
			
			for(int k=0;k<26;k++)
			{
				int s = Math.abs(arr2[k]-arr1[k]);
				sum += s;
			}
			if(sum==0) System.out.println("YES");
			else System.out.println("NO");
			
		}
        

   sc.close(); }
			
		
		
	}









