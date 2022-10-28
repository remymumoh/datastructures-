package com.ornac.dsa.datastrucutres.recursion;

public class Power {
    public static void main(String[] args) {
        Power main = new Power();
        var result = main.power(2, 2);
        System.out.println(result);

    }

    public int power(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        return base* power(base, exponent-1);
    }
}
