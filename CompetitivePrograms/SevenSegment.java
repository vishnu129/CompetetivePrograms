import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer; 

public class SevenSegment {

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     
     Map<Character, Integer> map = new HashMap<Character, Integer>();

     map.put('0',6);
     map.put('1',2);
     map.put('2',5);
     map.put('3',5);
     map.put('4',4);
     map.put('5',5);
     map.put('6',6);
     map.put('7',3);
     map.put('8',7);
     map.put('9',6);

     int n = sc.nextInt();
     
     for(int i=0; i<n; i++)
     {
     String s = sc.next();
     int sum = 0;

     for(int j=0; j<s.length(); j++) 
     {
     sum += (int)map.get(s.charAt(j)); //got the number of match sticks
     }
     int num = sum/2; // with 6 match sticks maximum 3 digits(111) no n/2
     
     if(sum%2==0) 
     {
     for(int k=0; k<num; k++) 
     {
     System.out.print("1"); // if even it will be all 1
     }
     }
     else 
     {
     System.out.print("7"); // odd 7 followed by 1
     for(int k=1; k<num; k++) 
     {
     System.out.print("1");
     }
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

