import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class MinistersGoldUsingGCD {
	
	 static long gcd(long a, long b) 
	    { 
	        if (a == 0) 
	            return b; 
	        return gcd(b % a, a); 
	    } 
	    static long findGCD(long arr[]) 
	    { 
	        long result = 0; 
	        for (long element: arr){ 
	            result = gcd(result, element); 
	  
	            if(result == 1) 
	            { 
	               return 1; 
	            } 
	        } 
	  
	        return result; 
	    } 

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     long N=sc.nextLong();
     long lcm=0;
     for(long i=0;i<N;i++){
         long x=sc.nextLong();
         if(x!=0){
             if(i==0)
                 lcm=x;
             else   
                 lcm=(lcm*x)/gcd(lcm,x);

         }
     }
     System.out.println(lcm);
    
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

