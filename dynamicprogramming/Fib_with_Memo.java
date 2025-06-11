package dynamicprogramming;

import java.util.Arrays;

public class Fib_with_Memo {
    static int counter=0;
    static Integer[] memo = new Integer[100];

    public static int fib(int n){
        counter++;
        if(memo[n] != null) return memo[n];
        if(n==0 || n==1 ) return n;
        memo[n] = fib(n-1) +fib(n-2);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fin of "+n+" :"+fib(n));
        System.out.println("Counter :"+counter);
    }
}
