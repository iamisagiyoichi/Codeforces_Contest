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
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static void solve() throws Exception {
        int n = sc.nextInt();

        if ((n & 1) == 1) {
            int i = 0;
            while (i < n) {
                sc.nextInt();
                i++;
            }
            out.println("NO");
            return;
        }

        int c = 0;
        int i = 0;

        while (i < n) {
            if (sc.nextInt() == -1) {
                c++;
            }
            i++;
        }

        if ((c & 1) == ((n / 2) & 1)) {
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
