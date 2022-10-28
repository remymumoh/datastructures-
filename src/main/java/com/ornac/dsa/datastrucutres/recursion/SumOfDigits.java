package com.ornac.dsa.datastrucutres.recursion;

class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits main = new SumOfDigits();
        var result = main.sumOfDigits(111);
        System.out.println(result);
    }

    public int sumOfDigits(int n){
        if(n ==0 || n <0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}