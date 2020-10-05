package com.company.r9;

public class recursion4 {
    public int rec(int a, int b) {
        if (a> b+1) return 0;
        if (a==0 || b==0) return 1;
        return rec(a,b-1)+rec(a-1,b-1);
    }
}