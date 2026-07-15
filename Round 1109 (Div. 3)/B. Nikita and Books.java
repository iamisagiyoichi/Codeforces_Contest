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
            int[] a = new int[n];
            int b = 0;
            while (b < n) {
                a[b] = nextInt();
                b++;
            }
            return a;
        }

        long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            int b = 0;
            while (b < n) {
                a[b] = nextLong();
                b++;
            }
            return a;
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void solve() throws Exception {
        // Code from here
        int a = sc.nextInt();
        long[] b = sc.nextLongArray(a);
        long c = 0,d = 0;
        int e = 0;
        while (e < a - 1) {
            long f = b[e] + c;
            long g = d + 1;
            if (f < g) {
                out.println("NO");
                return;
            }
            c = f - g;
            d = g;
            e++;
        }
        long h = b[a - 1] + c;
        if (h > d) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
