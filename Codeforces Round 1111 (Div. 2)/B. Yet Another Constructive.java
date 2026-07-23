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
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static void solve() throws Exception {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long m = sc.nextLong();

        if (m == 1) {
            if (k == 1) {
                out.println("YES");
                int i = 0;
                while (i < n) {
                    out.print(1 + " ");
                    i++;
                }
                out.println();
            } else {
                out.println("NO");
            }
            return;
        }

        if (k > m) {
            out.println("NO");
            return;
        }

        out.println("YES");

        int i = 1;
        while (i <= n) {
            if (i % k == 0) {
                out.print((m - k + 1) + " ");
            } else {
                out.print(1 + " ");
            }
            i++;
        }
        out.println();
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
