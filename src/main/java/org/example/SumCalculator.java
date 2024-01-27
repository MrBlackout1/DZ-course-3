package org.example;

public class SumCalculator{
    int sum(int n){
        int result = 0;
        if (n <=0) {
            throw new IllegalArgumentException("Number must be greater then 0");
        }
        else {
            for (int i = 1; i <= n; i++) result += i;
        }
            return result;
    }
}
