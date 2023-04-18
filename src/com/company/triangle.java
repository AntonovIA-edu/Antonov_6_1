package com.company;

public class triangle implements Area{
    int cat1;
    int cat2;
    triangle(int cat1,int cat2){
        this.cat1=cat1;
        this.cat2=cat2;
    }
    public double calc_square(){
        return 0.5*cat2*cat1;
    }
}
