
	import java.util.*;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.lang.Math;

	public class DataBase 
	{
	   public static void main(String args[] ) throws Exception 
	   {

		   FastReader sc = new FastReader();
		
		int t , m , n ;
		
		LinkedList<String> attributes = new LinkedList<String>();
		LinkedList<String> touples = new LinkedList<String>();
		LinkedList<Integer> width = new LinkedList<Integer>();
		t = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
		  m = sc.nextInt();

	    	n = sc.nextInt();
		
		for(int j=0;j<m;j++)
		   	attributes.add(sc.next());
		
		for(int j=0;j<m*n;j++)
			touples.add(sc.next());
		
		for(int j=0;j<m;j++)
		{
		int l1 = attributes.get(j).length();
		int l2 = 1 ;
		
			for(int k=j; k<m*n; k=k+m)
			{
				if(l2 < touples.get(k).length())
					l2 = touples.get(k).length();
			}
		
		int maxi = Math.max(l1,l2);
		width.add(maxi + 2);
		
		}
		int q = 0;
		for(int j=0;j<=n+3;j++) 
		{   
		    if(j==0 || j==2 || j==n+3) 
		    {
		        System.out.print("+");      
		
		        for(int k:width) 
		        {
		
		            for(int p=0;p<k;p++)  System.out.print("-");
		            
		         System.out.print("+");
		
		        }
		            System.out.print("\n");
		    }
		
		    else {
		
		        System.out.print("| ");
		        if(j==1) 
		        {
		            int k=0;
		            for(int p:width) 
		            {      
		             System.out.print(attributes.get(k));      
		                for(int r=0;r<p-attributes.get(k).length()-1;r++)
		                     System.out.print(" ");
		
		             System.out.print("| ");
		             k++;
		             }
		         System.out.println();
		
		         }
		
		        else 
		        {
		       for(int p:width) 
		       {      
		        System.out.print(touples.get(q));     
		           for(int r=0;r<p-touples.get(q).length()-1;r++)
		               System.out.print(" ");
		
		        System.out.print("| ");
		        q++;
		           }
		       System.out.println();
		        }
		    }
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
	   




