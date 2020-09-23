import java.io.*;
import java.util.StringTokenizer;

public class SameCalendarYear {
	

    public static void main(String args[] ) throws Exception {
        FastReader sc = new FastReader();
        Writer out = new Writer();
        int i,j,count=0;
        int n = sc.nextInt();
        i= n+1;
        j=leapyear(n);
        count =j+1;
        while(true)
        {
        if(leapyear(i)==j && count%7==0)
        {
         out.println(i);
         break;
        }
        count+=leapyear(i)+1;
        i++;
        }
        
        
        out.close();
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
		

	
public static class Writer {
	private BufferedWriter bw;
	 
	public Writer(){
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
	}
 
	public void print(Object o) throws IOException{
		bw.append(o.toString());
	}
 
	public void println(Object o) throws IOException{
		print(o + "\n");
	}
	
	public void println() throws IOException{
		print("\n");
	}
	
	public void flush() throws IOException{
	    bw.flush();
	}
	
	public void close() throws IOException {
		bw.close();
	}
}

static int leapyear(int n)
{
    if((n%400)==0)
        return 1;
    if((n%100)==0)
        return 0;
    if((n%4)==0)
        return 1;
    return 0;
}
}