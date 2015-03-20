//package com.potix2.codeforces.r4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        Program p = new Program();
        MyScanner scanner = new MyScanner();
        int w = scanner.nextInt();
        p.run(w);
    }

    public static class Program {
        public void run(int w) {
            if ( w < 3 ) {
                System.out.print("NO");
                return;
            }

            for (int i = 2; i < w; i += 2) {
                if ( (w - i) % 2 == 0 ) {
                    System.out.print("YES");
                    return;
                }
            }
            System.out.print("NO");
        }
    }

    static class MyScanner {

        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException {
            if (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                while (line.isEmpty()) {
                    line = br.readLine();
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            String next = next();
            return Integer.parseInt(next);
        }

        private long nextLong() throws IOException {
            String next = next();
            return Long.parseLong(next);
        }
    }
}
