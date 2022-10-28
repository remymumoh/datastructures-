package com.ornac.dsa.datastrucutres.recursion;

public class Recursiverange {
    public static void main(String[] args) {
        Recursiverange main = new Recursiverange();
        var result = main.recursiveRange(3);
        System.out.println(result);
    }

    public int recursiveRange(int num){
        if(num<=0){
            return 0;
        }
        return num + recursiveRange(num -1);
    }
}
