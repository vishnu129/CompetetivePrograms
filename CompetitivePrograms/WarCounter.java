import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

/*
 * Bob and Khatu are brave soldiers in World War 3. 
 * They have spotted an enemy troop which is planting bombs. 
 * They sent message to the command centre containing characters W and B where W 
 * represents a wall and B represents a Bomb. They asked command to
 *  tell them how many walls will 
 * be destroyed if all bombs explode at once. One bomb can destroy 2 walls on both sides.
 */

public class WarCounter {

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     int n = sc.nextInt();
     while(n-- > 0)
     {
    	 String s = sc.next().toUpperCase();
    	 int l = s.length();
    	 char [] arr = s.toCharArray();
    	 int count =0,temp=-1;;
    	 for(int i=0; i<l; i++)
    	 {
    		// System.out.println(arr[i]+" in 29");
    		 if(arr[i]=='B')
    		 {
    			// System.out.println(arr[i]+" in 32");
    			 if(i>0 && arr[i-1]=='W')
    			 {
    				// System.out.println(arr[i-1]+" in 35");
    				 arr[i-1]='x';
    				 count++;
    				 if(i-1>0 && i-1 != temp ) 
    				 {
    					// System.out.println(arr[i-2]+" in 39");
    					 if(arr[i-2]=='W' && i-2 != temp)
    						 {
    						 arr[i-2] ='x';
    						 count++;
    						 }
    				 }
    			 }
    			 if(i <l-1 && arr[i+1]=='W')
    			 {
    				// System.out.println(arr[i+1]+" in 45");
    				 count++;
    				 arr[i+1]='x';
    				 if(i+1 < l-1) 
    				 {    				
    					// System.out.println(arr[i+2]+" in 49");
    					 if(arr[i+2]=='W') 
    						 {
    						 count++;
    					     arr[i+2]='x';
    					     i++;
    						 }
    				 }
    				 i++;
    			 }
    		 }
    		 else
    		 {
    			 continue;
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

