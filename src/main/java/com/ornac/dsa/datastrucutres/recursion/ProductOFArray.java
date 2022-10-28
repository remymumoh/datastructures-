package com.ornac.dsa.datastrucutres.recursion;

import java.lang.reflect.Array;

public class ProductOFArray {
    public static void main(String[] args) {
        ProductOFArray main = new ProductOFArray();
        int[] myArray = {2, 4, 3, 1};
        var result = main.productOfArray(myArray,4);
        System.out.println(result);
    }

    public int productOfArray(int A[], int N) {
        if (N <= 0)
            return 1;
        return (productOfArray(A, N - 1) * A[N - 1]);
    }
}
