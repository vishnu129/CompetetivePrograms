import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BestIndexProb 
{

	public static void main(String args[] ) throws Exception 
	{
		
		FastReader sc = new FastReader();		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) 
		{
		arr[i] = sc.nextInt();
		}
		long max = Long.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) 
		{
		long sum = 0;
		int l = arr.length-i;
		int v = 1;
		int k = i;
		
		while(l>0) 
		{
		for(int j=0; j<v; j++) 
		{
		sum += (long)arr[k++];
		}
		v++;
		l -= v;
		}
		
		if(max<sum) max = sum;
		}
		
		System.out.println(max);
	
	}
   	
static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}
