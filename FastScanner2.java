import java.io.*;
import java.util.StringTokenizer;
 
/**
 * Created by sabbir on 01/14/16.
 */
public class Main {
 
    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner(System.in);  
        long val = scanner.nextLong();
        String str = scanner.nextLine();
 
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.printf("%d\n", val);
        printWriter.printf("%d\n", str);
        printWriter.close();
    }
 
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
 
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
 
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
 
            return tokenizer.nextToken("\n");
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
         
        public long nextInt() {
            return Integer.parseInt(next());
        }
 
    }
}
SHARE THIS: