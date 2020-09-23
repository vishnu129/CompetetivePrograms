import java.util.Scanner;

public class EvenSumPairs
{
	public static void main(String args[] ) throws Exception {
	
	Scanner s=new Scanner(System.in);	
	int test=s.nextInt();	
	while(test-- >0)
	{	
		int n=s.nextInt();	
		int arr[]=new int[n];	
		int count=0;	
		for(int i=0;i<n;i++)
		{	
		arr[i]=s.nextInt();	
		}
		
		for(int i=0;i<n;i++)
		{	
			for(int j=i+1;j<n;j++)
			{	
				if((arr[i]+arr[j])%2==0 && arr[i]!=arr[j])	
					count++;	
			}
	 }
	System.out.println(count);

	s.close();}

}

}