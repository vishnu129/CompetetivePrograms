 
 import java.io.BufferedReader; 
 import java.io.IOException; 
 import java.io.InputStreamReader;
import java.util.StringTokenizer; 
 public class IntegerProblemCF {

 	public static void main(String[] args) 
 	{
      FastReader sc = new FastReader();
      int n = sc.nextInt();
      while(n-- >0)
      {
    	  String s;
    	 // s.charAt(arg0);
    	  int a = sc.nextInt();
    	  int b = sc.nextInt();
    	  int diff;
    	  if(a==b)
    	  {
    		  System.out.println("0");
    	  }
    	  else
    	  {
    		  diff = Math.abs(a-b);
    		  int count =0;
    		  if(diff%10==0) 
    		  {
    			  System.out.println(diff/10);
    		  }
    		  else
    		  {
    			  diff /= 10;
    			  count = diff +1;
    			  System.out.println(count);
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

