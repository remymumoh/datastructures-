package com.ornac.dsa.datastrucutres.recursion;

public class DecimaltoBinary {
    public static void main(String[] args) {
        DecimaltoBinary main = new DecimaltoBinary();
        var result = main.decimalToBinary(13);
        System.out.println(result);

    }

    public int decimalToBinary(int n){
        if(n == 0){
            return 0;
        }
        return n%2 + 10* decimalToBinary(n/2);
    }
}
