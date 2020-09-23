import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class ArraynymdivusingFastIO {

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     int n = sc.nextInt();
     int check =n/2;
     int arr1[] = new int [check];
     int arr2[] = new int [check];
     int arr3[] = new int [n];
     int j,digits;
     long sum=0;
     
     for(int i=0;i<n;i++)
     {
    	if(i<check) arr1[i] = sc.nextInt();
    	else 		
    		{
    		j=i-check;
    		arr2[j] = sc.nextInt();
    		}
     }
     for(int i=0; i<n; i++)
     {
      int holder;	 
     
    	 if(i<check)
    	 {
    		 holder = arr1[i];
    	     digits = (int)(Math.log10(holder)); 
    	     holder = (int)(holder/ (int)(Math.pow(10, digits))); 
    		  
    	     arr3[i] = holder;
    	 }
    	 else
    	 {
    		 j=i-check;
    		holder = arr2[j]%10;
    		arr3[i]=holder;
    	 }
     }
     for(int i=0; i<n;i++)
    	 {
    	 sum = (sum*10) + arr3[i];
    	 }
     if(sum%11==0) System.out.println("OUI");
     else  		   System.out.println("NON");
       
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

