    import java.io.IOException;
    import java.io.DataInputStream;
   public class CardGameUsingFasterReader {
        
        public static void main(String args[] ) throws Exception {
            FastReader reader = new FastReader();
            StringBuilder sb = new StringBuilder();
            int t = reader.nextInt();
            while(t-- > 0){
                long n = reader.nextLong();
                long current_Card = n;
                long multiplier = 1;
                boolean wasPreviousOdd = false;
                for(long i = n; i > 1; i >>= 1){
                    multiplier <<= 1;
                    if((i & 1) == 1){
                        current_Card = (wasPreviousOdd) ? current_Card + multiplier : multiplier;
                        wasPreviousOdd = true;
                    }
                }
                sb.append(current_Card).append('\n');
            }
            System.out.print(sb);
            reader.close();
        }
        
        private static class FastReader{
            final private int BUFFER_SIZE = 1 << 16;
            private byte[] buffer;
            private DataInputStream din;
            private int bufferPointer, bytesRead;
            
            public FastReader(){
                buffer = new byte[BUFFER_SIZE];
                din = new DataInputStream(System.in);
                bufferPointer = bytesRead = 0;
            }
            
            private String nextLine() throws IOException{
                StringBuilder sb = new StringBuilder();
                byte c;
                while((c = read()) != -1 && c != '\n'){
                    sb.appendCodePoint(c);
                }
                return sb.toString();
            }
            
            private int nextInt() throws IOException{
                int ret = 0;
                byte c = read();
                while(c <= ' '){
                    c = read();
                }
                boolean neg = c == '-';
                if(neg){
                    c = read();
                }
                while(c >= '0' && c <= '9'){
                    ret = ret * 10 + c - '0';
                    c = read();
                }
                return (neg) ? -ret : ret;
            }
            
            private long nextLong() throws IOException{
                long ret = 0;
                byte c = read();
                while(c <= ' '){
                    c = read();
                }
                boolean neg = c == '-';
                if(neg){
                    c = read();
                }
                while(c >= '0' && c <= '9'){
                    ret = ret * 10 + c - '0';
                    c = read();
                }
                return (neg) ? -ret : ret;
            }
            
            private double nextDouble() throws IOException{
                double ret = 0, div = 1;
                byte c = read();
                while(c <= ' '){
                    c = read();
                }
                boolean neg = c == '-';
                if(neg){
                    c = read();
                }
                while(c >= '0' && c <= '9'){
                    ret = ret * 10 + (c - '0');
                    c = read();
                }
                if(c == '.'){
                    while((c = read()) >= '0' && c <= '9'){
                        ret += (c - '0') / (div *= 10);
                    }
                }
                return (neg) ? -ret : ret;
            }
            
            private void fillBuffer() throws IOException{
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if(bytesRead == -1){
                    buffer[0] = -1;
                }
            }
            
            private byte read() throws IOException{
                if(bufferPointer == bytesRead){
                    fillBuffer();
                }
                return buffer[bufferPointer++];
            }
            
            private void close() throws IOException{
                if(din != null){
                    din.close();
                }
            }
            
        }
    }