import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class StringGame {

	public static void main(String[] args) 
	{
		FastReader obj=new FastReader();

		int t=obj.nextInt();
		for (int i = 0; i <t ; i++)
		{
		String str=obj.next();
		boolean[] isit=new boolean[Character.MAX_VALUE];

		for (int j = 0; j <str.length() ; j++)
		{
		isit[str.charAt(j)]=true;
		}

		int count=0;

		for (int j = 0; j <isit.length ; j++)
		{
		if(isit[j]==true)
		{
		count++;
		}
		}

		if(count%2==0)
		{
		System.out.println("Player2");
		}
		else
		{
		System.out.println("Player1");
		}
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

