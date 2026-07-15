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
    
    // DSU Static Class
    
    static class DSU {
        int[] p, s;

        DSU(int n) {
            p = new int[n + 1];
            s = new int[n + 1];
            init(n);
        }

        void init(int n) {
            int a = 1;
            while (a <= n) {
                p[a] = a;
                s[a] = 1;
                a++;
            }
        }

        int find(int a) {
            if (p[a] == a) {
                return a;
            }
            p[a] = find(p[a]);
            return p[a];
        }

        void merge(int a, int b) {
            a = find(a);
            b = find(b);

            if (a == b) {
                return;
            }

            if (s[a] < s[b]) {
                int c = a;
                a = b;
                b = c;
            }

            p[b] = a;
            s[a] += s[b];
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static void connect(DSU a, int b, int c) {
        int d = 1;
        while (d + c <= b) {
            a.merge(d, d + c);
            d++;
        }
    }

    static boolean check(DSU a, int[] b) {
        int c = 1;
        while (c <= b.length) {
            if (a.find(c) != a.find(b[c - 1])) {
                return false;
            }
            c++;
        }
        return true;
    }

    public static void solve() throws Exception {
        // Code from Here
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] d = sc.nextIntArray(a);
        DSU e = new DSU(a);
        connect(e, a, b);
        connect(e, a, c);
        if (check(e, d)) {
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
