package com.example;

public class SumCalculator {

    public int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be >= 1");
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }
}
