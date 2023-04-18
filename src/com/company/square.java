package com.company;

public class square implements Area {
    int a;
    int b;
    square(int a, int b){
        this.a=a;
        this.b=b;
    }
    public double calc_square(){
        return a*b;
    }
}
