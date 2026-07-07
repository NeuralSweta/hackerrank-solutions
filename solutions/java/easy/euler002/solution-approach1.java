// ──────────────────────────────────────────────────
// Problem     Project Euler #2: Even Fibonacci numbers
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-07-07, 09:03 p.m.
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
            long n = in.nextLong();
            long first=1, second=2;
            long sum=0;
            while(first<=n){
            if(first%2==0)sum+=first;          
               long next= first+second;
                first=second;
                second=next;
            }
            System.out.println(sum);
        }
    }
}
