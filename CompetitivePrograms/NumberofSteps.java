import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
/*You are given two arrays  a and b . In each step, you can set b-a if  .
Determine the minimum number of steps that are required to make all a's equal.
*/
public class NumberofSteps {

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     int n = sc.nextInt();
     int[] arr1 = new int[n];

     int[] arr2 = new int[n];

     int min = Integer.MAX_VALUE;

     for(int i=0; i<n; i++) 
     {
     arr1[i] = sc.nextInt();
     min = Math.min(min, arr1[i]); //minimum value in array is found
     }
     for(int i=0; i<n; i++) 
     {
     arr2[i] = sc.nextInt();
     }

     boolean notSame = true;
     int count = 0;
     
     while(notSame) 
     {
     notSame = false;
     for(int i=0; i<n; i++) 
     {
     while(arr1[i]>min && arr2[i]!=0) //if a value is greater that min b is subtracted till its equal or less tha min
     {
     arr1[i] = arr1[i]-arr2[i];
     notSame = true;
     count++;
     }

     if(min>arr1[i]) min = arr1[i]; //if new value is less than min then its taken as new min

     if(min<0) break;

     }

     }

     if(min<0) System.out.println(-1);
     else System.out.println(count);      
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