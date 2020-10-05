package com.company.r7;

public class recursion2 {
    int div = 2;
    private int n;
    public recursion2(int n)
    {
        if (n > 1) {
            this.n = n;
            Rec(n);
        }

        else System.out.println("Число должно быть > 1");
    }


    public int Rec(int n)
    {
        int cnt = 0;
        int tmp = 0;
        int divisior = div;
        for (int i = 2; i < divisior+1; i++)
        {
            tmp = i;
            if(divisior % i == 0)
            {
                cnt++;
            }
        }
        if (cnt == 1) {
            System.out.print(tmp + " ");
        }
        this.n--;
        if(this.n>1)
            return Rec(++div);
        else
            return 0;
    }
}