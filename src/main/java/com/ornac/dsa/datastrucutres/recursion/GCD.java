package com.ornac.dsa.datastrucutres.recursion;

public class GCD {
    public static void main(String[] args) {
        //step 1
        //euclidean Algorithm
        //Step 1 48/18 = 2 remainder 12
        //step 2: 18/12 = 1 remainder 6
        //step 3: 12/6 = 2 remainder 0
        GCD main = new GCD();
        var result = main.gcd(48, 18);
        System.out.println(result);
    }


    public int gcd(int a, int b) {
        if(a<0 || b<0){
            return -1;
        }
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
