package com.potix2.codeforces.r1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A. Theatre Square
 *
 * http://codeforces.com/problemset/problem/1/A
 */
public class A {
    public static void main(String[] args) throws IOException {
        Program p = new Program();
        MyScanner scanner = new MyScanner();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();

        p.run(n,m,a);
    }

    public static class Program {
        public void run(int n, int m, int a) {
            long count = (long)(Math.ceil((double)n / a) * Math.ceil((double)m / a));
            System.out.print(count);
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