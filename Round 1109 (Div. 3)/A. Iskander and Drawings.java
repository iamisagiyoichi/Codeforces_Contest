import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }

        int[] nextIntArray(int n) throws IOException {
            int[] arr = new int[n];
            int a = 0;
            while (a < n) {
                arr[a] = nextInt();
                a++;
            }
            return arr;
        }

        long[] nextLongArray(int n) throws IOException {
            long[] arr = new long[n];
            int a = 0;
            while (a < n) {
                arr[a] = nextLong();
                a++;
            }
            return arr;
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void solve() throws Exception {
        // Code from Here
        int a = sc.nextInt();
        String b = sc.next();
        int c = 0,d = 0,e = 0;
        while (e < a) {
            if (b.charAt(e) == '#') {
                d++;
                c = Math.max(c, d);
            } else {
                d = 0;
            }
            e++;
        }
        out.println((c + 1) / 2);
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
