// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem?isFullScreen=true
// Problem     Recursion: Fibonacci Numbers
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-07-17, 10:40 a.m.
// Technique   top-down-memoization
// Time        O(n)
// Space       O(n)
// Trick       The code uses an integer array dp to store intermediate results, avoiding redundant recursive calls by checking if dp[n] is non-zero.
// Hint        dp array size n+1 prevents IndexOutOfBoundsException for input n.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static int fibonacci(int n) {
        // Complete the function.
       
        int[] dp= new int[n+1];
      return fibo(n,dp);
    }

    public static int fibo(int n, int[] dp){
        if(n==0 || n==1)return n;
        if(dp[n]!=0)return dp[n];
        dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
        
    }
}
