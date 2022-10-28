package com.ornac.dsa.datastrucutres.recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial main = new Factorial();
        var result = main.factorial(4);
        System.out.println(result);
    }

    public int factorial(int num){
        if(num<=1){
            return 1;
        }
        return num* factorial(num -1);
    }
}
