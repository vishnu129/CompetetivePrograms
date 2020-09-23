import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class CricketScoreBoard {

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
     int t = sc.nextInt();
     int c=0;
     while(t-- > 0)
     {
    	 c++;
    	 StringBuffer cas = new StringBuffer("Case ");
         
    	 int ov = sc.nextInt();
    	 int pl = sc.nextInt();
    	 int [] pls = new int[pl+1];
    	 int str =1,nstr=2,temp;
    	
    		 char [] runs = sc.next().toCharArray();
    		 int lim =runs.length;
    		 for(int j =0; j<lim;j++)
    		 {
    	     char r= runs[j];		 
    		 if(r=='1')
    		 {
    			 pls[str]++;
    			 temp =str;
    			 str=nstr;
    			 nstr=temp;		 ;
    		 }
    		 else if(r=='2')
    		 {
    			 pls[str] +=2;
    		 }
    		 else if(r=='4')
    		 {
    			 pls[str] +=4;
    		 }
    		 else if(r=='6')
    		 {
    			 pls[str] +=6;
    		 }
    		 else if(r=='W')
    		 {
    			 if(str>nstr) str =str+1;
    			 else str = nstr+1;
    		 }
    		 else if(r=='0')
    		 {
    		 }
    		 
    		 if((j+1)%6==0)
    		 {
    			 temp =str;
    			 str=nstr;
    			 nstr=temp;
    		 }
    		 
    		 
    		 }
    	 
    	 cas.append(c);
    	 cas.append(": ");
    	 System.out.println(cas);
    	 for(int i=1; i<=pl; i++)
    	 {
    		 StringBuffer player = new StringBuffer("Player ");
    		 player.append(i);
    		 player.append(": ");
    		 if(i==str)
    		 {
    			 player.append(pls[i]+"*");
    			 System.out.println(player);
    		 }
    		 else if(i==nstr)
    		 {
    			 player.append(pls[i]+"*");
    			 System.out.println(player);
    		 }
    		 else if(i>nstr && i>str)
    		 {
    			 player.append("DNB");
    			 System.out.println(player);
    		 }
    		 else
    		 {
    			 player.append(pls[i]);
    			 System.out.println(player);
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

