 
 import java.io.BufferedReader; 
 import java.io.IOException; 
 import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer; 
//convert string to chars with only prime ascii values
 public class MagicWord {

 	public static void main(String[] args) 
 	{
      FastReader sc = new FastReader();
      int n = sc.nextInt();
      int [] primes ={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
    		  43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};
      
      while(n-- > 0)
      {
    	  int size = sc.nextInt();
    	  String s = sc.next();
    	  char [] str = s.toCharArray();
    	  for(int j=0; j<size;j++) 
    		  {
    		  int p =str[j];
    		  int diff = 50,diff2,holder=0;
    		  for(int i=0;i<primes.length;i++)
    		  {
    			  diff2 = Math.abs((p-primes[i]));
    			  if(diff2<diff) 
    				  {
    				  diff=diff2;
    				  holder=i;
    				  }
    		  }
    		  str[j] =(char)primes[holder];
    		  }
    	  for(char c: str) System.out.print(c);
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

