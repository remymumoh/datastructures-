package com.ornac.dsa.datastrucutres.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci main = new Fibonacci();
        var result = main.fib(10);

        System.out.println(result);

    }
    public int fib(int n) {
        if (n<0) {
            return -1;
        }
        if (n==0 || n==1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
