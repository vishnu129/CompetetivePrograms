import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class NumbersArraymean{

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     int n = sc.nextInt();
     long q = sc.nextInt();
     long [] arr = new long[n];
     for(int i=0; i<n; i++)
            arr[i]=sc.nextLong();

     long prefixSum[] = new long[n]; 
     Prefix.fillPrefixSum(arr, n, prefixSum); 
     
     for(int i=0; i<q; i++)
     {
         int l,r;
         l = sc.nextInt();
         r = sc.nextInt();
         long sum=0,ans=0;
         //long[] arr2 = new long[r-l+1];
         
         if(l==1) {
          sum= (prefixSum[r-1]);
          ans = sum/((r-l)+1);
         }
         else
         {
             sum = prefixSum[r-1] - prefixSum[l-2];
             ans = sum/((r-l)+1);
         }
         
         System.out.println((long)Math.floor(ans));
         
     }



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
    class Prefix { 
    // Fills prefix sum array 
    static void fillPrefixSum(long arr[], int n, long prefixSum[]) 
    { 
        prefixSum[0] = arr[0]; 
  
        // Adding present element 
        // with previous element 
        for (int i = 1; i < n; ++i) 
            prefixSum[i] = prefixSum[i - 1] + arr[i]; 
    } 
  
}


