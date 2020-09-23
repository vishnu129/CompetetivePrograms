import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalTime;
import java.util.StringTokenizer; 

public class TimeCalc {

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     int n = sc.nextInt();
     
     while(n-- >0)
     {
    	 LocalTime st = LocalTime.of(sc.nextInt(), sc.nextInt());
    	 LocalTime et = LocalTime.of(sc.nextInt(), sc.nextInt());
    	 Duration t = Duration.between(st, et);
         
    	 System.out.println(t.toHours() +" "+ (t.toMinutes()-(t.toHours()*60)));    	 
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

