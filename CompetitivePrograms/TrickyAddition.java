import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class TrickyAddition {

	public static void main(String[] args) 
	{
     FastReader sc = new FastReader();
		StringBuilder sb = new StringBuilder();
		 int t = sc.nextInt();
		while (t-- > 0)
		{
			String n1 = sc.next();
			String n2 = sc.next();

			int carry = 0;
			int i = 0;
			int j = 0;

			boolean isLastCarry = false;

			while (i <= n1.length()-1 || j <= n2.length()-1) {
				int sum = 0;

				if (i <= n1.length()-1) {
					sum += (n1.charAt(i) - '0');
				}

				if (j <= n2.length()-1) {
					sum += (n2.charAt(j) - '0');
				}

				sum += carry;

				if (sum > 9) {
					carry = sum % 10;
					sum /= 10;
					isLastCarry = true;
				} else {
					carry = 0;
					isLastCarry = false;
				}

				sb.append(sum);
				i++;
				j++;
			}

			if(isLastCarry) {
				sb.append(carry);
			}

			System.out.println(sb.toString());
			sb.delete(0, sb.length());
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

