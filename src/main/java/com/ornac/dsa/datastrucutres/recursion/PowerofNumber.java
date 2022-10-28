package com.ornac.dsa.datastrucutres.recursion;

class PowerofNumber{
    public static void main(String[] args){
        PowerofNumber main = new PowerofNumber();
        var result = main.power(2,2);
        System.out.println(result);

    }

    public int power(int base, int exp){
        if(exp<1){
            return -1;
        }
        if(exp == 1)
        {
            return base;
        }
        return base * power(base, exp-1);
    }
}