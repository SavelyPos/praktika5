package com.company.r10;

public class recursion5 {
    public void rec(int n) {
        System.out.print(n % 10);
        if (n / 10 != 0)
            rec(n / 10);
        else
            return;
    }
}
