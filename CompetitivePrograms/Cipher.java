import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class TestClass
{

public static void main(String args[] ) throws Exception 
{
	FastReader s = new FastReader();

	String str=s.next();
	int no=s.nextInt();	
	int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			char c=str.charAt(i);
		
		if(Character.isLetter(c))
		{
		int l=c;
		
		if(l>=97 && l<=122)
		{
			int k=l;   
			k=k-97+no;//get the num to 26 and add key 
			k=k%26;  // find num required to delete make divisible by 26
			k=k+97; //adding that to 97 gives the required value
		    System.out.print((char)k);
		}
		
		else
		{
		int k=l;  
		k=k-65+no;  
		k=k%26;  
		k=k+65;
		System.out.print((char)k);}
		
		}
		
		else if(Character.isDigit(c))
		{
		int k=Character.getNumericValue(c);
		int h=k+no;
		System.out.print(h%10);
		}
		
		else
		{
		System.out.print(c);
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

