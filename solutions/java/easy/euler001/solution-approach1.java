// ──────────────────────────────────────────────────
// Problem     Project Euler #1: Multiples of 3 and 5
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-06-27, 09:01 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(multiple(3,n)+multiple(5,n)-multiple(15,n));
        }
    }
    public static long multiple(long k, long n){
        long m= (n-1)/k;
        return k*m*(m+1)/2;
    }
}
