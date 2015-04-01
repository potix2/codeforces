package com.potix2.codeforces.r337;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A. Puzzles
 *
 * http://codeforces.com/problemset/problem/337/A
 */
public class A {
    public static void main(String[] args) throws IOException {
        Program p = new Program();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] pieces = new int[m];
        for (int i = 0; i < m; i++)
            pieces[i] = scanner.nextInt();

        Arrays.sort(pieces);
        p.run(n,m,pieces);
    }

    public static class Program {
        public void run(int n, int m, int[] f) {
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < m - n + 1; i++) {
                min = Math.min(min, f[i+n-1] - f[i]);
            }
            System.out.println(min);
        }
    }
}