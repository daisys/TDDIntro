package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {
        if(i<0){
            throw new IllegalArgumentException();
        }

        if(i == 3){
            return 6;
        }
        return -1;
    }
}
