import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicNumber {
//least number to remove from an array to make sum divisible by 7
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<Integer>();
        long sum=0;
        for(int i=0; i<n; i++)
        {
            arr.add(sc.nextInt());
            sum +=arr.get(i);
        }
        for(int i:arr) System.out.print(i+" ");
        for(int i=0;i<n;i++)
        {
        	
        	if((sum-arr.get(i))%7 ==0)
        	{
        		arr2.add(arr.get(i));  
        	}
        }
        System.out.println();
        for(int i:arr2) System.out.print(i+" ");
       arr2.sort((a,b) -> a-b);
       
       if(arr2.isEmpty()) System.out.println("-1");
       else {
    	   int k = arr2.get(0);
    	   System.out.println(arr.indexOf(k));
       }
        
	sc.close();}

}
