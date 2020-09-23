/*
 * n number of words will give..
 * a sentance is given.
 * from sentence create acronym but skip words given
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class AcronymMaker {
        
        public static void main(String args[] ) throws Exception 
        {
            FastReader sc = new FastReader();
            int n = sc.nextInt();
            StringBuffer ans = new StringBuffer();
            String [] dw = new String[n];
            for(int i=0; i<n;i++)
            {
            	dw[i]=sc.next().toUpperCase();
            }
            
            int l =sc.nextInt();
            String [] sent = new String[l];
            
          outer:  for(int i=0; i<l;i++)
            {
            	String check = sc.next().toUpperCase();
            	for(int j=0;j<n;j++)
            	{
            		if(check.equals(dw[j])) 
            		{
            			sent[i]="1";
            			continue outer;
            		}
            		
            	}
            	sent[i]=check;
            	ans.append(check.charAt(0));
            	if(i != l-1) ans.append(".");
            }
            if(ans.charAt((ans.length()-1)) =='.') ans.deleteCharAt((ans.length()-1));
            System.out.println(ans);
            
                 
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
            
