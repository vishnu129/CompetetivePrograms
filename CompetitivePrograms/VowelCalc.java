import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
//formula ====>>> count + (string.length()-index)*(index+1) index of vowel in string
public class VowelCalc {

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     int n = sc.nextInt();
     while(n-- >0)
     {
    	 String s = sc.next();
    	 long count = 0;
    	 for(int j=0; j<s.length(); j++) {

    		 if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'
                 || s.charAt(j)=='A' || s.charAt(j)=='E' || s.charAt(j)=='I' || s.charAt(j)=='O' || s.charAt(j)=='U') 
    		 {
    		 count += (long)(s.length()-j)*(j+1);
    		 }
    	 
    	
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

