package com.company;

public class circle implements Area{
    int R;
    circle(int R){
        this.R = R;
    }
    public double calc_square(){
        return 2*3.14*R*R;
    }
}
