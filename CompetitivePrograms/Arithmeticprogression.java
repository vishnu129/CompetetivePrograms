import java.util.Scanner;

public class Arithmeticprogression {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- >0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d =2*b,count=0;
			int sum =a+c;
			if(sum%2==0)
			{
				count = Math.abs((d-sum)/2);
			}
			else
			{
				int count1,count2;
				d = d+1;
				count1 = Math.abs((d-sum)/2);
				
				d = d-2;
				count2 = Math.abs((d-sum)/2);

				if(count1<count2)
				{
					count = count1+1;
					}
				else
				{
					count = count2+1;
					}
				
				
			}
			System.out.println(count);
		}
		sc.close();
	}

}


 



 



 


