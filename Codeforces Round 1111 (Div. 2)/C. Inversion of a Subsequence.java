import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
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

        int[] a = new int[n];
        int[] b = new int[n];

        int i = 0;
        int s = 0;
        while (i < n) {
            a[i] = sc.nextInt();
            s += a[i];
            i++;
        }

        i = 0;
        int c = 0;
        while (i < n) {
            b[i] = sc.nextInt();
            if (b[i] == 1) {
                c++;
            }
            i++;
        }

        boolean same = true;
        i = 0;
        while (i < n) {
            if (a[i] != b[i]) {
                same = false;
                break;
            }
            i++;
        }

        if (same) {
            out.println(0);
            return;
        }

        if (s == 0) {
            out.println(-1);
            return;
        }

        int x = 0;
        i = 0;
        while (i < n) {
            if (a[i] != b[i] && a[i] == 1) {
                x++;
            }
            i++;
        }

        if ((x & 1) == 1) {
            out.println(1);
        } else if (c != n) {
            out.println(2);
        } else {
            out.println(-1);
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
