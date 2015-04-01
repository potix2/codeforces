package com.potix2.codeforces.r337;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * B. Routine Problem
 *
 * http://codeforces.com/problemset/problem/337/B
 */
public class B {
    public static void main(String[] args) throws IOException {
        Program p = new Program();
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        //int a = 125, b= 992, c= 14, d= 25;

        p.run(a,b,c,d);
    }

    public static class Program {
        public void run(int a, int b, int c, int d) {
            int p = Math.abs(a * d - b * c);
            int q = Math.max(a * d, b * c);
            int g = gcd(p,q);
            p = g != 0 ? p / g : 0;
            q = g != 0 ? q / g : 1;
            System.out.println(String.format("%d/%d", p,q));
        }

        private int gcd(int m, int n) {
            return new BigInteger("" + m).gcd(new BigInteger("" + n)).intValue();
        }
    }
}