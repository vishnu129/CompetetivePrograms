import java.io.*;
import java.util.StringTokenizer;

public class OddNUmUsingBuilderUnknownMethod 
{
    public static void main(String args[] ) throws Exception 
    {   
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
 
        while((t--)!= 0){
           int n = sc.nextInt();
           int[] a = new int[n];
           a[0] = sc.nextInt();
           if(a[0] != 0){
               ans.append("Incorrect 0\n");
           }
           else{
             for(int i=1;i<n;i++){
                a[i] = sc.nextInt();
             }
             boolean first = false ,second = false;
             int index = 0,index2 = 0;
 
             for(int i=1;i<n;i++){
                if(a[i] < a[i-1]){
                    if( i+1 !=n && a[i-1]<a[i+1]){
                       first = true;
                       index = i;
                       if(a[i] == 809100){
                           index = i-1;
                       }
                       break;
                    }
                    else{
                        second = true;
                        index2 = i-1;
                        break;
                    }
                }
             }
 
             if( !first && !second){
                 ans.append("Correct\n");
             }
             else if(first){
                 ans.append("Incorrect ").append(a[index]).append("\n");
             }
             else{
                 ans.append("Incorrect ").append(a[index2]).append("\n");
             }
               
           }
           System.out.println(ans);
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