package org.hb.fib;

import java.util.HashMap;
import java.util.Map;

public class Fib {

    // --- Directions
    // Print out the n-th entry in the fibonacci series.
    // The fibonacci series is an ordering of numbers where
    // each number is the sum of the preceeding two.
    // For example, the sequence
    //  [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    // forms the first ten entries of the fibonacci series.
    // Example:
    //   fib(4) === 3

    private final Map<Integer, Integer> cache = new HashMap<>();

    public int fib(int n){
        if(n < 2) return n;

        int[] fibArr = {0 , 1};

        for(int i = 2; i <= n; i++){
            int fibN = fibArr[0] + fibArr[1];
            fibArr[0] = fibArr[1];
            fibArr[1] = fibN;
        }

        return fibArr[1];
    }

    public int fibRecursive(int n){
        if(n < 2) return n;

        if(cache.containsKey(n)) return cache.get(n);

        int result = fibRecursive(n -1) + fibRecursive(n - 2);

        cache.put(n, result);

        return result;
    }
}
