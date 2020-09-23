import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
 
public class MatrixProb {
 
	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     int n = sc.nextInt();
     int mat [][] = new int [n][n];
     int x =sc.nextInt(), y=sc.nextInt();
     int p = sc.nextInt();
     for(int i=0; i<n; i++) {
 
    	 for(int j=0; j<n; j++) 
    	 {
    	 int val = p - Math.max(Math.abs(x-i), Math.abs(y-j));
    	 if(val<0) System.out.print("0 ");
    	 else System.out.print(val+" ");
    	 }
 
    	 System.out.println();
 
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