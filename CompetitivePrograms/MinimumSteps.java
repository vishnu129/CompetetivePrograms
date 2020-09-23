
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class MinimumSteps {

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     int no = sc.nextInt();
     while(no-- > 0)
     {
    	 
    	 int k = sc.nextInt();
    	 int m = sc.nextInt();
    	 int n = sc.nextInt();
    	 int count =0;
    	 while(k!=m)
    	 {
    	   int[] temp= new int [3];

           temp[0] = Math.abs(k * n - m);

           temp[1] = Math.abs(k - 2 - m);

           temp[2] = Math.abs(k - 1 - m);

           m = Math.min(temp[0], temp[1]);
           m = Math.min(m, temp[2]);

           if(m == temp[0])
               k = k * n;
           
           else if(m == temp[1])
               k = k - 2;

           else
               k = k - 1;

           count++;
    	 }
    	 System.out.println(count);
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

