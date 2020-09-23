import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class HackerearthCount 
{
	/*
	 * Input:
The first line will consists of one integer N denoting the length of string.
Next line will contain the string  containing only lower case characters.

Output:
Print one integer, denoting the number of times her friends can print "hackerearth" (without quotes).
	 */

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     int n = sc.nextInt(),count=0;;
     int [] arr = new int[26];
     String s = sc.next();
     for(int i=0; i<n; i++)
     {
    	 arr[s.charAt(i)-97]++;
     }
     boolean flag =true;
     while(flag)
     {
     if(arr[0]>=2 && arr[2] >=1 && arr[4] >=2 && arr[7] >=2 && arr[10] >=1 && arr[17] >=2 && arr[19] >=1)
     {
    	 count++;
    	 arr[0] =arr[0]-2;
    	 arr[2]--;
    	 arr[4] =arr[4]-2;
    	 arr[7] =arr[7]-2;
    	 arr[10]--;
    	 arr[17] =arr[17]-2;
    	 arr[19]--;
     }
     else
     {
    	 flag=false;
     }
     }
     System.out.println(count);
     
     
     
     
     
     
     
     /*
      hackerearth
      hh 2  7
      aa 2  0
      c  1  2
      k  1   10
      ee 2  4
      rr 2  17
      t  1  19
      */
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

